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

public class ZeroDhaLoginPage {
	
	
	//declare
	@FindBy(xpath = "//input[@type='text']") private WebElement userID;
	@FindBy(xpath = "//input[@type='password']") private WebElement pwd;
	@FindBy(xpath= "//button[@type='submit']") private WebElement login;
	
	//initialization
	public ZeroDhaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//username
	public void setZeroDhaLoginPageUN(String un) throws EncryptedDocumentException, IOException {
				
		userID.sendKeys(un);
	}
	
	//password
	public void setZeroDhaLoginPagePWD(String pass) throws EncryptedDocumentException, IOException {
		
		
		pwd.sendKeys(pass);
	}
	
	//Click login button
	public void clickZeroDhaLoginPageLogin() {
		login.click();
	}
	
	
	
	
	

}
