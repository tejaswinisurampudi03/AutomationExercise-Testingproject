package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
  WebDriver driver;
  @FindBy(xpath = "(//a[@href='/view_cart'])[2]")
  WebElement button;
  @FindBy(xpath= "//table[@id = 'cart_info_table']")
  WebElement info;
  @FindBy(xpath="//tr[@id='product-33']//td[@class='cart_description']//h4")
  WebElement desc;
  @FindBy(xpath="//tr[@id='product-33']//td[@class='cart_price']//p")
  WebElement price;
  @FindBy(xpath="//tr[@id='product-33']//td[@class='cart_quantity']//button")
  WebElement quantitybtn;
  @FindBy(xpath="//tr[@id='product-33']//td[@class='cart_total']//p")
  WebElement total;
  @FindBy(xpath = "(//td[@class='cart_delete']//a)[2]")
  WebElement deletebutton;
  
  
  public Cartpage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	}     
  
  public void cart() {
	   button.click();
  }
  public boolean table() {
	  return info.isDisplayed();
  }
  public String  description() {
	   return desc.getText();
  }
  
  public String amount() {
	 return price.getText();
  }
  
  public String quantity() {
	 return quantitybtn.getText(); 
	}
  public String amtotal() {
	   return total.getText();
  }
  public void delete() {
	  deletebutton.click();
  }
}

