package com.horasan.cs_design_patterns.behavioral.observer;

public class HousingAgency implements Observer<House> {

	@Override
	public void handle(PropertyChangedEventArgs<House> args) {
		System.out.println("I am handling price change!");
	}

}
