package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.BaseTest;

public class Contactuspage {
	WebDriver driver;
	JavascriptExecutor js ;
	@FindBy(xpath = "//a[@href='/contact_us']")
	WebElement contactbtn;
	
	@FindBy(css = "input[name='name']")
	WebElement name;
	@FindBy(css = "input[name='email']")
	WebElement email;
	@FindBy(css = "input[name='subject']")
	WebElement subject;
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement message;
	
	@FindBy(css = "input[name='submit']")
	WebElement sbtn;
	 private WebDriverWait wait;
	  public Contactuspage(WebDriver driver) {
			 this.driver = driver;
			 this.js =  (JavascriptExecutor)driver;
			 this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			 PageFactory.initElements(driver,this);
		}
	  public void contactbtn() {
		  wait.until(ExpectedConditions.elementToBeClickable(contactbtn)).click();
	  }
	  public void info(String Name , String Email , String Subject , String Message)
	  {
		  BaseTest.dismissGoogleVignetteIfPresent();
		  name.sendKeys(Name);
		  email.sendKeys(Email);
		  subject.sendKeys(Subject);
		  message.sendKeys(Message);
		  
	  }
	  public void sbtn() {
		  js.executeScript("arguments[0].scrollIntoView({block:'center'});", sbtn);
		  wait.until(ExpectedConditions.elementToBeClickable(sbtn)).click();
		  
	  }
	  public void getPopupMessage() {
		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Popup Message: " + alert.getText());
            alert.accept();
		}
	
	

}

