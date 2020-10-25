package com.addressBook.model;

public class Address {
	 private String address;
     private String city;
     private String state;
     private long zip;
     
     private Address(){}
     
     Address(String address,String city,String state,long zip){
             this.address = address;
             this.city = city;
             this.state = state;
             this.zip = zip;
     }

}
