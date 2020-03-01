package Datadriven;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class zooplaLondonPropertyList {
	
	@FindBy(xpath="//ul[@class='listing-results clearfix js-gtm-list']/li[5]/following::a[1]") private WebElement selectProperty;
	//@FindBy(xpath="//ul[@class='listing-results clearfix js-gtm-list']/li") private List <WebElement> listOFProperty;
	
	

	public zooplaLondonPropertyList(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickPropertyzooplaLondonPropertyList()
	{
		selectProperty.click();
//		for (int i = 0; i < listOFProperty.size(); i++) {
//			
//			String propertyPrice = listOFProperty.get(i).getText();
//			System.out.println("Propeerty Price in descending order");
//			System.out.println(propertyPrice);
//			
//			if(i==4) {
//				listOFProperty.get(i).click();
//
//				
//			}
//		}
		
		
		
		
	}
}

			

	
