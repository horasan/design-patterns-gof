package com.horasan.cs_design_patterns.creational.builder;

public class Builder {
	/*
	 * Sample from jdk: StringBuilder
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBuilder pb = new PersonBuilder();
		
		// fluent builder with facade
		Person person = pb
				.lives()
					.at("123 London Road")
					.withPostcode("SM3 5EP")
				.works()
					.at("My Company")
					.asA("developer")
				.build();

		System.out.println(person.toString());

	}

}
