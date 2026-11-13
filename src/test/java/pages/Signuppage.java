package pages;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.Select;
    import org.openqa.selenium.support.ui.WebDriverWait;

	public class Signuppage {
		WebDriver driver;
		
	 @FindBy(xpath="//a[@href='/login']")
	 WebElement signup;
	 
	 @FindBy(css = "input[data-qa='signup-name']")
	 WebElement Name;
	 
	 @FindBy(css = "input[data-qa='signup-email']")
	 WebElement Email;
	 
	 @FindBy(css = "button[data-qa='signup-button']")
	 WebElement buttonsign;
	 
	 @FindBy(id="id_gender1")
	 WebElement rdbutton1;
	 
	 @FindBy(xpath = "//input[@id='id_gender2']")
	 WebElement Mrs;
	 
	 @FindBy(id="password")
	 WebElement password;
	 
	 @FindBy(id="days")
	 WebElement dropdown;
	 
	 @FindBy(id="months")
	 WebElement monthdropdown;
	 
	 @FindBy(id="years")
	 WebElement yeardropdown;
	
	 
	 @FindBy(id="newsletter")
	 WebElement checkbox1;
	 
	 @FindBy(id="optin")
	 WebElement checkbox2;
	 
	 @FindBy(id="first_name")
	 WebElement firstname;
	 
	 @FindBy(id="last_name")
	 WebElement lastname;
	 
	 @FindBy(id="address1")
	 WebElement Address;
	 
	 @FindBy(id="country")
	 WebElement Country;

	 
	 @FindBy(id="state")
	 WebElement State;
	 
	 @FindBy(id="city")
	 WebElement City;
	 
	 @FindBy(id="zipcode")
	 WebElement zipcode;
	 
	 @FindBy(id="mobile_number")
	 WebElement mobile;
	 
	 @FindBy(css = "button[data-qa='create-account']")
	 WebElement createbtn;
	 
	 private WebDriverWait wait;
		
	 public Signuppage(WebDriver driver) {
		  this.driver = driver;
		  this.wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		  PageFactory.initElements(driver,this);
	}
	 public void select(String day, String month, String year,String country) {
		    wait.until(ExpectedConditions.visibilityOf(dropdown));
	        new Select(dropdown).selectByValue(day);
	        new Select(monthdropdown).selectByVisibleText(month);
	        new Select(yeardropdown).selectByValue(year);
	        new Select(Country).selectByValue(country);
	    }
	    
	 public void sign(String name,String mail,String pass,String first,String last,
			 String address,String state,String city,String code,String phnno) throws InterruptedException   
	 {
		  wait.until(ExpectedConditions.elementToBeClickable(signup)).click();
	   	  Name.sendKeys(name);
	   	  Email.sendKeys(mail); 
	   	  buttonsign.click();
	    	wait.until(ExpectedConditions.elementToBeClickable(Mrs)).click();
	   	  password.sendKeys(pass);
	      select("16", "August", "2001", "India");
	   	  checkbox1.click();
		  checkbox2.click();
		  firstname.sendKeys(first);
		  lastname.sendKeys(last);
		  Address.sendKeys(address);
		  State.sendKeys(state);
		  City.sendKeys(city);
		  zipcode.sendKeys(code);
		  mobile.sendKeys(phnno);
		  wait.until(ExpectedConditions.elementToBeClickable(createbtn)).click();
	   	  Thread.sleep(2000);
	   	  }
	 
	}

 



