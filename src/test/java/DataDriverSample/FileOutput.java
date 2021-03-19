package DataDriverSample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOutput {
	
	public static void main(String[] args) throws IOException {
		
		
		File file=new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\Read.xlsx");
		
		Workbook work=new XSSFWorkbook();
		
		Sheet sheet=work.createSheet("output");
		
		Row row=sheet.createRow(0);
		
		
		Cell cell=row.createCell(0);
		
		cell.setCellValue("selvam");
		
		FileOutputStream out=new FileOutputStream(file);
		
		work.write(out);
		
		System.out.println("done");
		
		
		
	}

}
