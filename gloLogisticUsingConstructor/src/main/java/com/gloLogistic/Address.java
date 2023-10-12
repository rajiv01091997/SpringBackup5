package com.gloLogistic;

public class Address {
	String streetName;
	int pin;
	
	
	public Address(String streetName, int pin) {
		super();
		System.out.println("inside address constructor");
		this.streetName = streetName;
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pin=" + pin + "]";
	}
	
	

}
