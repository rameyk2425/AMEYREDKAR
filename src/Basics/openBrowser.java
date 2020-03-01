package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();  //use to open browser
		
//		driver.get("https://www.google.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		
/*		driver.navigate().to("https://www.google.com/"); //navigate method
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);		
		*/
		
/*		String act=driver.getTitle();   //to get title name of page visited
		String exp="Google";
		
		if(act.equals(exp))				//checking title of page visited with expected value
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}  */
		
//		String url=driver.getCurrentUrl();  //to get current url of the page visited
//		System.out.println(url);
		
		
		driver.manage().window().maximize();//use to maximize browser
		Thread.sleep(2000);
		
		Dimension d=new Dimension(700,1000);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.close();
		//driver.quit();

	
	}

}
