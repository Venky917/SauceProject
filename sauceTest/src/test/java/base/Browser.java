/**
 * 
 */
package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

/**
 * @author 0640I7744
 *
 */
public class Browser {

	

		static WebDriver driver = null;
	
	public static WebDriver DriverManager(String type) {
		
		if(type.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();	
		
		return driver;
	}
}
