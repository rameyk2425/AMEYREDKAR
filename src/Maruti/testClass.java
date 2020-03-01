package Maruti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testClass {
	
	
	
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		
	}

	@Test
	public void verify() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("ameyredkar2425@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Maruti");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Waghmare");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("12345");
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select s=new Select(day);
		s.selectByValue("5");

		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select s1=new Select(month);
		s1.selectByValue("5");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select s2=new Select(year);
		s2.selectByValue("1993");
		
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Maruti");;
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Waghmare");;
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Wipro");;
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Pune");;
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Katraj");;
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Pune");
		WebElement state=driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		Select s4=new Select(state);
		s4.selectByValue("30");
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("000000");
		driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
		Select s5=new Select(state);
		s5.selectByValue("21");
				
		driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("Welcome");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8888888888");
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("1234567890");

		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Ajay");

		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();



		
		
		
		




	}
	
	@AfterMethod
	public void closeBrow()
	{
		
		//driver.close();
	}
}
