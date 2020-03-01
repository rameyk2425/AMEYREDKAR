package Framework_Auto;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZeroDhaTest1 extends browserFactory {

		WebDriver driver;
		ZeroDhaLoginPage1 LOGIN;
		ZeroDhaPinPage1 PIN;
		ZeroDhaHomePage1 HOME;
		int TCID;

		
		@BeforeClass
		public void openBrowser()
		{
	//		Reporter.log("Open browser", true);

			driver=openBrowser1();
			LOGIN=new ZeroDhaLoginPage1(driver);
			PIN= new ZeroDhaPinPage1(driver);
			HOME=new ZeroDhaHomePage1(driver);
			
		}
		
		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException
		{
			//Reporter.log("Login to app", true);
			String un = Utility.getTestData(0, 0);
			LOGIN.setZeroDhaLoginPage1UN(un);
			
			String pass = Utility.getTestData(0, 1);
			LOGIN.setZeroDhaLoginPage1PWD(pass);
			
			LOGIN.clickZeroDhaLoginPage1Login();
			
			
			Thread.sleep(3000);
			String pinn = Utility.getTestData(0, 2);
			PIN.setZeroDhaPinPage2pin(pinn);
			
			PIN.clickZeroDhaPinPage2CONT();
			Thread.sleep(1000);
			
			
			
		}
		
		@Test
		public void verifyHeader()
		{
			//Reporter.log("Running verify header script", true);
			TCID=101;
			String act=HOME.verifyZeroDhaHomePage2header();
			
			String exp="Shrinivas11";
			
			Assert.assertEquals(act, exp);
		}
		
		@AfterMethod
		public void logoutFromApp(ITestResult results) throws InterruptedException, IOException
		{
			//Reporter.log("Logout fro app", true);
			if(results.getStatus()==ITestResult.FAILURE)
				Utility.takeScreenshot(driver, TCID);
			
			
			HOME.clickZeroDhaHomePage2profileName();
			Thread.sleep(1000);
			
			HOME.clickZeroDhaHomePage2logout();
		}
		
		@AfterClass
		public void closeBrowser()
		{
			//Reporter.log("Close the browser", true);
		driver.close();
		LOGIN=null;
		PIN=null;
		HOME=null;
		}
		
		
		

	

}
