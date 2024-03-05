package stepdefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import Identify_courses.Baseclass;
import Identifypom.course1;
import Identifypom.course2;
import Identifypom.coursera;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.ExcelUtilities;

public class test 
{
	public static WebDriver driver; 
	public String oldwindow;
	public static String path;
	@Given("user navigates to Coursera website")
	public void user_navigates_to_coursera_website() 
	{
		int browser;
		Scanner sc=new Scanner(System.in);
		System.out.println("Select a browser");
		System.out.println("1.Chrome     2.Edge");
		browser=sc.nextInt();
		if(browser==1)
			driver = new ChromeDriver();
		else if(browser==2)
			driver=new EdgeDriver();
		else
			System.out.println("Invalid Browser");
		driver.manage().deleteAllCookies();
		driver.get("https://www.coursera.org/");
		driver.manage().window().maximize();
	}

	@When("searches for Web Development Courses")
	public void searches_for_web_development_courses() throws InterruptedException, IOException 
	{
		coursera t1=new coursera(driver);
		t1.searching(driver);
		Thread.sleep(4000);
		path=Baseclass.ss("SearchingText", driver);
		
	}

	@When("level is selected as beginner")
	public void level_is_selected_as_beginner() throws IOException, InterruptedException 
	{
		WebElement level1=driver.findElement(By.xpath("//*[contains(text(), 'Level')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",level1);
		Thread.sleep(3000);
		WebElement levelcheckbox=driver.findElement(By.xpath("//span[@class='cds-checkboxAndRadio-labelContent css-imksha']//*[contains(text(),'Beginner')]"));
		js.executeScript("arguments[0].click();", levelcheckbox);
		path=Baseclass.ss("Level", driver);
		
	}

	@When("language is selected as English")
	public void language_is_selected_as_english() throws InterruptedException, IOException 
	{
		WebElement languages=driver.findElement(By.xpath("//*[contains(text(), 'Language')]"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",languages);
		Thread.sleep(3000);
		WebElement languageshowmore=driver.findElement(By.xpath("//*[@id='search-results-header-wrapper']/div/div[1]/div/div[2]/div[2]/button/span"));
		js1.executeScript("arguments[0].click();", languageshowmore);
		Thread.sleep(3000);
		coursera t4=new coursera(driver);
		Thread.sleep(4000);
		t4.selectlanguagetxt(driver);
		Thread.sleep(4000);
		t4.selectEnglish(driver);
		Thread.sleep(4000);
		t4.apply(driver);
		path=Baseclass.ss("Language", driver);
		
	}

	@Then("get first course details")
	public void get_first_course_details() throws IOException, InterruptedException 
	{
		WebElement gotoresult=driver.findElement(By.xpath("//*[@id='search-results-header-wrapper']/div/div[1]/div/h3"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",gotoresult);
		Thread.sleep(3000);

		course1 cc1=new course1(driver);
		
		js2.executeScript("arguments[0].click();", driver.findElement(By.linkText("Meta Front-End Developer")));

		oldwindow=driver.getWindowHandle();
		Set<String>handle=driver.getWindowHandles();
		for(String newwindow1:handle)
		{
			driver.switchTo().window(newwindow1);
		}
		path=Baseclass.ss("Course_01", driver);
		System.out.println("Course-1");
		Thread.sleep(2000);

		System.out.println("Course Name :"+cc1.c101());

		System.out.println("Course Duration :"+cc1.c102());

		System.out.println("Course Rating :"+cc1.c103());

		driver.close();
		driver.switchTo().window(oldwindow);
		System.out.println(" ");
		
	}

	@Then("get second course details")
	public void get_second_course_details() throws InterruptedException, IOException 
	{
		System.out.println(" ");
		Thread.sleep(4000);
		course2 cc2 =new course2(driver);
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();", driver.findElement(By.linkText("Introduction to Web Development")));
		oldwindow=driver.getWindowHandle();
		Set<String>handles1=driver.getWindowHandles();
		for(String newwindow2:handles1)
		{
			driver.switchTo().window(newwindow2);
		}
		path=Baseclass.ss("Course_02", driver);
		System.out.println("Course-2");
		System.out.println("Course Name :"+cc2.c201());
		System.out.println("Course Duration :"+cc2.c202());
		System.out.println("Course Rating :"+cc2.c203());

		driver.close();
		driver.switchTo().window(oldwindow);
		System.out.println("");
		
	}

	
	
	@Given("user navigates to the home page")
	public void user_navigates_to_the_home_page() throws InterruptedException 
	{
		
		coursera t6=new coursera(driver);
		Thread.sleep(4000);
		t6.Homepage(driver);
		
	}

	@When("searches for Language Learning")
	public void searches_for_language_learning() throws InterruptedException, IOException 
	{
		coursera t6=new coursera(driver);
		t6.llsearching(driver);
		System.out.println("");
	}

	@Then("count of levels available is taken")
	public void count_of_levels_available_is_taken() throws InterruptedException
	{
		WebElement scroll1=driver.findElement(By.xpath("//*[contains(text(), 'Level')]"));
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView();",scroll1);
		List<String>levelcount=new ArrayList<String>();
		for(int i=1;i<=4;i++)
		{
			String levelsep=driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[4]/div/div/div["+i+"]/label/div/span")).getText();
			levelcount.add(levelsep);
		}
		System.out.println(levelcount);
		System.out.println("Total Level Count :"+levelcount.size());
		Thread.sleep(7000);
	}

	@Then("count of languages available is taken")
	public void count_of_languages_available_is_taken() throws InterruptedException 
	{
		coursera t601=new coursera(driver);
		WebElement languagescroll=driver.findElement(By.xpath("//*[contains(text(), 'Language')]"));
		JavascriptExecutor ls=(JavascriptExecutor)driver;
		ls.executeScript("arguments[0].scrollIntoView();",languagescroll);
		Thread.sleep(6000);
		ls.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='search-results-header-wrapper']/div/div[1]/div/div[3]/div[2]/button/span")));
		Thread.sleep(7000);
		List<String>langlist=new ArrayList<String>();
		for(int i=1;i<=24;i++)
		{
			String lang=driver.findElement(By.xpath("//*[@id='checkbox-group']/div["+i+"]")).getText();
			langlist.add(lang);
		}
		System.out.println(langlist);
		System.out.println("Total Language Count :"+langlist.size());
		Thread.sleep(5000);
		t601.applyies(driver);
	}

	
	
	
	
	@Given("user navigates back to the home page")
	public void user_navigates_back_to_the_home_page() 
	{
		coursera t7=new coursera(driver);
		t7.Homepage(driver);
	}

	@Given("clicks for enterprise")
	public void clicks_for_enterprise() throws IOException 
	{
		coursera t7=new coursera(driver);
		WebElement FE=driver.findElement(By.xpath("//*[@id='rendered-content']/div/div[1]/footer/div/div/div/div[5]/p"));
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollIntoView();",FE);
		t7.clickEnterprise(driver);
		path=Baseclass.ss("Enterprises", driver);
	}

	@When("solution is selected")
	public void solution_is_selected() throws InterruptedException, IOException 
	{
		coursera t7=new coursera(driver);
		t7.clicksolution(driver);
		Thread.sleep(2000);
		path=Baseclass.ss("solution", driver);

	}

	@When("clicks coursera for campus")
	public void clicks_coursera_for_campus() throws InterruptedException, IOException 
	{
		coursera t7=new coursera(driver);
		t7.CourseraforCampus(driver);
		Thread.sleep(2000);
		path=Baseclass.ss("CourseraforCampus", driver);
	}

	@Then("fills ready to transform form")
	public void fills_ready_to_transform_form() throws InterruptedException, IOException 
	{
		coursera t8=new coursera(driver);
//		t8.Filltheform(driver);
		Thread.sleep(4000);
		WebElement FF=driver.findElement(By.xpath("//*[@id='rendered-content']/div/div/main/div/div[7]/div/div[2]/div/div/div/div/div/div[2]/div[3]"));
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView();",FF);
		
		t8.FirstName(driver);
		t8.LastName(driver);
		t8.Email(driver);
		t8.PhoneNumber(driver);
		t8.InstitutionName(driver);
		Thread.sleep(2000);
		path=Baseclass.ss("filltheform", driver);
		Thread.sleep(2000);
		Select Institutiontype=new Select(driver.findElement(By.xpath("//*[@id='Institution_Type__c']")));
		Institutiontype.selectByVisibleText("Other");
		Select Jobrole=new Select(driver.findElement(By.xpath("//*[@id='Title']")));
		Jobrole.selectByVisibleText("Student");
		Thread.sleep(2000);
		Select Department=new Select(driver.findElement(By.xpath("//*[@id='Department']")));
		Department.selectByVisibleText("Continuing Education");
		Select bestdescribes=new Select(driver.findElement(By.xpath("//*[@id='What_the_lead_asked_for_on_the_website__c']")));
		bestdescribes.selectByVisibleText("Tech Support");
		Thread.sleep(4000);
		Select country=new Select(driver.findElement(By.xpath("//*[@id='Country']")));
		country.selectByVisibleText("India");
		Select state=new Select(driver.findElement(By.xpath("//*[@id='State']")));
		state.selectByVisibleText("Tamil Nadu");
		Thread.sleep(4000);
		
	}

	@Then("clicks submit button")
	public void clicks_submit_button() throws IOException 
	{
		WebElement submitbutton=driver.findElement(By.xpath("//*[@id='mktoForm_1512']/div[50]/span/button"));
		submitbutton.click();
		path=Baseclass.ss("SelectOptions", driver);
		
	}

	@Then("captures error message")
	public void captures_error_message() throws InterruptedException, IOException 
	{
		coursera t9=new coursera(driver);
		Thread.sleep(4000);
		t9.errormsg(driver);
		System.out.println("");
		System.out.println("Error Message :"+t9.errormsg(driver));
		path=Baseclass.ss("ErrorMsg", driver);
		Thread.sleep(4000);
		driver.quit();
	}
}
