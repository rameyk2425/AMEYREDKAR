package Framewrok_pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage2 {
	
	@FindBy(xpath="//span[@class='nickname']") private WebElement header; 
	@FindBy(xpath="//span[text()='FU9724']") private WebElement profileName;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout; 
	
	public ZerodhaHomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyZerodhaHomePage2HEADER()
	{
		String act = header.getText();
		return act;
		
	}
	
	public void clickZerodhaHomePage2PROFILENAME()
	{
	profileName.click();
		
	}
	
	public void clickZerodhaHomePage2LOGOUT()
	{
	logout.click();
		
	}



}
