package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import base.Browser;

import pages.LoginPage;

public class LoginTest extends LoginPage {
	
	
	
	WebDriver driver = Browser.DriverManager("chrome");
	@Parameters({"user","pass"})
	@Test
	public void login(String user,String pass)
	{
		driver.findElement(By.xpath(username)).sendKeys(user);
		driver.findElement(By.xpath(password)).sendKeys(pass);
		driver.findElement(By.xpath(loginbtn)).click();
		//return new HomepageTest();
		
}

}