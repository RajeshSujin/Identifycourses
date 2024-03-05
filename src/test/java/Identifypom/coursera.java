package Identifypom;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utilities.ExcelUtilities;

public class coursera extends pagefactory
{
	public WebDriver driver;
	public coursera(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='rendered-content']/div/header/div/div/div[2]/div[1]/div[3]/div/form/div/div[1]/input")WebElement search;
	public void searching(WebDriver driver) throws IOException 
	{	
		ExcelUtilities ex=new ExcelUtilities();
		search.click();
		search.sendKeys(ex.readWeb(),Keys.ENTER);
	}
	
	
	//mini-window
	@FindBy(xpath="//*[@placeholder='Search for Language']")WebElement selectlanguagetxt;
	public void selectlanguagetxt(WebDriver driver) throws InterruptedException, IOException 
	{
		
		Thread.sleep(5000);
		selectlanguagetxt.sendKeys("English",Keys.ENTER);
		
	}
	
	@FindBy(xpath="//*[@id='checkbox-group']/div/label/span")WebElement selectEnglish;
	public void selectEnglish(WebDriver driver) 
	{
		selectEnglish.click();
		
	}
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div/div[2]/div[3]/button[1]/span")WebElement apply;
	public void apply(WebDriver driver) 
	{
		apply.click();
		
	}
	
	@FindBy(xpath="//*[@id='search-results-header-wrapper']/div/div[1]/div/h3")WebElement gotoresult;
	//scroll up
	public void gotoresult(WebDriver driver) 
	{
		gotoresult.click();
		
	}
	
	@FindBy(xpath="//input[@class='react-autosuggest__input']")WebElement inputBoxes;
	//Language Learning
	public void inputBoxs(WebDriver driver) 
	{
		inputBoxes.click();
	}
		
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div/div[2]/div[3]/button[1]/span")WebElement applyies;
	public void applyies(WebDriver driver) 
	{
		applyies.click();
		
	}
	
	@FindBy(xpath="//div[@class='css-19qryfx']")WebElement Homepage ;
	//scroll down For Enterprise
	public void Homepage(WebDriver driver) 
	{
		Homepage.click();
	}
	@FindBy(xpath="//input[@class='react-autosuggest__input']")WebElement HPsearch;
	public void llsearching(WebDriver driver) throws IOException, InterruptedException 
	{	
		Thread.sleep(3000);
		HPsearch.sendKeys("Language Learning",Keys.ENTER);
	}

	
	@FindBy(xpath="//*[@id='rendered-content']/div/div[1]/footer/div/div/div/div[5]/ul/li[10]/a")WebElement clickEnterprise ;
	public void clickEnterprise(WebDriver driver) 
	{
		clickEnterprise.click();
		
	}
	
	@FindBy(xpath="//*[@id='rendered-content']/div/div/div[1]/div/header/div[2]/div[1]/div/div/div/div[2]/div[2]/a")WebElement clicksolution;
	public void clicksolution(WebDriver driver) 
	{
		clicksolution.click();
	}
	
	@FindBy(xpath="//*[@id='rendered-content']/div/div/div[1]/div/header/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[2]/a/p")WebElement CourseraforCampus;
	public void CourseraforCampus (WebDriver driver) 
	{
		CourseraforCampus.click();
	}
	
	@FindBy(xpath="//*[@id='FirstName']")WebElement FirstName ;
	public void FirstName(WebDriver driver) throws IOException 
	{
		ExcelUtilities ex4=new ExcelUtilities();
		FirstName.click();
		FirstName.sendKeys(ex4.readfill1());
		
	}
	
	@FindBy(xpath="//*[@id='LastName']")WebElement LastName ;
	public void LastName(WebDriver driver) throws IOException 
	{
		ExcelUtilities ex5=new ExcelUtilities();
		LastName.click();
		LastName.sendKeys(ex5.readfill2());
		
	}
	
	@FindBy(xpath="//*[@id='Email']")WebElement Email ;
	public void Email(WebDriver driver) throws IOException 
	{
		ExcelUtilities ex6=new ExcelUtilities();
		Email.click();
		Email.sendKeys(ex6.readfill3());
		
	}
	
	@FindBy(xpath="//*[@id='Phone']")WebElement  PhoneNumber;
	public void PhoneNumber (WebDriver driver) throws IOException 
	{
		ExcelUtilities ex7=new ExcelUtilities();
		PhoneNumber.click();
		PhoneNumber.sendKeys("6382764476");
		
	}
	
	@FindBy(xpath="//*[@id='Company']")WebElement InstitutionName;
	public void InstitutionName(WebDriver driver) throws IOException 
	{
		ExcelUtilities ex8=new ExcelUtilities();
		InstitutionName.click();
		InstitutionName.sendKeys(ex8.readfill5());
		
	}
	
	@FindBy(xpath="//*[@id=\"ValidMsgEmail\"]")WebElement errormsg ;
	public String errormsg(WebDriver driver) 
	{
		return errormsg.getText();
		
	}
	
}

	
