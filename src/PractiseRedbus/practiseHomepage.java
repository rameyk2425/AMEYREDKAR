package PractiseRedbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiseHomepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.redbus.in/");
		//driver.navigate().to("https://www.google.com/");
		driver.get("https://www.facebook.com");

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		WebElement wb = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(wb);
		List<WebElement> month = s.getOptions();
		
		for (int i = 0; i < month.size(); i++) {
			String monthText=month.get(i).getText();
			//System.out.println(monthText);
		}
		
		boolean value= s.isMultiple();
		//System.out.println(value);
		
		s.selectByIndex(6);
		 WebElement firVal = s.getFirstSelectedOption();
		 String firstr= firVal.getText();
		// System.out.println(firstr);
		 
			s.selectByIndex(7);

		 List<WebElement> listAll = s.getAllSelectedOptions();
		 String listVal=listAll.get(0).getText();
	//	 System.out.println(listVal);
		 
		 
		 WebElement web1 = driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		 
		 Select syear=new Select(web1);
		 List<WebElement> yearList = syear.getOptions();
		 for (int i = 0; i < yearList.size(); i++) {
			 
			 String yrList=yearList.get(i).getText();
			 //System.out.println(yrList);
		}
		 
		 boolean br= s.isMultiple();
		 System.out.println(br);
		 
		 syear.selectByValue("2005");
		 List<WebElement> list11 = syear.getAllSelectedOptions();
		 String stval=list11.get(0).getText();
		 System.out.println(stval);
		 
		syear.selectByValue("1989");
		 String ss = syear.getFirstSelectedOption().getText();
		 System.out.println(ss);
		
		
		
		driver.close();
	}

}
