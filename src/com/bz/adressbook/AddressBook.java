package com.bz.adressbook;

public class AddressBook {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("....WELCOME TO ADDRESS BOOK....");
		contactDetails newContact = new contactDetails();
		newContact.setFirstName("Nikita \n");
		newContact.setLastName("Rajput \n");
		newContact.setAddressCity("Kolhapur \n");
		newContact.setState("Maharashtra \n");
		newContact.setZip(416106);
		newContact.setEmail("rajputnikita5666@gmail.com \n");
		newContact.setPhoneNumber(1234567890);
		System.out.println("The Contact is : " + newContact);
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
