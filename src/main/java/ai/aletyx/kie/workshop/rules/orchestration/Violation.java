package ai.aletyx.kie.workshop.rules.orchestration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Violation {

	@JsonProperty("Code")
	private String code;

	// @JsonProperty("Date")
	// private LocalDate date;

	@JsonProperty("Date")
	private Date date;

	@JsonProperty("Type")
	private String type;

	@JsonProperty("Speed Limit")
	private BigDecimal speedLimit;

	@JsonProperty("Actual Speed")
	private BigDecimal actualSpeed;

	public Violation() {
	}

	// public Violation(String code, LocalDate date, String type, BigDecimal
	// speedLimit, BigDecimal actualSpeed) {
	// this.code = code;
	// this.date = date;
	// this.type = type;
	// this.speedLimit = speedLimit;
	// this.actualSpeed = actualSpeed;
	// }

	// public LocalDate getDate() {
	// return date;
	// }

	// public void setDate(LocalDate date) {
	// this.date = date;
	// }

	public Violation(String code, Date date, String type, BigDecimal speedLimit, BigDecimal actualSpeed) {
		this.code = code;
		this.date = date;
		this.type = type;
		this.speedLimit = speedLimit;
		this.actualSpeed = actualSpeed;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public BigDecimal getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(BigDecimal speedLimit) {
		this.speedLimit = speedLimit;
	}

	public BigDecimal getActualSpeed() {
		return actualSpeed;
	}

	public void setActualSpeed(BigDecimal actualSpeed) {
		this.actualSpeed = actualSpeed;
	}
}
