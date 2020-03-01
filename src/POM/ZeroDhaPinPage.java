package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroDhaPinPage {
	
	//Declare
	
	@FindBy(xpath = "//input[@type='password']" ) private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Continue;
	
	
	//initialzation
	ZeroDhaPinPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setZeroDhaPinPagePIN(String pin1) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		
		Thread.sleep(4000);
		Pin.sendKeys(pin1);
		

	}
	
	public void clickZeroDhaPinPageCONT()
	{
		

		Continue.click();
	}
	
	

}
