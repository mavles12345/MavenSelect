package DataDriverSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSample {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\Datafile.xlsx");

		FileInputStream input = new FileInputStream(file);

		Workbook workBook = new XSSFWorkbook(input);

		Sheet sheet = workBook.getSheet("Input");

		String value = null;

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				int cellType = cell.getCellType();

				if (cellType == 1) {

					value = cell.getStringCellValue();

				} else if (DateUtil.isCellDateFormatted(cell)) {

					Date d = cell.getDateCellValue();

					SimpleDateFormat simple = new SimpleDateFormat("MM-DD-YYYY");

					value = simple.format(d);

				}

				else {

					double d = cell.getNumericCellValue();

					long l = (long) d;

					value = String.valueOf(l);

				}

				System.out.println(value);

			}

		}

	}

}
