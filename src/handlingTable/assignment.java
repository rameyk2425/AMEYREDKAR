package handlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\ASUS\\Desktop\\table.html");
		
		int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println("Total rows are:"+ rowsize);
		
				
		//getting columns size of particular row in table
		int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]//td")).size();
		System.out.println("Total cols  are:"+ colsize);

		//print all values in particular column
		List<WebElement> colText = driver.findElements(By.xpath("//table[@id='1234']//td[2]"));
		//System.out.println("Value in col 2");
		
		for (int i = 2; i <=rowsize; i++) {
			
			
				WebElement web2 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//td[2]"));

				String colValue = web2.getText();
			
		
			if(colValue.equals("Selenium"))
			{
				System.out.println(i);
				
				
						WebElement web1 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//td[3]"));

					String rowvalue = web1.getText();
					System.out.print( rowvalue +" ");
					
				
			}
			
			
		}
				
						
						
						
					


						
				driver.close();

	}

}
