package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeMethod;
	

	public class BaseTest {
		    protected static WebDriver driver;

		    public static void dismissGoogleVignetteIfPresent() {
		        if (driver.getCurrentUrl().contains("#google_vignette")) {
		            try {
		                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		                
		                // Switch to the container iframe
		                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
		                    By.xpath("//iframe[contains(@id, 'aswift') or contains(@name, 'aswift')]")
		                ));

		                // Switch to inner iframe if nested
		                try {
		                    driver.switchTo().frame("ad_iframe");
		                } catch (Exception ignored) {}

		                // Click dismiss button
		                WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(
		                    By.xpath("//div[@id='dismiss-button'] | //span[text()='Close']")
		                ));
		                closeButton.click();
		            } catch (Exception e) {
		                // Fallback if ad cannot be dismissed via DOM
		                driver.navigate().refresh();
		            } finally {
		                driver.switchTo().defaultContent();
		            }
		        }
		    }
		
	  @BeforeMethod
	  public void setup() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationexercise.com/");

	 }
	  
	  @AfterMethod
	  public void teardown() throws InterruptedException {
		  if(driver!=null) { 
		   Thread.sleep(3000);
		  driver.quit(); 
		  }
	  }
	}




