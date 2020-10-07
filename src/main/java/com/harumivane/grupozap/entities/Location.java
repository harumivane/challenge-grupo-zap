package com.harumivane.grupozap.entities;

public class Location {
	
	private Double lon;
	private Double lan;
	
	public Location() {
	}

	public Location(Double lon, Double lan) {
		super();
		this.lon = lon;
		this.lan = lan;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Double getLan() {
		return lan;
	}

	public void setLan(Double lan) {
		this.lan = lan;
	}
}
