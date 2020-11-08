package com.addressBook.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.addressBook.AddressBook;
import com.addressBook.AddressBookFileIOService;
import com.addressBook.model.Person;

class AddressBookTest {

	static AddressBook addressBook;
	
	@BeforeAll
	public static void createAddressBookObj() {
		addressBook = new AddressBook(null);
	}
	@Test
	public void given2EmployeeDetails_whenWrittenToFile_ShouldMatchWithEntries() {
		Person[] arrayOfEmps = { new Person("Sreekar", "Pothuri", "RingRoad", "Ponnur", "AndhraPradesh", "9876543210", 522124),
				new Person("Nikhil", "BaiReddy", "MainRoad", "Warangal", "Telangana", "0123456789", 522121)
		};
		addressBook = new AddressBook(Arrays.asList(arrayOfEmps));
		AddressBook.writeAddressBookData(AddressBook.IOService.FILE_IO);
		long entries = AddressBookFileIOService.countEntries(AddressBook.IOService.FILE_IO);
		Assert.assertEquals(2, entries);
	}
}
