package org.testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pagefactory.LoginPageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	
	@Test
	public void NewLogin() {
		//public void LohinNew() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			PageFactory.initElements(driver,LoginPageFactory.class); // why we use 
			// bcoz the driver method does not have in login page factory class so we add this method to add driver in the pom class
			
			LoginPageFactory lp = new LoginPageFactory();
			lp.NavigLink.click();
			lp.UserName.sendKeys("kevin1016partner@gmail.com");
			lp.SigIn.click();
			lp.Password.sendKeys("kevinJ1016!");
			lp.Click1.click();
		
	}

}
