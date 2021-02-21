package com.horasan.cs_design_patterns.creational.FactoryMethod;

public class FactoryMethod {

	public static void main(String[] args) {
		Point pointCart = Point.newCartesionPoint(10, 20);
		
		Point pointPolar = Point.newPolarPoint(10, 20);

	}

}
