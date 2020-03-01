package Framework_Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroDhaHomePage1 {
	
	@FindBy(xpath="//span[@class='nickname']") private WebElement header;
	@FindBy(xpath="//span[text()='FU9724']") private WebElement profileName;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	public ZeroDhaHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyZeroDhaHomePage2header()
	{
		String act=header.getText();
		return act;

	}
	
	public void clickZeroDhaHomePage2profileName()
	{
		profileName.click();
	}
	
	public void clickZeroDhaHomePage2logout()
	{
		logout.click();
	}
}

	