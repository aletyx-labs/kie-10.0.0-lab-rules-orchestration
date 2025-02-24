package ai.aletyx.kie.workshop.rules.orchestration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fine implements java.io.Serializable {

    @JsonProperty("Amount")
    private int amount;

    @JsonProperty("Points")
    private int points;

    public Fine() {
    }

    public Fine(int amount, int points) {
        this.amount = amount;
        this.points = points;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
