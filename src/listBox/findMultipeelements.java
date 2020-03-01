package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findMultipeelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		   List<WebElement> links = driver.findElements(By.xpath("//a"));
		   int size= links.size();
		   System.out.println("Total number of links "+size);
		   
		   for (int i = 0; i < size; i++) {
			   
			  String str = links.get(i).getText();
			  String exp="Gmail";
			  //System.out.println(str);
			
			  if(str.equals(exp))
			  {
				  links.get(i).click();
			  }
		}
		
	}

}
