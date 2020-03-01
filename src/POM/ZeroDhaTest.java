package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroDhaTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ZeroDhaLoginPage login=new ZeroDhaLoginPage(driver);
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		String un = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		login.setZeroDhaLoginPageUN(un);
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		String pass = WorkbookFactory.create(file1).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		login.setZeroDhaLoginPagePWD(pass);
		login.clickZeroDhaLoginPageLogin();

		ZeroDhaPinPage Pin= new ZeroDhaPinPage(driver);
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		double pin = WorkbookFactory.create(file2).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
		String pin1= String.valueOf(pin);
		Pin.setZeroDhaPinPagePIN(pin1);
		Pin.clickZeroDhaPinPageCONT();
		
		ZeroDhaHomePage home= new ZeroDhaHomePage(driver);
		home.verifyZeroDhaHomePageheader();
		home.clickZeroDhaHomePageprofilename();
		home.clickZeroDhaHomePagelogout();
	}

}
