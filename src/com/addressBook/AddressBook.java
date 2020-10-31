package com.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.addressBook.model.Person;

public class AddressBook {
	public static List<Person> personList = new ArrayList<Person>();
	static Scanner sc = new Scanner(System.in);
	
	static int choice =0;
	
	private void addPerson()
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
		
		Person person = new Person(firstName, lastName, address, city, state, mobileNum, zipCode);
		personList.add(person);
		System.out.println("Person details added successfully");
	}
	
	private void editContact() {
		if(personList.isEmpty()) {
			System.out.println("There are no contacts to print");
		} else {
			String address,city,state,mobileNum,zipCode;
			int id;
			for(Person contact : personList) {
				System.out.println("ID "+personList.indexOf(contact)+":\n"+contact);
			}
			System.out.println("Enter ID of contact to edit: ");
			id = sc.nextInt();
			System.out.println(personList.get(id));
			System.out.println("Please select the option to edit\n1.Address\n2.City\n3.State\n4.zipCode\n5.Mobile Number");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Address: ");
				address = sc.next();
				personList.get(id).setAddress(address);
				break;
			case 2:
				System.out.println("Enter City: ");
				city = sc.next();
				personList.get(id).setCity(city);
				break;
			case 3:
				System.out.println("Enter State: ");
				state = sc.next();
				personList.get(id).setState(state);
				break;
			case 4:
				System.out.println("Enter Zip Code: ");
				zipCode = sc.next();
				personList.get(id).setZipCode(zipCode);
				break;
			case 5:
				System.out.println("Enter Mobile Number: ");
				mobileNum = sc.next();
				personList.get(id).setMobileNum(mobileNum);
				break;
			default:
				System.out.println("Error!! Choose correct Option");
				editContact();
			}
		}
	}

	private void printContact() {
		if(personList.isEmpty()){
	         System.out.println("There are no contacts to print");
	    } else {
	         for(Person contact : personList){
	            System.out.println(contact);
	         }
	     }
	}

	private void deleteContact() {
		if(personList.isEmpty()){
			System.out.println("There are no contacts to delete in the addressbook");
		} else {
			System.out.println("Enter firstname to delete the person");
			String firstName = sc.next();
			for(int count=0;count < personList.size(); count++){
				if(personList.get(count).getFirstName().equals(firstName)){
					personList.remove(personList.get(count));
				}
			}
			System.out.println("Person details deleted successfully");
		}
	}
	
	private void addMultiplePerson() {
		System.out.println("Enter how many contacts you want to add: ");
		int numofContacts = sc.nextInt();
		int createdContacts = 1;
		while(createdContacts <= numofContacts) {
			if(addressBookWithUniqueName() == true)	
				addPerson();
			createdContacts++;
		}
	}

	private boolean addressBookWithUniqueName() {
		System.out.println("FirstName of a person is referred to as AddressBookName");
		System.out.println("Enter AddressBook Name to check Uniqueness");
		String firstName = sc.next();
		for(int count=0;count < personList.size(); count++){
			if(personList.get(count).getFirstName().equals(firstName)){
				System.out.println("Already an AddressBook exist with this name");
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		AddressBook contact = new AddressBook();
		System.out.println("*****WELCOME TO ADDRESS BOOK PROGRAM*****");
		while(choice <= 6) {
			System.out.println("1.Add Person\n2.Print contact details\n3.Edit contact details\n4.Delete contact details\n"
					+ "5.Exit\n6.Add another Person");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
					contact.addPerson();
				break;
			case 2:
				contact.printContact();
				break;
			case 3:
				contact.editContact();
				break;
			case 4:
				contact.deleteContact();
				break;
			case 5:
				System.exit(0);
				break;
			case 6:
				contact.addMultiplePerson();
				break;
			default:
				System.out.println("Error! Choose right option from the above given options Only");
			}
		}
	}
}

