package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class pract5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		            
		  		  File dest = new File("C:\\Users\\ASUS\\Desktop\\screensho\\pract5.jpeg");
		            
		            FileHandler.copy(src, dest);
	}

}
