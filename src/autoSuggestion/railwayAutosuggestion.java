package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class railwayAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[@class=\"ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]")).sendKeys("Saw");
		Thread.sleep(4000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class=\"ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-star-inserted\"]//li"));
		int size=ele.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			
			String str = ele.get(i).getText();
			String ext = "SAWANTWADI ROAD - SWV";
			
			if(str.equalsIgnoreCase(ext))
			{
				ele.get(i).click();
			}
			
		}
	
	}

}
