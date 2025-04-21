package Contact;

public class Contacts {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}

	public void setContactID(String contactID) {
		 this.contactID = contactID;
	}
	public void setFirstName(String firstName) {
		 this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		 this.lastName = lastName;
	}
	public void setPhone(String phone) {
		 this.phone = phone;
	}
	public void setAddress(String address) {
		 this.address = address;
	}
}