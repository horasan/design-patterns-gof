package com.horasan.cs_design_patterns.behavioral.nullObject;

public class NullObjectRunner {
	// When component A uses component B (hard coded), A typically assumes that B is non-null and present.
	// then B will satisfy the interface and have no-op features.
	
	public static void main(String [] args) {
		// But I do not want an actual logging!
		
		NullLog logx = new NullLog();
		BankAccount  ba = new BankAccount(logx);
		ba.deposit(100);
	}
}
