package com.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.addressBook.model.Person;

public class AddressBook {
	
	public static List<Person> personList = new ArrayList<Person>();
	Scanner sc = new Scanner(System.in);
	
	public void addPerson()
	{
		System.out.println("Enter Person Details");
		System.out.println("Enter FirstName: ");
		String firstName = sc.next();
		System.out.println("Enter lastName: ");
		String lastName = sc.next();
		System.out.println("Enter Address: ");
		String address = sc.next();
		System.out.println("Enter City: ");
		String city = sc.next();
		System.out.println("Enter State: ");
		String state = sc.next();
		System.out.println("Enter Mobile Number: ");
		String mobileNum = sc.next();
		System.out.println("Enter zipCode: ");
		String zipCode = sc.next();
		
		Person person1 = new Person(firstName, lastName, address, city, state, mobileNum, zipCode);
		personList.add(person1);
		System.out.println("Person details added successfully");
	}
	
	public static void main(String args[]) {
		System.out.println("*****WELCOME TO ADDRESS BOOK PROGRAM*****");
		AddressBook contact = new AddressBook();
		contact.addPerson();
	}	
}

