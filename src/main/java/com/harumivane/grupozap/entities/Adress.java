package com.harumivane.grupozap.entities;

public class Adress {
	
	private String city;
	private String neighborhood;
	private GeoLocation geoLocation;

	public Adress() {
	}

	public Adress(String city, String neighborhood, GeoLocation geoLocation) {
		super();
		this.city = city;
		this.neighborhood = neighborhood;
		this.geoLocation = geoLocation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}
}
