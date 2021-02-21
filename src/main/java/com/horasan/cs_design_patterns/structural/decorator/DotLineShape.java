package com.horasan.cs_design_patterns.structural.decorator;

public class DotLineShape implements Shape {

	private Shape s;
	public DotLineShape(Shape sh) {
		s = sh;
	}
	
	public String info() {
		return s.info() + " - " + "I am a dotted line shape";
	}

}
