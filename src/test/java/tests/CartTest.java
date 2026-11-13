package tests;


import org.testng.annotations.Test;


import pages.Cartpage;
import pages.Productpage;

public class CartTest extends BaseTest {
  @Test
  
  public void incart() {
	    System.out.println("===== START: CartTest =====");
		Productpage pdt = new Productpage(driver) ;
		pdt.product();
		pdt.search("jeans");
		pdt.viewpdt(); 
		pdt.addtocart();
		pdt.clickModalViewCart();;
		
		  Cartpage cartpage = new Cartpage(driver);
		  if(cartpage.table()) {
			    System.out.println("Cart table is displayed");
			}
		  else {
			  System.out.println("Cart table is not displayed");
		  }
		  
	     System.out.println("Product name:" + cartpage.description());
	     System.out.println("Product price:" + cartpage.amount());
	     System.out.println("Product quantity:" + cartpage.quantity());
		 System.out.println("Product total:" + cartpage.amtotal());
	
	
	
}
}

