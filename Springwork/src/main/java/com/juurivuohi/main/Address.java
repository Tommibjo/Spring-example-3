package com.juurivuohi.main;

public class Address {

	private String streetaddress;
	private String city;
	private int zipcode;
	
	public Address(String streetaddress, String city, int zipcode) {
		this.streetaddress = streetaddress;
		this.city = city;
		this.zipcode = zipcode;
	}

	public static Address createAddress(String streetaddress, String city, int zipcode) {
		return new Address(streetaddress, city, zipcode);
	}
	
	@Override
	public String toString() {
		return "Address [streetaddress=" + streetaddress + ", city=" + city + ", zipcode=" + zipcode + "]";
	}

}
