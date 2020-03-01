package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroDhaHomePage {
	
	@FindBy(xpath="//span[@class='nickname']") private WebElement Header;
	@FindBy(xpath="//span[text()='FU9724']") private WebElement profileName;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	public ZeroDhaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyZeroDhaHomePageheader()
	{
		String act = Header.getText();
		String exp = "Shrinivas";
		
		if(act.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

	public void clickZeroDhaHomePageprofilename()
	{
		profileName.click();
	}
	
	public void clickZeroDhaHomePagelogout()
	{
		logout.click();
	}
	
	

}
