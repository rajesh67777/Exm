package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(schema = "test16")
public class Fare {

	@Id
	@GeneratedValue
	private int fareId;
	private String currency;
	private double fare;
	
	
	public Fare() {
		// TODO Auto-generated constructor stub
	}
   
	public Fare(String currency, double fare) {
		super();
		
		this.currency = currency;
		this.fare = fare;
	}

	public int getFareId() {
		return fareId;
	}


	public void setFareId(int fareId) {
		this.fareId = fareId;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public double getFare() {
		return fare;
	}


	public void setFare(double fare) {
		this.fare = fare;
	}


	


	@Override
	public String toString() {
		return "Fare [fareId=" + fareId + ", currency=" + currency + ", fare=" + fare + "]";
	}

	
}
