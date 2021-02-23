package com.horasan.cs_design_patterns.behaviour.memento;

public class MementoRunner {
	// keep internal state so that the object can return to that state.
	
	public static void main(String [] args) {
		
		// ! we are creating with 100 but not saving 100 as memento
		BankAccount ba = new BankAccount(100);
		
		BalanceMemento m1 = ba.deposit(50);
		BalanceMemento m2 = ba.deposit(25);
		System.out.println(ba.toString());
		
		ba.restoreBalance(m1);
		System.out.println(ba.toString());
		
		ba.restoreBalance(m2);
		System.out.println(ba.toString());
		
	}
	
	
	
	
}
