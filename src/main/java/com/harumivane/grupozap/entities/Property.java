package com.harumivane.grupozap.entities;

import java.util.Date;
import java.util.List;

public class Property {
	
	private Integer usableAreas;
	private String listingType;
	private Date createdAt;
	private String listingStatus;
	private Long id;
	private Integer parkingSpaces;
	private Date updatedAt;
	private Boolean owner;
	private List<String> images;
	private Adress address;
	private Integer bathrooms; 
	private Integer bedrooms;
	private PricingInfos pricingInfos;
	
	public Property() {
	}

	public Property(Integer usableAreas, String listingType, Date createdAt, String listingStatus, Long id,
			Integer parkingSpaces, Date updatedAt, Boolean owner, List<String> images, Adress address,
			Integer bathrooms, Integer bedrooms, PricingInfos pricingInfos) {
		super();
		this.usableAreas = usableAreas;
		this.listingType = listingType;
		this.createdAt = createdAt;
		this.listingStatus = listingStatus;
		this.id = id;
		this.parkingSpaces = parkingSpaces;
		this.updatedAt = updatedAt;
		this.owner = owner;
		this.images = images;
		this.address = address;
		this.bathrooms = bathrooms;
		this.bedrooms = bedrooms;
		this.pricingInfos = pricingInfos;
	}

	public Integer getUsableAreas() {
		return usableAreas;
	}

	public void setUsableAreas(Integer usableAreas) {
		this.usableAreas = usableAreas;
	}

	public String getListingType() {
		return listingType;
	}

	public void setListingType(String listingType) {
		this.listingType = listingType;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getListingStatus() {
		return listingStatus;
	}

	public void setListingStatus(String listingStatus) {
		this.listingStatus = listingStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(Integer parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getOwner() {
		return owner;
	}

	public void setOwner(Boolean owner) {
		this.owner = owner;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	public Integer getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Integer getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}

	public PricingInfos getPricingInfos() {
		return pricingInfos;
	}

	public void setPricingInfos(PricingInfos pricingInfos) {
		this.pricingInfos = pricingInfos;
	}
}
