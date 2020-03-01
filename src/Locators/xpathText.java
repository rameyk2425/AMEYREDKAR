package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//xpath using text
		//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		//driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		//driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		//driver.findElement(By.xpath("//a[text()='मराठी']")).click();
		
		
		
	}

}
