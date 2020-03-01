package handlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtable {

	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ASUS\\\\Desktop\\\\Automation\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ASUS/Desktop/table.html");
		
		 int row = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println("Row="+row);
		
		int col=driver.findElements(By.xpath("//table[@id='1234']//tr[2]//td")).size();
		System.out.println("Column="+col);
		
		

//		for(int i=0;i<col;i++)
//			System.out.print(rolval.get(i).getText()+" ");
//		System.out.println();
		
	//	List<WebElement> eles = driver.findElements(By.xpath("//table[@id='1234']//td[2]"));

	for(int i=2;i<=row;i++)
		{

			for(int j=0;j<col;j++)
			{
				List<WebElement> rolval = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]//td"));

				System.out.print(rolval.get(j).getText()+" ");
			}
			System.out.println();
		}
		
		
		driver.close();
	}
}
