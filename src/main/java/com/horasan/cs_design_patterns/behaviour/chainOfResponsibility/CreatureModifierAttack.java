package com.horasan.cs_design_patterns.behaviour.chainOfResponsibility;

public class CreatureModifierAttack extends CreatureModifier {

	public CreatureModifierAttack(Creature c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle() {
		System.out.println("Attack is now *2 for: " + creature.name);
		creature.attach = creature.attach * 2; 
		super.handle();
	}
}
