package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.redbus.in/");
		driver.get("https://www.facebook.com/");

		
		//getText method
		//1st approach
		String str=driver.findElement(By.xpath("//a[text()='HOTELS ']")).getText();
		//System.out.println(str);
		
		//2 approach
		 WebElement wb= driver.findElement(By.xpath("//a[text()='PILGRIMAGES ']"));
		 String str1=wb.getText();
		 //System.out.println(str1);
		 
		 //isDispalyed
		 boolean result= driver.findElement(By.xpath("//a[contains(@id,'redBus Bus Hire')]")).isDisplayed();
		// System.out.println(result);
		 if(result==true)
		 {
			// System.out.println("Pass");
		 }
		 else
		 {
			// System.out.println("Fail");
		 }
		 
		 //IsEnabled
		 boolean result1=driver.findElement(By.xpath("//a[text()='redbus']")).isEnabled();
		// System.out.println(result1);
		 if(result1==true)
		 {
			// System.out.println("Enabled");
		 }
		 else
		 {
			 //System.out.println("Disabled");
		 }
		 
		 //isSelected
		  WebElement web= driver.findElement(By.xpath("//input[@id='u_0_9']"))  ; 
		  web.click();
		  boolean result2=web.isSelected();
		  System.out.println(result2);
	}
	

}
