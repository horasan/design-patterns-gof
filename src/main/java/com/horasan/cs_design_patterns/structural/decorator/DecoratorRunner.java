package com.horasan.cs_design_patterns.structural.decorator;

public class DecoratorRunner {
	
	public static void main(String[] args) {
		Shape decChain = new ColourRedShape(new DotLineShape(new Rectangle()));
		System.out.println(decChain.info());	
	}
	
	
	
}
