package handlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handletable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\ASUS\\Desktop\\table.html");
		
		//getting row size of table
	int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println("Total rows are:"+ rowsize);
//		
		//getting columns size of particular row in table
		int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]//td")).size();
		System.out.println("Total cols  are:"+ colsize);
		
		//print all values in particular row
		List<WebElement> rowText = driver.findElements(By.xpath("//table[@id='1234']//tr[2]//td"));
		
		System.out.println(" value of row 1 ");

		for (int i = 0; i <rowText.size(); i++) {
			
			String rowvalue = rowText.get(i).getText();
			System.out.print( rowvalue +" ");
			
		}
		
		//print all values in particular column
		List<WebElement> colText = driver.findElements(By.xpath("//table[@id='1234']//td[2]"));
		System.out.println("Value in col 2");
		
		for (int i = 0; i < colText.size(); i++) {
			
			String colValue = colText.get(i).getText();
			System.out.println(colValue);
			
			
		}
		
		
			
		
			
			
			
		
		
		
		
		
		
		driver.close();
		
	}

}
