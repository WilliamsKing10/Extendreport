package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {
	
	
	// why we use @findby it's a easy method to wrote the code and the main thing is 
	// we didnot use finelement method to find webelement
	// so first normally create one static method with public static webelement methodname
	// why we use webelement bcoz this only we go to find them 
	// still this webelement doesnot have a driver so testcase class we put one method called pagefactory 
	// the webelement identify the element with the help of webdriver 
	// so the webdriver is must 
	// static must bcoz the pom class we have pagefactory method and intit method the inti method id static method so we put static in pom class
	
	@FindBy(id = "nav-link-accountList")
	public static WebElement NavigLink;
	
	@FindBy(id="ap_email")
	public static WebElement UserName;
	
	@FindBy(id="ap_password")
	public static WebElement Password;
	
	@FindBy(id="signInSubmit")
	public static WebElement Click1;
	
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement SigIn;

}
