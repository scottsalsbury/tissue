package ca.trebleslate.tissue.domain;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeAndUncertainty {
	private LocalDateTime time;
	private Duration uncertainty;
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Duration getUncertainty() {
		return uncertainty;
	}
	public void setUncertainty(Duration uncertainty) {
		this.uncertainty = uncertainty;
	}
	
}
