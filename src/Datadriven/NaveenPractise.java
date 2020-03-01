package Datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\Telecom\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoopla.co.uk");	
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		zooplaHomePage zHome=new zooplaHomePage(driver);
		
		zHome.setzooplaHomePage("London");
		zHome.clickzooplaHomePage();
		
		zooplaLondonPropertyList zList=new zooplaLondonPropertyList(driver)	;
	
		zList.clickPropertyzooplaLondonPropertyList();
		
		zooplaAgentPage zAgent=new zooplaAgentPage(driver);
		zAgent.getagentLogoezooplaAgentPage();
		zAgent.clickAgentContactNozooplaAgentPage();

		zAgent.getAgentNamezooplaAgentPage();
		
		
		
		
		
	}



}
