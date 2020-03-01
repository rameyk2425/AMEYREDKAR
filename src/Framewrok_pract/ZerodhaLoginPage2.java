package Framewrok_pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage2 {
	
	@FindBy(xpath="//input[@type='text']") private WebElement userID;
	@FindBy(xpath="//input[@type='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	public ZerodhaLoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void setZerodhaLoginPage2UN(String UN)
	{
		userID.sendKeys(UN);
	}
	
	public void setZerodhaLoginPage2PASS(String PASS)
	{
		pass.sendKeys(PASS);
	}
	
	public void clickZerodhaLoginPage2LOGIN()
	{
		login.click();;
	}
	

}
