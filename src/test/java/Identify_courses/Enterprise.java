package Identify_courses;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Identifypom.coursera;

public class Enterprise extends Baseclass
{
	//scroll down For Enterprise
	
		@Test(priority=0,groups= {"regression","master"})
		public void Enterprises() throws InterruptedException, IOException
		{
			coursera t7=new coursera(driver);
			t7.Homepage(driver);
			WebElement FE=driver.findElement(By.xpath("//*[@id='rendered-content']/div/div[1]/footer/div/div/div/div[5]/p"));
			JavascriptExecutor js3=(JavascriptExecutor)driver;
			js3.executeScript("arguments[0].scrollIntoView();",FE);
			t7.clickEnterprise(driver);
			Thread.sleep(2000);
			path=Baseclass.ss("Enterprises", driver);
			t7.clicksolution(driver);
			Thread.sleep(2000);
			path=Baseclass.ss("solution", driver);
			t7.CourseraforCampus(driver);

			Thread.sleep(2000);
			path=Baseclass.ss("CourseraforCampus", driver);
		}
		//scroll down Ready to transform
		@Test(priority=1,groups= {"regression","master"})
		public void filltheform() throws InterruptedException, IOException
		{
			coursera t8=new coursera(driver);
//			t8.Filltheform(driver);
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
		}
		//Using Select
		@Test(priority=2,groups= {"regression","master"})
		public void textboxes() throws InterruptedException, IOException
		{
			coursera t9=new coursera(driver);
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
			WebElement submitbutton=driver.findElement(By.xpath("//*[@id='mktoForm_1512']/div[50]/span/button"));
			submitbutton.click();
			path=Baseclass.ss("SelectOptions", driver);
			Thread.sleep(4000);
			t9.errormsg(driver);
			System.out.println("");
			System.out.println("Error Message :"+t9.errormsg(driver));
			path=Baseclass.ss("ErrorMsg", driver);
		}

}
