package com.juurivuohi.main;

public class Customer {
	
	private Account account;
	private Address address;
	
	public void onInit() {
		System.out.println(account + " : " + address);
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [account=" + account + ", address=" + address + "]";
	}
	
}
