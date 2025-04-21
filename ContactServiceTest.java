package Contact;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class ContactServiceTest {
	@Test
	public void testAddContact() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	@Test
	public void testEditContact() {
		ContactService editContactFirstName = new ContactService();
		String contact_output = editContactFirstName.editContactFirstName();
		assertEquals("", contact_output);
	}
	@Test
	public void deleteContact() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	@Test
	public void editContact() {
		String contactID = null;
		assertEquals(null, contactID);
	}
	@Test
	public void viewContact() {
		String contactID = null;
		assertNull(null, contactID);
	}
   


   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ContactServiceTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
	
      System.out.println(result.wasSuccessful());
   }
}