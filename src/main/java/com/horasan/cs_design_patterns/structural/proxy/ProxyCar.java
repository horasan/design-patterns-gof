package com.horasan.cs_design_patterns.structural.proxy;

public class ProxyCar extends Car {

	public ProxyCar(Driver d) {
		super(d);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drive() {
		if (this.d.age < 16) {
			System.out.println("Driver too young!");
		} else {
			super.drive();
		}
	}

}
