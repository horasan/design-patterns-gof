package com.horasan.cs_design_patterns.creational.builder;

public class Person {
	
	// address info
	public String streetAddress, postcode, city;
	
	// employment info
	public String companyName, position;
	public int annualIncome;
	
	@Override
	public String toString() {
		return "Person [streetAddress=" + streetAddress + ", postcode=" + postcode + ", city=" + city + ", companyName="
				+ companyName + ", position=" + position + ", annualIncome=" + annualIncome + "]";
	}
	
}
