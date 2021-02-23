package com.horasan.cs_design_patterns.behavioral.nullObject;

public class BankAccount {

	private AccountLog log;
	private int balance;
	
	public BankAccount (AccountLog logx) {
		this.log = logx;
		balance = 0;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
		log.warn("some amount is deposited.!");
	}
	
}
