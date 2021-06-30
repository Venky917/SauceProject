/**
 * 
 */
package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.Browser;
import pages.Homepage;

/**
 * @author 0640I7744
 *
 */
public class HomepageTest extends Homepage{
	
	WebDriver driver = Browser.DriverManager("chrome");
	
	LoginTest login = new LoginTest();
	
	
	
	public void VerifyHomepageTitle()
	{
	     
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(menuBtn)).click();
		driver.findElement(By.xpath(About)).click();
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://saucelabs.com/";
		//String ExpectedUrl = "https://labs.com/";
		 if(ActualUrl.equalsIgnoreCase(ExpectedUrl))
				
				{
			Assert.assertEquals(ExpectedUrl, ActualUrl);
			System.out.println("navigated to https://saucelabs.com/");
			
				}
		}
	
}
