package com.horasan.cs_design_patterns.behavioral.observer;

public class House extends Observable<House> {
	public int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		if (this.price == price) {
			return;
		}
		int oldValue = this.price; 
		this.price = price;
		notify(this, "price", this.price, oldValue);
	}
	
	
	
}
