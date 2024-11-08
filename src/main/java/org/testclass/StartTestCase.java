package org.testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pagefactory.LoginPageFactory;
import org.pagefactory.StartPageFctory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartTestCase {
	@Test
	public void Start3() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, LoginPageFactory.class); // the initelement method is static method so we put static method in pom class
		
		LoginPageFactory.NavigLink.click();
		LoginPageFactory.UserName.sendKeys("kevin1016partner@gmail.com");
		LoginPageFactory.SigIn.click();
		LoginPageFactory.Password.sendKeys("kevinJ1016!");
		LoginPageFactory.Click1.click();
		
		PageFactory.initElements(driver, StartPageFctory.class);		
		StartPageFctory.Login1.click();
		StartPageFctory.Login2.click();
		
		
	}
}
