package com.harumivane.grupozap.entities;

import com.harumivane.grupozap.enums.BusinessType;

public class PricingInfos {
	
	private Double yearlyIptu;
	private Double price;
	private BusinessType businessType;
	private Double monthlyCondoFee;
	
	public PricingInfos() {
	}

	public PricingInfos(Double yearlyIptu, Double price, BusinessType businessType, Double monthlyCondoFee) {
		super();
		this.yearlyIptu = yearlyIptu;
		this.price = price;
		this.businessType = businessType;
		this.monthlyCondoFee = monthlyCondoFee;
	}

	public Double getYearlyIptu() {
		return yearlyIptu;
	}

	public void setYearlyIptu(Double yearlyIptu) {
		this.yearlyIptu = yearlyIptu;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public BusinessType getBusinessType() {
		return businessType;
	}

	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	public Double getMonthlyCondoFee() {
		return monthlyCondoFee;
	}

	public void setMonthlyCondoFee(Double monthlyCondoFee) {
		this.monthlyCondoFee = monthlyCondoFee;
	}
}
