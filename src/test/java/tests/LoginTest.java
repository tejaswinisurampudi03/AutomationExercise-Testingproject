
package tests;

import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginTest extends BaseTest {
 @Test
 public void logintest() {
	  System.out.println("===== START: LoginTest =====");
	 Loginpage loginpage = new Loginpage(driver);
	 loginpage.login("automatetest003@gmail.com", "Testingauto@003");
 }
   
   
   
   
   
}