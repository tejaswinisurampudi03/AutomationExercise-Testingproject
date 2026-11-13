package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
    WebDriver driver;
  
	@FindBy(xpath = "//a[@href = '/products']")
	WebElement productbtn;
	@FindBy(xpath = "//a[@href='/view_cart']")
	WebElement cartbtn;
	@FindBy(xpath = "//a[@href='/contact_us']")
	WebElement contactusbtn;
	JavascriptExecutor js ;
    @FindBy(xpath = "//a[@href='#Women']")
	WebElement womenbtn;
	@FindBy(xpath = "//a[@href='#Men']")
	WebElement menbtn;
	@FindBy(xpath = "//a[@href='#Kids']")
	WebElement kidsbtn;
	
	private WebDriverWait wait;
	
	public Homepage(WebDriver driver) {
		 this.driver = driver;
		 this.js =  (JavascriptExecutor)driver;
		 this.wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 PageFactory.initElements(driver,this);
	}
	
   public void products() {    
	  productbtn.click();
	   
      }
   public void cart(){
	   cartbtn.click();
   }
   public void contactus() {
	   contactusbtn.click();
	    
   }
   public void scrolldown() {
	  js.executeScript("window.scrollBy(0,750)");
   }
   public void women() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(womenbtn)).click();
   }
   

   public void men() {
	   wait.until(ExpectedConditions.elementToBeClickable(menbtn)).click();
   }
   public void kids() {
	   wait.until(ExpectedConditions.elementToBeClickable(kidsbtn)).click();
   }
  
	
	
}

