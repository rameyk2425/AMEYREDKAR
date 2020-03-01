package Framework_Auto;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static String getTestData(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
		 String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	public static void takeScreenshot(WebDriver driver,int TCID) throws IOException
	{
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       File dest= new File("C:\\Users\\ASUS\\Desktop\\screensho\\scr"+TCID+".jpeg");
	       FileHandler.copy(src, dest);
	}
}
