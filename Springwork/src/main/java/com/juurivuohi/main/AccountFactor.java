package com.juurivuohi.main;

public class AccountFactor {
	
	public Account createAccount(double balance, String accountNumber) {
		return new Account(balance, accountNumber);
		
	}

}
