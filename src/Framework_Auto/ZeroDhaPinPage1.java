package Framework_Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroDhaPinPage1 {
	
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement cont;
	
	public ZeroDhaPinPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setZeroDhaPinPage2pin(String pin1)
	{
		pin.sendKeys(pin1);
	}
	
	public void clickZeroDhaPinPage2CONT()
	{
		cont.click();
	}
	
}
