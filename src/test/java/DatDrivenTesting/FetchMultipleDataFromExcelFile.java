package DatDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcelFile {

	public static void main(String[] args) throws Throwable, Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\TestData.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet("InsertMapDatatoExcel");
		
		int rowNum = sheet.getLastRowNum();//374
        System.out.println(rowNum);
        
        for (int i = 0; i <rowNum; i++) 
        {
        	Row row = sheet.getRow(i);
        	                         //0
        	for (int j = 0; j <row.getLastCellNum() ; j++)
        	{
        		Cell cell = row.getCell(j);
               String links = cell.getStringCellValue();
			System.out.println(links);
        	}
		}

	}

}
