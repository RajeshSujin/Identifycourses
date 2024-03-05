package Identify_courses;
 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class Baseclass 
{
	public static WebDriver driver;
	public String oldwindow;
	public static String path;
	//browseropen
	@BeforeTest(groups= {"smoke","regression","master"})
	@Parameters("browser")
	public void launchBrowser(String Browser) throws InterruptedException, MalformedURLException {
//		switch(Browser) {
//		case "chrome":
//			driver = new ChromeDriver();
//			break;
//		case "edge":
//			driver=new EdgeDriver();
//			break;
//		default:
//			System.out.println("No matching browser");
//		}
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WIN11);
		capabilities.setBrowserName("MicrosoftEdge");
		driver = new RemoteWebDriver(new URL("http://192.168.138.4:4444"), capabilities);
		driver.manage().deleteAllCookies();
		driver.get("https://www.coursera.org/");
		//Thread.sleep(20000);
		driver.manage().window().maximize();
	}
	
	
	
	//closebrowser
	@AfterTest(groups= {"smoke","regression","master"})
	public void closebrowser()
	{
		driver.close();
	}
	
	public static String ss(String filename, WebDriver driver) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir") + "\\Screenshot\\" + filename + ".png");
		FileUtils.copyFile(src, trg);
		return trg.getAbsolutePath();
	}
 
}