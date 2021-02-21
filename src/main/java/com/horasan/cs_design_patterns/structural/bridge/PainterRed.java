package com.horasan.cs_design_patterns.structural.bridge;

public class PainterRed implements Painter {

	public void paint() {
		System.out.println("Painting RED color.");
	}

	public String getColor() {
		return "RED";
	}

}
