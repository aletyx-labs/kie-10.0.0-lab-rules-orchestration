package ai.aletyx.kie.workshop.rules.orchestration;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class TrafficProcessTest {

    public static final int SPEED_LIMIT = 100;

    @Test
    public void testTrafficViolationEmbeddedDecisionOnQuarkus() {
        testTrafficProcess("traffic", "12345", 120, "No", true);
        testTrafficProcess("traffic", "12345", 140, "No", true);
        testTrafficProcess("traffic", "1234", 140, null, false);
    }

    private void testTrafficProcess(String processId, String driverId, int speed, String suspended, Boolean validLicense) {
        Map<String, Object> request = new HashMap<>();
        request.put("driverId", driverId);
        request.put("violation", new Violation("anycode", "speed", SPEED_LIMIT, speed));
        given()
                .body(request)
                .contentType(ContentType.JSON)
                .when()
                .post("/" + processId)
                .then()
                .statusCode(201)
                .body("suspended", is(suspended))
                .body("driver.validLicense", is(validLicense));
    }
}