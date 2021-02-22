package com.horasan.cs_design_patterns.behaviour.chainOfResponsibility;

public class Creature {
	public String name;
	public int attach, defense;
	
	public Creature(String name, int attach, int defense) {
		super();
		this.name = name;
		this.attach = attach;
		this.defense = defense;
	}

	@Override
	public String toString() {
		return "Creature [name=" + name + ", attach=" + attach + ", defense=" + defense + "]";
	}
	
	
}
