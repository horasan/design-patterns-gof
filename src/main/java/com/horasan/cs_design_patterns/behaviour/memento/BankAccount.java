package com.horasan.cs_design_patterns.behaviour.memento;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
		
	}
	
	public BalanceMemento deposit(int balance) {
		this.balance = this.balance + balance;
		return new BalanceMemento(this.balance);
	}
	
	public void restoreBalance(BalanceMemento memento) {
		balance = memento.balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	
}
