package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleListbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//step1
		WebElement wb= driver.findElement(By.xpath("//select[@id='day']"));		
		//step2
		Select s=new Select(wb);
		//step3
		//s.selectByVisibleText("4");
		//s.selectByValue("6");
		//s.selectByIndex(2);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		//s1.selectByVisibleText("Mar");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		//s3.selectByValue("2013");
		
		
//Getting all options present in listbox
		WebElement day1=driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		Select sday= new Select(day1);
		 List<WebElement> ele = sday.getOptions();
		 
		 for (int i = 0; i < ele.size(); i++) {
			 	
			 String value=ele.get(i).getText();
			 //System.out.print(value);
		}
		 
//Verify listbox is single selectable or multi selectable
		 boolean result=sday.isMultiple();
		 //System.out.println(result);
		 if(result==true)
		 {
			//System.out.println("MultiSelected");
		 }
		 else 
		 {
			// System.out.println("Single Selected");
		 }
		
//get selected option in a textbox
		 sday.selectByIndex(6);
		 List<WebElement> option = s.getAllSelectedOptions();
		 String selOption= option.get(0).getText();
		// System.out.println("Selected day is"+selOption);
		 

//get first selected option
		 sday.selectByIndex(8);
		 String firstSel=s.getFirstSelectedOption().getText();
		 System.out.println("First Selected option"+firstSel);
		
		
		
		
		
		
		
	}

}
