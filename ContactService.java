package Contact;

import java.util.HashMap;
import java.util.Scanner;

public class ContactService {
    private HashMap<String, String> contacts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    String contactID;
    String firstName;
    String lastName;
    String phone;
    String address;
    
	public void addContacts() {
        System.out.print("Enter contact ID: ");
        contactID = scanner.nextLine();
        	if(contactID.length() > 10 || contactID == null) {
        		System.out.println("Enter contact ID: ");
                contactID = scanner.nextLine();
        	}
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        if(firstName.length() > 10 || firstName == null) {
    		System.out.println("Enter first name: ");
    		firstName = scanner.nextLine();
    	}
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
	        if(lastName.length() > 10 || lastName == null) {
	    		System.out.println("Enter last name: ");
	    		lastName = scanner.nextLine();
	    	}
        System.out.print("Enter phone number: ");
        phone = scanner.nextLine();
	        if(phone.length() != 10 || phone == null) {
	    		System.out.println("Enter phone: ");
	    		phone = scanner.nextLine();
	    	}
        System.out.print("Enter address: ");
		address = scanner.nextLine();
        if(address.length() > 30 || address == null) {
	    		System.out.println("Enter address: ");
	    		address = scanner.nextLine();
	    	}
        System.out.println("Contact added.");
    }

    public void viewContacts() {
    	if (contactID == null) {
            System.out.println("No contacts found.");
        } else {
		System.out.println("Contact ID: " + contactID + 
				", First Name: " + firstName + ", Last Name: " + 
				lastName + ", Phone: " + phone + "Address: " + 
				address + contacts.get(contactID) + "/n");	
    	
        }
    }

    public String editContactFirstName() {
        System.out.print("Enter Contact ID to edit: ");
        String contactID = scanner.nextLine();
	        if (contactID.contains(contactID)) {
	            System.out.print("Enter First Name: ");
	            String newFirstName = scanner.nextLine();
	            contacts.put(contactID, newFirstName);
	            System.out.println("Contact updated.");
	        } else {
	            System.out.println("Contact not found.");
	        }
			return contactID;
    }
    public void editContactLastName() {
        System.out.print("Enter Contact ID to edit: ");
        String contactID = scanner.nextLine();
	        if (contactID.contains(contactID)) {
	            System.out.print("Enter Last Name: ");
	            String newLastName = scanner.nextLine();
	            contacts.put(contactID, newLastName);
	            System.out.println("Contact updated.");
	        } else {
	            System.out.println("Contact not found.");
	        }
    }
    public void editContactPhone() {
        System.out.print("Enter Contact ID to edit: ");
        String contactID = scanner.nextLine();
	        if (contactID.contains(contactID)) {
	            System.out.print("Enter New Phone: ");
	            String newPhone = scanner.nextLine();
	            contacts.put(contactID, newPhone);
	            System.out.println("Contact updated.");
	        } else {
	            System.out.println("Contact not found.");
	        }
    }
    public void editContactAddress() {
        System.out.print("Enter Contact ID to edit: ");
        String contactID = scanner.nextLine();
	        if (contactID.contains(contactID)) {
	            System.out.print("Enter New Address: ");
	            String newAddress = scanner.nextLine();
	            contacts.put(contactID, newAddress);
	            System.out.println("Contact updated.");
	        } else {
	            System.out.println("Contact not found.");
	        }
    }

    public void deleteContact() {
        System.out.print("Enter Contact ID to delete: ");
        String contactID = scanner.nextLine();
        if (contactID.contains(contactID)) {
            contacts.remove(contactID);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContact() {
        System.out.print("Enter Contact ID to search: ");
        String contactID = scanner.nextLine();
        if (contactID.contains(contactID)) {
             
			System.out.println("Contact ID: " + contactID + ", First Name: " + firstName + ", Last Name: " + lastName + ", Phone: " + phone + "Address: " + address + contacts.get(contactID) + "/n");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void main(String[] args) {
        ContactService contacts = new ContactService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContacts Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit First Name");
            System.out.println("4. Edit Last Name");
            System.out.println("5. Edit Phone");
            System.out.println("6. Edit Address");
            System.out.println("7. Delete Contact");
            System.out.println("8. Search Contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    contacts.addContacts();
                    break;
                case 2:
                    contacts.viewContacts();
                    break;
                case 3:
                    contacts.editContactFirstName();
                    break;
                case 4:
                    contacts.editContactLastName();
                    break;
                case 5:
                    contacts.editContactPhone();
                    break;
                case 6:
                    contacts.editContactAddress();
                    break;
                case 7:
                    contacts.deleteContact();
                    break;
                case 8:
                    contacts.searchContact();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}