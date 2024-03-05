package Identifypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class course2 extends pagefactory
{
	public WebDriver driver;

	public course2(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
	WebElement cou1;
	
	@FindBy(xpath="//div[@class='cds-119 css-1h3hs08 cds-121']")
	WebElement cou2;
	
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[1]")
	WebElement cou3;
	
	public String c201() 
	{
		 return cou1.getText();
		//return driver.findElement(By.xpath("//*[@id='rendered-content']/div/main/section[2]/div/div/div[1]/div[1]/section/div/div[1]/h1"));
	}
	public String c202() 
	{
		return cou2.getText();
		//return driver.findElement(By.xpath("//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/section/div/div[3]/div/div/div[2]"));
	}
	public String c203() 
	{
		return cou3.getText();
		//return driver.findElement(By.xpath("//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/section/div/div[1]/div/div/div[1]"));
	}

}
