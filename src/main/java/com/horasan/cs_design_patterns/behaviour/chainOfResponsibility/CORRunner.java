package com.horasan.cs_design_patterns.behaviour.chainOfResponsibility;

public class CORRunner {

	public static void main(String [] args) {
		Creature cr = new Creature("mick", 2, 2);
		System.out.println(cr.toString());
		CreatureModifier rootModifier = new CreatureModifier(cr);
		rootModifier.add(new CreatureModifierAttack(cr));
		rootModifier.add(new CreatureModifierDefense(cr));
		
		rootModifier.handle();
		System.out.println(cr.toString());
		
	}
}
