package Identify_courses;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import Identifypom.course1;
import Identifypom.course2;
import Identifypom.coursera;


public class Webdevelopment extends Baseclass

{
	//searching
	@Test(priority=0,groups= {"smoke","regression"})
	public void search() throws InterruptedException, IOException
	{
		coursera t1=new coursera(driver);
		t1.searching(driver);
		Thread.sleep(4000);
		path=Baseclass.ss("SearchingText", driver);
	}
	
	
	@Test(priority=1,groups= {"smoke","regression"})
	//filtering level
	public void level() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		WebElement level1=driver.findElement(By.xpath("//*[@id='search-results-header-wrapper']/div/div[1]/div/div[3]/div/div/div[8]/label/div"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",level1);
		Thread.sleep(4000);
		WebElement levelcheckbox=driver.findElement(By.xpath("//span[@class='cds-checkboxAndRadio-labelContent css-imksha']//*[contains(text(),'Beginner')]"));
		js.executeScript("arguments[0].click();", levelcheckbox);
		path=Baseclass.ss("Level", driver);
	}
	
	
	@Test(priority=2,groups= {"regression","master"})
	//filtering languages
	public void language() throws InterruptedException, IOException
	{
		//coursera t3=new coursera(driver);
		Thread.sleep(3000);
		WebElement languages=driver.findElement(By.xpath("//*[contains(text(), 'Language')]"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",languages);
		Thread.sleep(3000);
		WebElement languageshowmore=driver.findElement(By.xpath("//*[@id='search-results-header-wrapper']/div/div[1]/div/div[2]/div[2]/button/span"));
		js1.executeScript("arguments[0].click();", languageshowmore);
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority=3,groups= {"regression","master"})
	//mini-window
	public void selectlanguage() throws InterruptedException, IOException
	{
		coursera t4=new coursera(driver);
		Thread.sleep(4000);
		t4.selectlanguagetxt(driver);
		Thread.sleep(4000);
		t4.selectEnglish(driver);
		Thread.sleep(4000);
		t4.apply(driver);
		path=Baseclass.ss("Language", driver);
	}
	
	
	@Test(priority=4,groups= {"regression","master"})
	//first course details
	public void course01() throws InterruptedException, IOException
	{ 
		WebElement gotoresult=driver.findElement(By.xpath("//*[@id='search-results-header-wrapper']/div/div[1]/div/h3"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",gotoresult);
		Thread.sleep(3000);
		course1 cc1=new course1(driver);
		js2.executeScript("arguments[0].click();", driver.findElement(By.linkText("Meta Front-End Developer")));
		oldwindow=driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String>handle=driver.getWindowHandles();
		for(String newwindow1:handle)
		{
			driver.switchTo().window(newwindow1);
		}
		path=Baseclass.ss("Course_01", driver);
		System.out.println("Course-1");
		Thread.sleep(3000);
		System.out.println("Course Name :"+cc1.c101());
		System.out.println("Course Duration :"+cc1.c102());
		System.out.println("Course Rating :"+cc1.c103());
		driver.close();
		driver.switchTo().window(oldwindow);
		System.out.println(" ");
	}
	
	
	//second course details
	@Test(priority=5,groups= {"regression","master"})
	public void course02() throws InterruptedException, IOException
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
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(oldwindow);
		System.out.println("");
	}

}
