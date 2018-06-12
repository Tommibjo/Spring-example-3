package com.juurivuohi.main;

public class Account {
	
	private double balance;
	private String accountNumber;
	
	public Account (double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}

}
