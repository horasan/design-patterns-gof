package com.horasan.cs_design_patterns.behaviour.chainOfResponsibility;

public class CreatureModifierDefense extends CreatureModifier{

	public CreatureModifierDefense(Creature c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle() {
		System.out.println("Defense is +3 for:" + creature.name);
		creature.defense = creature.defense + 3; 
		super.handle();
	}

}
