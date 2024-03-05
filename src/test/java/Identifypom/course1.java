package Identifypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//first course details
public class course1 extends pagefactory
{
	public WebDriver driver;

	public course1(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")WebElement cou02;
	public String c101() 
	{
		return cou02.getText();
		//return driver.findElement(By.xpath("//*[@id='rendered-content']/div/main/section[2]/div/div/div[1]/div[1]/section/h1"));
	}
	
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")WebElement cou03;
	public String c102() 
	{
		return cou03.getText();
		//return driver.findElement(By.xpath("//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[3]/div[1]"));
	}
	
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[6]")WebElement cou04;
	public String c103() 
	{
		return cou04.getText();
		//return driver.findElement(By.xpath("//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]"));
	}


}
