package tests;

import org.testng.annotations.Test;

import pages.Homepage;

public class HomeTest extends BaseTest {
   @Test
   public void navigation() {
	   System.out.println("===== START: HomeTest =====");
	   Homepage home = new Homepage(driver);
	   home.products();
       driver.navigate().back();
	   home.cart();
	   driver.navigate().back();
	   home.contactus();
       driver.navigate().back();
	   home.scrolldown();
	   home.women();
	   home.men();
	   home.kids();
   }
}

