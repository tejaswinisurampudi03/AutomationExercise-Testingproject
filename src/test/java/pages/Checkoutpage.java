package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.BaseTest;

public class Checkoutpage {
  WebDriver driver;
  JavascriptExecutor js ;
  @FindBy(xpath = "//a[@href = '/products']")
   WebElement productbtn;
  @FindBy(xpath="(//a[@data-product-id='1'])[1]")
  WebElement product1;
  @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
  WebElement product2;
  @FindBy(xpath = "((//a[@data-product-id='3'])[1])")
  WebElement product3;
  @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
  WebElement continueshopping;
  @FindBy(xpath = "(//a[@href='/view_cart'])[2]")
  WebElement button;
  @FindBy(css = "a.check_out")
  WebElement checkoutbtn;
  @FindBy(xpath = "//ul[contains(@class,'address')]")
  WebElement deliveryAddress;
  @FindBy(id="address_invoice")
  WebElement addressinvoice;
  @FindBy(xpath = "(//p[@class='cart_total_price'])[5]")
  WebElement totalprice;
  @FindBy(xpath = "//a[@href = '/payment']")
  WebElement order;
  @FindBy(css = ".form-control")
  WebElement name;
  @FindBy(css = "input[name='card_number']")
  WebElement cardno;
  @FindBy(css = "input[name='cvc']")
  WebElement cvvno;
  @FindBy(css = "input[name='expiry_month']")
  WebElement expmonth;
  @FindBy(css = "input[name='expiry_year']")
  WebElement expyear;
  @FindBy(xpath = "//button[@id='submit']")
  WebElement confirmbtn;
  
  private WebDriverWait wait;
  public Checkoutpage(WebDriver driver) {
		 this.driver = driver;
		 this.js =  (JavascriptExecutor)driver;
		 this.wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 PageFactory.initElements(driver,this);
	}
  public void products() {  
	  BaseTest.dismissGoogleVignetteIfPresent();
	  productbtn.click();
	  js.executeScript("arguments[0].scrollIntoView({block:'center'});",productbtn );
  }
  public void addtocart() {
	  BaseTest.dismissGoogleVignetteIfPresent();
	  js.executeScript("arguments[0].scrollIntoView({block:'center'});", product1);
	  product1.click();
	  wait.until(ExpectedConditions.elementToBeClickable(continueshopping)).click();
	  BaseTest.dismissGoogleVignetteIfPresent();
	  js.executeScript("arguments[0].scrollIntoView({block:'center'});", product2);
	  product2.click();
	  wait.until(ExpectedConditions.elementToBeClickable(continueshopping)).click();
	  BaseTest.dismissGoogleVignetteIfPresent();
	  js.executeScript("arguments[0].scrollIntoView({block:'center'});", product3);
	  product3.click();
	  wait.until(ExpectedConditions.elementToBeClickable(button)).click();
  }
    /*public void button() {
    	BaseTest.dismissGoogleVignetteIfPresent();
    	wait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }
    */
    public void checkoutbtn() {
    	wait.until(ExpectedConditions.elementToBeClickable(checkoutbtn)).click(); 
    }
    public String deliveryAddress() {
        return wait.until(ExpectedConditions.visibilityOf(deliveryAddress)).getText();
    }
    public String addressinvoice() {
        return wait.until(ExpectedConditions.visibilityOf(addressinvoice)).getText();
        
    }
    public String totalprice() {
        return wait.until(ExpectedConditions.visibilityOf(totalprice)).getText();
        
    }
    public void scrolldown() {
        js.executeScript("arguments[0].scrollIntoView({block:'end'});",order );
    }
  public void order() {
	  BaseTest.dismissGoogleVignetteIfPresent();
	  order.click();
  }
  public void form(String Name,String card , String cvv ,String month ,String year ) {
	  name.sendKeys(Name);
	  cardno.sendKeys(card);
	  cvvno.sendKeys(cvv);
	  expmonth.sendKeys(month);
	  expyear.sendKeys(year);
  }
  
  public void confirmbtn() {
	  js.executeScript("arguments[0].scrollIntoView({block:'center'});",confirmbtn );
	  confirmbtn.click();
  }
  
}

