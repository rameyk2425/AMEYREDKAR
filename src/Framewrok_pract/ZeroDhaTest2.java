package Framewrok_pract;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZeroDhaTest2 extends browserFactory2 {
	
	WebDriver driver;
	ZerodhaLoginPage2 LOGINPAGE;
	ZerodhaPinPage2 PINPAGE;
	ZerodhaHomePage2 HOMEPAGE;
	int TCid;

	
	@BeforeClass
	public void openBrowser()
	{
		driver=openBrowser2();
		LOGINPAGE=new ZerodhaLoginPage2(driver);
		PINPAGE=new ZerodhaPinPage2(driver);
		HOMEPAGE=new ZerodhaHomePage2(driver);
	}
	
	@BeforeMethod
	public void loginToAPP() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String UN=utility2.getTestdata(0, 0);
		LOGINPAGE.setZerodhaLoginPage2UN(UN);
		
		String PASS=utility2.getTestdata(0, 1);
		LOGINPAGE.setZerodhaLoginPage2PASS(PASS);
		
		LOGINPAGE.clickZerodhaLoginPage2LOGIN();
		
		Thread.sleep(3000);

		String PIN=utility2.getTestdata(0, 2);
		PINPAGE.setZerodhaPinPage2PIN(PIN);
		
		PINPAGE.clickZerodhaPinPage2CONT();
		Thread.sleep(3000);

	}
	
	@Test
	public void verifyHeader()
	{
		TCid=102;
		String act = HOMEPAGE.verifyZerodhaHomePage2HEADER();
		String exp="Shrinivas1";
		
		Assert.assertEquals(act, exp);
		
	}
	@AfterMethod
	public void logoutApp(ITestResult results) throws InterruptedException, IOException
	{
		if(results.getStatus()==ITestResult.FAILURE)
		{
			utility2.takeScreenshot(driver, TCid);
		}
		
		HOMEPAGE.clickZerodhaHomePage2PROFILENAME();
		Thread.sleep(1000);
		HOMEPAGE.clickZerodhaHomePage2LOGOUT();
			
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//Reporter.log("Close the browser", true);
	driver.close();
	LOGINPAGE=null;
	PINPAGE=null;
	HOMEPAGE=null;
	}
}
