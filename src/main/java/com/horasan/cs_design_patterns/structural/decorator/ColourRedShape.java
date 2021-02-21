package com.horasan.cs_design_patterns.structural.decorator;

public class ColourRedShape implements Shape {

	private Shape s;
	public ColourRedShape(Shape sh) {
		s = sh;
	}
	
	public String info() {
		return s.info() + " - " + "I am a RED coloured shape!";
	}

}
