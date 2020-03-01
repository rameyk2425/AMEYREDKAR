package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//for username and password
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amey777@gmail.com");
			//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdefgh");
			//driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
		//create account
			driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Amey");
			driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Redkar");
			driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("7507657841");
			driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("Velo@123");
			driver.findElement(By.xpath("//select[@id='day']")).sendKeys("16");
			driver.findElement(By.xpath("//select[@id='month']")).sendKeys("08");
			driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1993");
			driver.findElement(By.xpath("//input[@id='u_0_7']")).click();


			//driver.findElement(By.xpath("//button[@id='u_0_13']")).click();
		Thread.sleep(3000);	
		driver.close();

	}

}
