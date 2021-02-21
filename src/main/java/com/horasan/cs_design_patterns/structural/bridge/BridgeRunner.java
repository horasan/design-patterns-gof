package com.horasan.cs_design_patterns.structural.bridge;

public class BridgeRunner {
	public static void main(String[] args) {
		// connect components through abstraction
		// prevent cartesian product complexity explosion
		
		PainterBlue pb = new PainterBlue();
		PainterRed pr = new PainterRed();
		
		Rectangle rc = new Rectangle(pr);
		rc.area();

	}
}
