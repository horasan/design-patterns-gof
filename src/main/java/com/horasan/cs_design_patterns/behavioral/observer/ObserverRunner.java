package com.horasan.cs_design_patterns.behavioral.observer;

public class ObserverRunner {
	// get notified when something happens
	
	public static void main(String [] args) {
		House h = new House();
		HousingAgency ha = new HousingAgency();
		
		h.subscribe(ha);
		
		h.setPrice(100);
		h.setPrice(100);
		h.setPrice(120);
		
	}
	
	
	
}
