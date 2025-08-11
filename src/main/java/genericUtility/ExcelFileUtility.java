package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	public String toreaddataFromexcellFile(String Sheetname,int Row,int Cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\kumar\\git\\JPetStore\\new1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String Excell = wb.getSheet(Sheetname).getRow(Row).getCell(Cell).toString();
		
		
		
		return Excell;
		
	}

}
