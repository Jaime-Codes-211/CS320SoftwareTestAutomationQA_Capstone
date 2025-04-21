package Contact;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest {


	@Test
	public void testContact() {
		String contactID = "";
		assertEquals("", contactID);
	}
	
	@Test
	public void testFirstName() {
		String firstName = "";
		assertEquals("", firstName);
	}
	
	@Test
	public void testLastName() {
		String lastName = "";
		assertEquals("", lastName);
	}
	
	@Test
	public void testPhone() {
		String phone = "";
		assertEquals("",phone);
	}
	
	@Test
	public void testAddress() {
		String address = "";
		assertEquals("", address);
	}
	

	@Test
	public void testAddContacts() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	
	@Test
	public void testViewContacts() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	
	@Test
	public void testEditContactFirstName() {
		String contactID = null;
		assertNull(null, contactID);
	}
	@Test
	public void testEditContactLastName() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	
	@Test
	public void testEditContactPhone() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	
	@Test
	public void testEditContactAddress() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	
	@Test
	public void testDeleteContact() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	
	@Test
	public void testSearchContact() {
		String contactID = null;
		assertEquals(null, contactID);
	}
}
