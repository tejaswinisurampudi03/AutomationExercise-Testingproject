package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver driver;
   
    @FindBy(xpath="//a[@href='/login']")
	 WebElement login;
    
    @FindBy(css = "input[data-qa='login-email']")
    WebElement email;
    
    @FindBy(css = "input[data-qa='login-password']")
    WebElement password;   
    
    @FindBy(css = "button[data-qa='login-button']")
    WebElement button;
    
    public Loginpage(WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements(driver,this);
	}
    
    public void login(String mail,String pass ) { 
    	login.click();
    	email.sendKeys(mail);
    	password.sendKeys(pass);
    	button.click();
    }
	
    
    
    
}
