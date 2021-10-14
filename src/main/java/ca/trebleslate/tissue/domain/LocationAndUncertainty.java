package ca.trebleslate.tissue.domain;

import java.math.BigDecimal;

public class LocationAndUncertainty {
	BigDecimal latitude;
	BigDecimal longitude;
	BigDecimal uncertainty;
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getUncertainty() {
		return uncertainty;
	}
	public void setUncertainty(BigDecimal uncertainty) {
		this.uncertainty = uncertainty;
	}
	
}
