package com.horasan.cs_design_patterns.creational.abstract_factory;

public class AbsFactoryRunner {
	public static void main(String[] args) {
		HotDrinkMachine mac = new HotDrinkMachine();
		System.out.println(mac.giveMe("TEA").consume());
	}
}
