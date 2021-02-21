package com.horasan.cs_design_patterns.creational.abstract_factory;

public class TeaFactory implements IDrinkableFactory {

	public IDrinkable prepare() {
		System.out.println("Added just sugar");
		return new Tea();
	}

}
