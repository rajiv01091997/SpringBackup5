package com.gloLogistic;

import java.util.List;

public class Freight {
int orderId;
Address origin;
String destination;
List<String> items;

public Freight() {
	super();
	// TODO Auto-generated constructor stub
}

public Freight(int orderId, Address origin, String destination, List<String> items) {
	super();
	System.out.println("inside Freight constructor");
	this.orderId = orderId;
	this.origin = origin;
	this.destination = destination;
	this.items = items;
}

public int getOrderId() {
	
	return orderId;
}

public void setOrderId(int orderId) {
	System.out.println("inside order setter");
	this.orderId = orderId;
}

public Address getOrigin() {
	return origin;
}

public void setOrigin(Address origin) {
	System.out.println("inside origin setter");
	this.origin = origin;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	System.out.println("inside destination setter");
	this.destination = destination;
}

public List<String> getItems() {
	return items;
}

public void setItems(List<String> items) {
	this.items = items;
}

@Override
public String toString() {
	return "Freight [orderId=" + orderId + ", origin=" + origin + ", destination=" + destination + ", items=" + items
			+ "]";
}


}
