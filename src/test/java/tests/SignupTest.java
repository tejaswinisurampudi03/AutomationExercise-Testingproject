package tests;

	import org.testng.annotations.Test;

import pages.Signuppage;

	public class SignupTest extends BaseTest{
	  @Test
		public void testsign() throws InterruptedException {
		   System.out.println("===== START: SignupTest =====");
			Signuppage signup = new Signuppage(driver);
			signup.sign("tejaswini","automatetest10@gmail.com","Testingauto@03","tejaswini","suraouy","Anakapalli gandhinagar","Andhrapradesh","vizag","321454","9870876532");
		  
			
	}
	}

