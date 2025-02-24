package ai.aletyx.kie.workshop.rules.orchestration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Violation")
public class Violation {

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Speed Limit")
    private int speedLimit;

    @JsonProperty("Actual Speed")
    private int actualSpeed;

    public Violation() {
    }

    public Violation(String code, String type, int speedLimit, int actualSpeed) {
        this.code = code;
        this.type = type;
        this.speedLimit = speedLimit;
        this.actualSpeed = actualSpeed;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    @Override
    public String toString() {
        return "Violation [code=" + code + ", type=" + type + ", speedLimit=" + speedLimit + ", actualSpeed="
                + actualSpeed + "]";
    }
}
