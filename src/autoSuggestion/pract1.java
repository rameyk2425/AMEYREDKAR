package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Apple");
		Thread.sleep(4000);

	//	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Samsung mobile");
//		Thread.sleep(4000);
//		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
//		int size=ele.size();
//		System.out.println(size);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		int size=list1.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			
			String val = list1.get(i).getText();
			String exp = "Apple iphone 11";
			
			if(val.equalsIgnoreCase(exp))
				list1.get(i).click();
			
		}

	}

}
