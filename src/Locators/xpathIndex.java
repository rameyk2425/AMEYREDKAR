package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Amey");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Redkar");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("7507657841");
		
		
	}

}
