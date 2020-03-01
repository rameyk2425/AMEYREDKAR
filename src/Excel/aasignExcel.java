package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class aasignExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		
		for (int i = 0; i <=5; i++) {
			FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
			int row	=WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getLastCellNum();
			System.out.println(row);
			for (int j = 0; j <row; j++) {
				
			
			
			FileInputStream file1 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\screensho\\excel1.xlsx");
			String s	=WorkbookFactory.create(file1).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.print(s+" ");
			}
			System.out.println();
		}
		
	}

}
