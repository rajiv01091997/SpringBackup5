package com.glo.model;

public class Freight {
	
	int orderId;
	String origin;
	String destination;
	
	
	public Freight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Freight(int orderId, String origin, String destination) {
		super();
		this.orderId = orderId;
		this.origin = origin;
		this.destination = destination;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Freight [orderId=" + orderId + ", origin=" + origin + ", destination=" + destination + "]";
	}
	
	

}
