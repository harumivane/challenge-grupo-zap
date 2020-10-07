package com.harumivane.grupozap.entities;

public class GeoLocation {

	private String precision;
	private Location location;
	
	public GeoLocation() {
	}

	public GeoLocation(String precision, Location location) {
		super();
		this.precision = precision;
		this.location = location;
	}

	public String getPrecision() {
		return precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
