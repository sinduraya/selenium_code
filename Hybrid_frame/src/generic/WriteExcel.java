package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel 
{
	public static String ddt(String Sheet,int Row1,int Cell1) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fis=new FileInputStream("./excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(Sheet);
		Row row = sheet.getRow(Row1);
		Cell cell = row.getCell(Cell1);
		String value = cell.toString();
		
		return value;
		
	}

}
