package Practo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
		
		
	}
	
	@Test
	public void verify() throws InterruptedException
	{
		
		//Make Appointment
		driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
		Thread.sleep(2000);
		
		//Login
		driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
		driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
	    driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		Thread.sleep(2000);

	    
	    //Slecting the facility option from list and display number of options in list
	    WebElement list =  driver.findElement(By.xpath("//select[@id='combo_facility']"));
	    Select s = new Select(list);
	    List<WebElement> li = s.getOptions();
	    System.out.println("Number of options in  Facility List "+li.size());
	    s.selectByValue("Hongkong CURA Healthcare Center");
	    Thread.sleep(2000);
	    
	    //Select health program
	    driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();
	    Thread.sleep(1000);
	    
	    //Select the booking date
	    WebElement day= driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-calendar']"));
	    day.click();	    
	    Thread.sleep(2000);
	    
	    Actions action = new Actions(driver);
	    WebElement date = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[5]"));
	    action.moveToElement(date).perform();
	    action.click().perform();
	    Thread.sleep(2000);
	    
	    //Write a comment
	    WebElement appointment = driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
	    appointment.click();
	    appointment.sendKeys("Kindly book my appointment");
	    Thread.sleep(2000);	    
	    driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
	    Thread.sleep(2000);	    
	    
	    String actual = driver.findElement(By.xpath("//p[@id='facility']")).getText();
	    String expected="Hongkong CURA Healthcare Center";
	    System.out.println("Verifying selected appointment");
	    Assert.assertEquals(actual, expected);
//	    String current=driver.getCurrentUrl();
//	    System.out.println(current);
//	    
	    //Go to homepage
	    driver.findElement(By.xpath("//a[text()='Go to Homepage']")).click();
	    System.out.println("On Homepage");
	    Thread.sleep(2000);	    

		
	}
	
	@AfterMethod
	public void closeBrow()
	{
		
		driver.close();
	}
		
		
		
		    
		   


	}


