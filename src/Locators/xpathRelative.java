package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathRelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.redbus.in/");
		driver.get("https://www.facebook.com/");

		//link and linktest
	//	driver.findElement(By.linkText("Help")).click();
	//	driver.findElement(By.linkText("lp")).click();

	       WebElement wb = driver.findElement(By.xpath("//input[@id='u_0_6']"));
	       boolean result=wb.isSelected();
	       System.out.println(result);
	       
	       if(result==true)
	       {
	    	   System.out.println("Selected");
	       }
	       else
	       {
	    	   System.out.println("Not selected");
	    	   wb.click();
	       }
		
	//	driver.close();
		
	}

}
