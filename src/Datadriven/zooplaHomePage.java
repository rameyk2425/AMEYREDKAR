package Datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zooplaHomePage {
	
	@FindBy(xpath="//input[contains(@id,'search-input-location')]") private WebElement searchTextbox;
	@FindBy(xpath="//button[contains(text(),'Search')]") private WebElement searchButton;

	
	public zooplaHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void  setzooplaHomePage(String location)
	{
		searchTextbox.sendKeys(location);
	}
	
	public void clickzooplaHomePage()
	{
		searchButton.click();
	}
}

