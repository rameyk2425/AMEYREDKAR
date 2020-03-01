package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//Left click by moving mouse and select value by enter on keyboard 
//		Actions act=new Actions(driver);
//		act.moveToElement(month).perform();
//		act.click().perform();
//		
//		//Thread.sleep(3000);
//		
//		for (int i = 1; i <=12; i++) {
//			Thread.sleep(1000);
//
//			act.sendKeys(Keys.ARROW_UP).perform();
//			
//		}
//		for (int i = 1; i <=5; i++) {
//			Thread.sleep(1000);
//
//			act.sendKeys(Keys.ARROW_DOWN).perform();
//			
//		}
//		act.sendKeys(Keys.ENTER).perform();
		
		Actions act1=new Actions(driver);
		//Right click using action class
		//act1.moveToElement(month).contextClick().perform();
		//act1.contextClick(month).perform();;
		
		//Double click
		act1.moveToElement(month).doubleClick().build().perform();
		
		
		
		//driver.close();
		
	}

}
