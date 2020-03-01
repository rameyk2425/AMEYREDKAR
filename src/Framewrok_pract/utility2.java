package Framewrok_pract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility2 {
	
	public static String getTestdata(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		String val = WorkbookFactory.create(file).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
		return val;
       
		
	}
	
	public static void takeScreenshot(WebDriver driver,int testid) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest= new File("C:\\Users\\ASUS\\Desktop\\screensho\\scr"+testid+".jpeg");
		FileHandler.copy(src, dest);
	}
	

}
