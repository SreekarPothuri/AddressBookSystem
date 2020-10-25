package com.addressBook.model;

public class Person {
	private String firstName;
	private String lastName;
	private Address address;
	private String mobileNum;
	
	private Person(){}
    
	Person(String firstName, String lastName,Address address, String MobileNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.mobileNum = mobileNum;
    }
}
