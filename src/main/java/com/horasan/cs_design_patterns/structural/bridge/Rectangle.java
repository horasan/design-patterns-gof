package com.horasan.cs_design_patterns.structural.bridge;

public class Rectangle extends AbsShape {

	public Rectangle(Painter p) {
		super(p);
	}

	public int area() {
		System.out.println("Area is colored to " + painter.getColor());
		return 0;
	}

	public String color() {
		// TODO Auto-generated method stub
		return null;
	}

}
