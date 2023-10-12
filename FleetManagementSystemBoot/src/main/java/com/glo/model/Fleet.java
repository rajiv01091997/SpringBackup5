package com.glo.model;

public class Fleet {

	private long fleetId;
	private String origin;
	private String destination;
	
	public Fleet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fleet(long fleetId, String origin, String destination) {
		super();
		this.fleetId = fleetId;
		this.origin = origin;
		this.destination = destination;
	}
	
	
	public long getFleetId() {
		return fleetId;
	}

	public void setFleetId(long fleetId) {
		this.fleetId = fleetId;
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
		return "Fleet [fleetId=" + fleetId + ", origin=" + origin + ", destination=" + destination + "]";
	}
	
	
	

}
