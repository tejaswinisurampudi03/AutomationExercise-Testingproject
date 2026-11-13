package tests;

import org.testng.annotations.Test;

import pages.Checkoutpage;
import pages.Loginpage;

public class CheckoutTest extends BaseTest {
	
	public void login() {
		 Loginpage loginpage = new Loginpage(driver);
		 loginpage.login("automatetest003@gmail.com", "Testingauto@003");
	 }	
	
	@Test
	public void CheckOut() {
		  System.out.println("===== START: CheckoutTest =====");
	 login();
	 Checkoutpage checkout = new Checkoutpage(driver);
	 checkout.products();
	 checkout.addtocart();
	// checkout.button();
	 checkout.checkoutbtn();
	 System.out.println("Address:" + checkout.deliveryAddress());
	 System.out.println("In-voice:" + checkout.addressinvoice());
	 System.out.println("Total Price:" + checkout.totalprice());
	 checkout.scrolldown();
	 checkout.order();
	 checkout.form("Tejaswini","65432176554389","897", "11", "2034");
	 checkout.confirmbtn();
	 
	}
}

