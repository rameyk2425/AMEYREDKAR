package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.ToStringMethod;

import org.apache.*;

public class basicStart {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException ,IllegalStateException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		String un = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		String pwd = WorkbookFactory.create(file1).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		double pin = WorkbookFactory.create(file2).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
		String pin1= String.valueOf(pin);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pin1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement webactual=driver.findElement(By.xpath("//span[@class='nickname']"));	
		String actual = webactual.getText();
		String exp="Kulkarni";

		
		if(actual.equalsIgnoreCase(exp))
		{
			System.out.println("Validated");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='DV1510']")).click();
			driver.findElement(By.xpath("//span[@class='icon icon-exit']")).click();
		}
		else
		{
			System.out.println("Not validated");
		}
		
		//driver.close();


		
		
			
	}

}
