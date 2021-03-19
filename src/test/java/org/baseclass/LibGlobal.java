package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {

	public static WebDriver driver;

	public static WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	public static void loadUrl(String url) {

		driver.get(url);

	}

	public static void fill(WebElement element, String userName) {

		element.sendKeys(userName);

	}

	public static void txtclick(WebElement element) {
		element.click();

	}

	public static void browserQuit() {
		driver.quit();

	}

	public static void selectByText(WebElement element, String data) {

		new Select(element).selectByVisibleText(data);
		// Select s=new Select(element);
		// s.selectByVisibleText(data);

	}

	public static void selectbyIndex(WebElement element, int index) {

		new Select(element).selectByIndex(index);

	}

	public static void selectDate(WebElement element, String data) {

		element.clear();
		element.sendKeys(data);

	}

	public static void attributeValue(WebElement element) {

		String attribute = element.getAttribute("value");
		System.out.println(attribute);

	}

	// get current URL
	public String currentURL() {

		String uRL = driver.getCurrentUrl();
		return uRL;

	}

	// setsize of Window

	public static void setWindowSize() {

		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);

	}

	// get title
	public static String title() {

		String titleName = driver.getTitle();
		return titleName;

	}

	// get Page Source
	public static String pageSource() {

		String sourcePage = driver.getPageSource();
		return sourcePage;

	}

	// Quite
	public void quitBrowser() {

		driver.quit();

	}

	// Close
	public void closeBrowser() {
		driver.close();

	}

	// delete all cookies
	public void cookies() {
		driver.manage().deleteAllCookies();

	}

	public static String excelRead(int rowNo, int cellNo) throws IOException {

		File file = new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\Data\\Datafile.xlsx");

		FileInputStream input = new FileInputStream(file);

		Workbook workBook = new XSSFWorkbook(input);

		Sheet sheet = workBook.getSheet("Input");

		String value = "";

		// for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

		Row row = sheet.getRow(rowNo);

		// for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

		Cell cell = row.getCell(cellNo);

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

		// System.out.println(value);

		return value;

	}
	
	public static void maxScreen() {
	
		driver.manage().window().maximize();

	}

}

// }}
