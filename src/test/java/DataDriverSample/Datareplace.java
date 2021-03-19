package DataDriverSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datareplace {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\Read.xlsx");
		
		FileInputStream input = new FileInputStream(file);
		
		Workbook work=new XSSFWorkbook(input);
		
		Sheet sheet = work.getSheet("output");
		
		Row row=sheet.getRow(0);
		
		Cell cell =row.getCell(0);
		
		cell.setCellValue("viji");
		
		
		FileOutputStream replace = new FileOutputStream(file);
		
		work.write(replace);
		
		
		
		
		
		
		
	}

}
