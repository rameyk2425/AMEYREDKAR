package Datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zooplaAgentPage {
	
	@FindBy(xpath="//h1[text()='Property Listing Details']//following::div[@class='ui-agent__logo'][1]") private WebElement agentLogo;
	@FindBy(xpath="//h1[contains(text(),'sale')]//following::h4[@class='ui-agent__name'] [1]") private WebElement agentName;
	@FindBy(xpath="//h1[contains(text(),'sale')]//following::a[contains(@class,'ui-link')][1]") private WebElement agentContactNo;

	public zooplaAgentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	public void getagentLogoezooplaAgentPage()
	{
		boolean agLogo = agentLogo.isDisplayed();
		System.out.println("Agent Logo Dispalyed" + agLogo);
	}
	
	public void getAgentNamezooplaAgentPage()
	{
		String agName=agentName.getText();
		System.out.println("Agent Name" +agName);
		agentName.click();
		
	}
	public void clickAgentContactNozooplaAgentPage()
	{
		String agContactNO=agentContactNo.getText();
		System.out.println("Agnet contact NO:"+ agContactNO);
		
		
	}
}
