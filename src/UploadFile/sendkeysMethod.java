package UploadFile;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Arguments;

import net.bytebuddy.asm.Advice.Argument;

public class sendkeysMethod {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60 , TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(1000);
		
	}
	
	@Test
	public void uploadTest() throws InterruptedException
	{
		
		WebElement browse=driver.findElement(By.xpath("//*[@id=\"exp-6\"]"));

		
		WebElement browse1=driver.findElement(By.xpath("//*[@id=\"photo\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", browse);
		
		Thread.sleep(3000);
		browse1.sendKeys("C:\\Users\\ASUS\\Downloads\\FullSizeRender.jpg");
		
		Thread.sleep(3000);
		
		File f=new File("C:\\Users\\ASUS\\Downloads\\FullSizeRender.jpg");
		boolean value = f.exists();
		System.out.println(value);
	//	Assert.assertTrue(value);
	}
	
	@AfterMethod
	public void teerDown()
	{
		driver.quit();
	}

}
