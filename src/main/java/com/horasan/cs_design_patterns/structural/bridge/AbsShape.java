package com.horasan.cs_design_patterns.structural.bridge;

public abstract class AbsShape {
	
	// DI ?
	protected Painter painter;
	
	public abstract int area();
	public abstract String color();
	
	public AbsShape(Painter p) {
		this.painter = p;
	}
}
