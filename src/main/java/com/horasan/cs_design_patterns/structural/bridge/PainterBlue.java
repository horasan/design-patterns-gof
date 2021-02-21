package com.horasan.cs_design_patterns.structural.bridge;

public class PainterBlue implements Painter {

	public void paint() {
		System.out.println("Painting the BLUE color.");
	}

	public String getColor() {
		return "BLUE";
	}

}
