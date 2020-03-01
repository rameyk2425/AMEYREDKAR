package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelSheetHandle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
//		FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel.xlsx");
//		
//		   String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//		   
//		   
//			FileInputStream file2= new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel.xlsx");
//
//		   String value1 = WorkbookFactory.create(file2).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
//
//		   
//			FileInputStream file1= new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel.xlsx");
//
//		   double val=	 WorkbookFactory.create(file1).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();	
//		   
//		   System.out.println(value);
//		   System.out.println(value1);
//
//		   System.out.println(val);
//		   
		for (int j = 0; j <=3; j++) {
			
		
		   for (int i = 0; i <=7; i++) 
		   {
			   FileInputStream file3 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel.xlsx");
			     
			  String str = WorkbookFactory.create(file3).getSheet("sheet1").getRow(j).getCell(i).getStringCellValue();
			  System.out.print(str+" " );      
			
		}
		   System.out.println();
	}
		
	}

}
