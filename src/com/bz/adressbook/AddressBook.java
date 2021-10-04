package com.bz.adressbook;

import java.util.Scanner;

public class AddressBook {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Welcome Address Book
		System.out.println("....WELCOME TO ADDRESS BOOK....");
		contactDetails newContact = new contactDetails();
		newContact.setFirstName("Nikita \n");
		newContact.setLastName("Rajput \n");
		newContact.setAddressCity("Kolhapur \n");
		newContact.setState("Maharashtra \n");
		newContact.setZip(416106);
		newContact.setEmail("rajputnikita5666@gmail.com \n");
		newContact.setPhoneNumber(1234567890);
		System.out.println("The Contact Book : \n " + newContact);

		addContact();
		editContact();
	}

	private static void editContact() {
		System.out.println("Enter the firstName of person");
		String editName = sc.nextLine();
		contactDetails person = new contactDetails();
		if (editName.equalsIgnoreCase(person.getFirstName()))
			addContact();
		else
			System.out.println("The Entered First Name Is Not Match");
		editContact();

	}

	private static void addContact() {
		contactDetails person = new contactDetails();
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter your addressCity: ");
		String addressCity = sc.nextLine();
		System.out.println("Enter your state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip code : ");
		Long zip = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter phone number: ");
		Long phoneNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your EMail ID: ");
		String email = sc.nextLine();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddressCity(addressCity);
		person.setState(state);
		person.setZip(zip.intValue());
		person.setPhoneNumber(phoneNumber.intValue());
		person.setEmail(email);
		System.out.println("The Contact Details of " + firstName + "\n" + person);

	}
}

class contactDetails {
	private String firstName;
	private String lastName;
	private String addressCity;
	private String state;
	private int zip;
	private long phoneNumber;
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return " FirstName : " + firstName + " LastName : " + lastName + " Address City : " + addressCity + " State : "
				+ state + " Zip : " + zip + '\'' + " PhoneNumber : " + phoneNumber + '\'' + " Email : " + email;

	}

}