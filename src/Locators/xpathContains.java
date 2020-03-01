package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//xpath contains using attributes 
	//	driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("amey");
	//	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123456789");
	//	driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
//		driver.findElement(By.xpath("//input[contains(@id,'u_0_m')]")).sendKeys("Amey");
//		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Redkar");
//		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("7507657841");
//		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("123456");
//		driver.findElement(By.xpath("//select[contains(@title,'Day')]")).sendKeys("24");
//		driver.findElement(By.xpath("//select[contains(@title,'Month')]")).sendKeys("09");
//		driver.findElement(By.xpath("//select[contains(@name,'birthday_year')]")).sendKeys("1993");
//		driver.findElement(By.xpath("//input[contains(@id,'u_0_7')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
//		
		Thread.sleep(2000);
		driver.close();
		
	}

}
