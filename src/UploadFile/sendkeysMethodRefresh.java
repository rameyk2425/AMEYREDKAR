package UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeysMethodRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(8000);
		System.out.println("Refresh");
//		driver.navigate().to(driver.getCurrentUrl());
//		System.out.println("Refresh");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.F5);
		System.out.println("Refresh");
		
		

		
	}

}
