package com.glo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="FreightLatest")
public class Freight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
