package com.horasan.cs_design_patterns.creational.abstract_factory;

public class CoffeeFactory implements IDrinkableFactory {

	public IDrinkable prepare() {
		System.out.println("Added sugar and milk.");
		return new Coffee();
	}

}
