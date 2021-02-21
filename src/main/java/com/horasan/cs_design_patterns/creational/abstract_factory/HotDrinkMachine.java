package com.horasan.cs_design_patterns.creational.abstract_factory;

public class HotDrinkMachine {
	
	public IDrinkable giveMe(String drinkName) {
		if (drinkName.equals("TEA")) {
			return new TeaFactory().prepare();
		}
		if (drinkName.equals("COFFEE")) {
			return new CoffeeFactory().prepare();
		}
		return null;
	}

}
