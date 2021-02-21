package com.horasan.cs_design_patterns.creational.prototype;

public class PrototypeRunner {

	public static void main(String[] args) {
		// we need deep copy.
		// clonable interface does not force deep copy.
		Person michael = new Person(new String [] {"michael, jackson"}, new Address("London Ave.", 97));
		
		Person michaelX = new Person(michael);
		michaelX.names[0] = "michaelX";
		
		System.out.println(michael.toString());
		System.out.println(michaelX.toString());

	}

}
