package com.horasan.cs_design_patterns.structural.proxy;

public class ProxyRunner {

	public static void main(String [] args) {
		Car c = new ProxyCar(new Driver(12));
		c.drive();
	}
	
}
