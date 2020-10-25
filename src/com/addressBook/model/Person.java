package com.addressBook.model;

public class Person {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public  String state;
	public String mobileNum;
	public String zipCode;
	
	public Person(String firstName, String lastName,String address,String city,String state,String mobileNum,String zipCode)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNum = mobileNum;
		this.zipCode = zipCode;
	}
}
