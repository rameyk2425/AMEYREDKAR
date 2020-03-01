package Framework_Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroDhaLoginPage1 {
	
	@FindBy(xpath="//input[@type='text']") private WebElement userId;
	@FindBy(xpath="//input[@type='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	public ZeroDhaLoginPage1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void setZeroDhaLoginPage1UN(String un)
	{
		userId.sendKeys(un);
	}
	
	public void setZeroDhaLoginPage1PWD(String pwd)
	{
		pass.sendKeys(pwd);
	}
	
	public void clickZeroDhaLoginPage1Login()
	{
		login.click();
	}
}
