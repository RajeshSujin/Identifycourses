package Identifypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pagefactory 
{
	public WebDriver driver;
	
	public pagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

}
