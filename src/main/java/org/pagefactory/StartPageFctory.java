package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPageFctory {
	

	@FindBy(xpath = "(//a[@tabindex='0'])[11]")
	public static WebElement Login1;
	@FindBy(xpath = "(//div[@class='a-section a-spacing-small a-text-center'])[1]")
	public static WebElement Login2;


}
