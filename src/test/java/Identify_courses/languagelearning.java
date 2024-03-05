package Identify_courses;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import Identifypom.coursera;

public class languagelearning extends Baseclass
{
	
	//Language Learning
	public coursera co=new coursera(driver);
		@Test(priority=0,groups= {"regression","master"})
		public void courseraHome() throws InterruptedException, IOException
		{
			
			
			coursera t6=new coursera(driver);
			t6.Homepage(driver);
			Thread.sleep(4000);
			t6.llsearching(driver);
			System.out.println("");

			//level count
//			t6.scroll1(driver);
			Thread.sleep(4000);
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
//			t6.languagescroll(driver);
			
			
			
		}
		//language count
		@Test(priority=1,groups= {"regression","master"})
		public void showmore() throws InterruptedException
		{
			coursera t601=new coursera(driver);
			WebElement languagescroll=driver.findElement(By.xpath("//*[contains(text(), 'Language')]"));
			JavascriptExecutor ls=(JavascriptExecutor)driver;
			ls.executeScript("arguments[0].scrollIntoView();",languagescroll);
			Thread.sleep(6000);
			ls.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='search-results-header-wrapper']/div/div[1]/div/div[2]/div[2]/button/span")));
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

}
