package Framewrok_pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage2 {

	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement cont;
	
	public ZerodhaPinPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setZerodhaPinPage2PIN(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void clickZerodhaPinPage2CONT()
	{
		cont.click();
	}
}
