package DataDriverSample;

import java.io.IOException;

import org.baseclass.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DatawithBase extends LibGlobal {

	public static void main(String[] args) throws IOException {

		launchBrowser();

		loadUrl("https://www.facebook.com/");

		WebElement txtUser = driver.findElement(By.id("email"));

		String userName = excelRead(0, 0);

		fill(txtUser, userName);

		WebElement txtPass = driver.findElement(By.id("pass"));
		
		String passid=excelRead(0, 1);

		fill(txtPass, passid);

		WebElement txtlog = driver.findElement(By.id("login"));

		txtclick(txtlog);

	}

}
