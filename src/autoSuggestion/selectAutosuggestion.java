package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Samsung mobile");
		Thread.sleep(4000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		int size=ele.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			
			String act = ele.get(i).getText();
			String exp="Samsung mobile m30";
			
			if(act.equalsIgnoreCase(exp))
			{
				ele.get(i).click();
			}
			
		}
		
	}

}
