package com.horasan.cs_design_patterns.behaviour.chainOfResponsibility;

public class CreatureModifier {
	
	public Creature creature;
	public CreatureModifier next;
	
	public CreatureModifier(Creature c) {
		this.creature = c;
	}
	
	public void add(CreatureModifier newMod) {
		if (next != null) {
			next.add(newMod);
		}
		else {
			next = newMod;
		}
	}
	
	public void handle() {
		if(next != null) {
			next.handle();
		}
	}
	
}
