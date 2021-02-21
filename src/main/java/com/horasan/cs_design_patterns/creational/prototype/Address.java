package com.horasan.cs_design_patterns.creational.prototype;

public class Address {
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseNumber=" + houseNumber + "]";
	}

	public String streetName;
	public int houseNumber;
	
	public Address(String streetName, int houseNumber) {
		this.streetName = streetName;
		this.houseNumber = houseNumber;
	}
	
}
