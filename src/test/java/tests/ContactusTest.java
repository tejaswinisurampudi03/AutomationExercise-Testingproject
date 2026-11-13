package tests;

import org.testng.annotations.Test;

import pages.Contactuspage;

public class ContactusTest extends BaseTest {
	@Test
	public void Contact() {
		System.out.println("===== START: ContactusTest =====");
		Contactuspage  contact = new Contactuspage(driver);
		contact.contactbtn();
		contact.info("Teja","fdgtykjiu09@gmail.com", "To return the item", "I have recieved a damaged item");
		contact.sbtn();
		contact.getPopupMessage();
		
		
	}

}

