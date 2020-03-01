package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement wb = driver.findElement(By.xpath("//select[@id='upphoneCode']"));
		Select s=new Select(wb);
		
		//s.selectByVisibleText("355");
		//s.selectByValue("1684");
		//s.selectByIndex(4);
		
		boolean res= s.isMultiple();
		//System.out.println(res);
		
		   List<WebElement> ele =s.getOptions();
		   
		   for (int i = 0; i < ele.size(); i++) {
			
			   String str=ele.get(i).getText();
			 //  System.out.println(str);
		}
		   
		   s.selectByIndex(9);
		    List<WebElement> ele1 =s.getAllSelectedOptions();
		     String str1 =ele1.get(0).getText();
		   System.out.println(str1);
		   
		  // s.selectByValue("376");
		   
		   String str2= s.getFirstSelectedOption().getText();
		   
		 //  System.out.println(str2);
		   
		

		
		
		
	}

}
