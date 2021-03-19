package DataDriverSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		File f =new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\Read.xlsx");
		
		FileInputStream in=new FileInputStream(f);
		
		Workbook work=new XSSFWorkbook(in);
		
		Sheet s=work.getSheet("output");
		
		Row r=s.getRow(0);
		
		Cell c=r.getCell(0);
		
		System.out.println(c);
		
		
	}

}
