package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class pract1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1 - Copy.xlsx");
		 int celLength = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getLastCellNum();
System.out.println(celLength);
		
//		for (int i = 0; i <= 5; i++) {
//			FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1 - Copy.xlsx");
//			
//			short celLength = WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getLastCellNum();
//			System.out.println(celLength);
//			
//			for (int j = 0; j < celLength; j++) {
//				FileInputStream file1 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1 - Copy.xlsx");
//
//				 String val = WorkbookFactory.create(file1).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
//				 System.out.print(val);
//			}
//			
//			System.out.println();
//		}
		
		
	
		
		
	}

}
