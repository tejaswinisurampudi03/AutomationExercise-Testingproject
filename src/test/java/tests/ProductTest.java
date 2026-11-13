package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Productpage;

public class ProductTest extends BaseTest {
	 public void safeClick(WebElement element) {
	        dismissGoogleVignetteIfPresent();
	        element.click();
	    }
   
	@Test
   public void producttest() {
		System.out.println("===== START:ProductTest =====");
		Productpage pdt = new Productpage(driver) ;
		pdt.product();
	    pdt.scrolldown();
		pdt.search("jeans");
		pdt.viewpdt(); 
		pdt.addtocart();
		pdt.clickModalViewCart();
		driver.navigate().back();
		pdt.women();
		pdt.dressbtn();
		pdt.women();
		pdt.topbtn();
		pdt.women();
		pdt.sareebtn();
		pdt.menbtn();
		pdt.tshirtsbtn();
		pdt.menbtn();
		pdt.jeansbtn();
		pdt.kidsbtn();
		pdt.button();
		pdt.kidsbtn();
		pdt.shirtbtn();
		pdt.brandbtn();
			
			
		
	}
}

