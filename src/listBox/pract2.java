package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		Select s=new Select(day);
		s.selectByVisibleText("3");
		
		WebElement firstele = s.getFirstSelectedOption();
		String val = firstele.getText();
		System.out.println(val);
	
		
//		List<WebElement> dayList = s.getAllSelectedOptions();
//		
//		for (int i = 0; i < dayList.size(); i++) {
//			
//			String val = dayList.get(i).getText();
//			System.out.println(val);
//		}



	}

}
