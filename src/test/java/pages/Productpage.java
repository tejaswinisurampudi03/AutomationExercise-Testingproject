package pages;

import java.time.Duration;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Productpage {
   WebDriver driver;

   @FindBy(xpath = "//a[@href = '/products']")
   WebElement productbtn;
   JavascriptExecutor js ;
   @FindBy(id = "search_product")
   WebElement search;
   @FindBy(id = "submit_search")
   WebElement searchbtn;
   @FindBy(xpath = "//a[@href = '/product_details/33']")
   WebElement viewpdt; 
   @FindBy(xpath ="//button[@class='btn btn-default cart']")
   WebElement addtocart;
   
   //@FindBy(xpath = "(//a[@href='/view_cart'])[2]")
   //WebElement viewcart;
   @FindBy(xpath = "//div[@class='modal-content']//a[@href='/view_cart']")
   WebElement modalViewCartBtn;
 
  // @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
   //WebElement continueshopping;
   @FindBy(xpath="//a[@href='#Women']//i")
   WebElement womenplus;
   @FindBy(xpath = "//a[@href = '/category_products/1']")
   WebElement dressbtn;
   @FindBy(xpath = "//a[@href = '/category_products/2']")
   WebElement topbtn;
   @FindBy(xpath = "//a[@href = '/category_products/7']")
   WebElement sareebtn;
   @FindBy(xpath = "//a[@href='#Men']")
   WebElement menbtn;
   @FindBy(xpath = "//a[@href = '/category_products/3']")
   WebElement tshirtsbtn;
   @FindBy(xpath = "//a[@href = '/category_products/6']")
   WebElement jeansbtn;
   @FindBy(xpath = "//a[@href='#Kids']")
   WebElement kidsbtn;
   @FindBy(xpath = "//a[@href='/category_products/4']")
   WebElement button;
   @FindBy(xpath = "//a[@href = '/category_products/5']")
   WebElement shirtbtn;
   @FindBy(xpath="//a[@href='/brand_products/Polo']")
   WebElement brandbtn;
   
  private WebDriverWait wait;
   public Productpage(WebDriver driver) {
		 this.driver = driver;
		 this.js =  (JavascriptExecutor)driver;
		 this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 PageFactory.initElements(driver,this);
	}
   public void product() {
	    wait.until(ExpectedConditions.elementToBeClickable(productbtn)).click();
	    
	    // Check if Google Vignette hijacked the URL
	    if (driver.getCurrentUrl().contains("#google_vignette")) {
	        driver.get("https://automationexercise.com/products");
	    }
	}
   public void scrolldown() {
	   js.executeScript("arguments[0].scrollIntoView({block:'center'});", searchbtn);

	   }
  
   
   public void search(String searchname) {

	    wait.until(ExpectedConditions.visibilityOf(search));
	    search.clear();
	    search.sendKeys(searchname);

	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", searchbtn );

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
	        searchbtn.click();

	    } catch (ElementClickInterceptedException e) {

	        js.executeScript("arguments[0].click();", searchbtn);
	    }
	}
	
   
   public void viewpdt() {
		    //JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView({block: 'center'});", viewpdt);
		    wait.until(ExpectedConditions.elementToBeClickable(viewpdt)).click();
		}
	   
   public void addtocart() {
	  js.executeScript("arguments[0].scrollIntoView({block:'center'});", addtocart);
	  wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();
   }
   public void clickModalViewCart() {
	    // Wait until the modal overlay and button are visible
	    wait.until(ExpectedConditions.visibilityOf(modalViewCartBtn));
	    js.executeScript("arguments[0].click();", modalViewCartBtn);
  }
   //public void viewcart() {
	 //  wait.until(ExpectedConditions.elementToBeClickable(viewcart)).click();
   //}
   
  // public void continueShopping() {
	//    wait.until(ExpectedConditions.elementToBeClickable(continueshopping)).click();
	//}
   
	   public void women() {
		  
		   wait.until(ExpectedConditions.elementToBeClickable(womenplus)).click();
	   }
	  
	   
   
   public void dressbtn() {
	  wait.until(ExpectedConditions.elementToBeClickable(dressbtn)).click();
	   }
   public void topbtn() {
	   wait.until(ExpectedConditions.elementToBeClickable(topbtn)).click();
   } 
   public void sareebtn() {  
	   wait.until(ExpectedConditions.elementToBeClickable(sareebtn)).click();
   }
   public void menbtn() {
	    menbtn.click();
   }
   public void tshirtsbtn() {
	   wait.until(ExpectedConditions.elementToBeClickable(tshirtsbtn)).click();
   }
   public void jeansbtn() {
	   wait.until(ExpectedConditions.elementToBeClickable(jeansbtn)).click();
   }
   public void kidsbtn() {
	    kidsbtn.click();
   }
   public void button() {
	   wait.until(ExpectedConditions.elementToBeClickable(button)).click();
   }
   public void shirtbtn() {
	   wait.until(ExpectedConditions.elementToBeClickable(shirtbtn)).click();
   }
   public void brandbtn() {
	   wait.until(ExpectedConditions.elementToBeClickable(brandbtn)).click();
   }    
	    
   }


