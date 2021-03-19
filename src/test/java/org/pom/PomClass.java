package org.pom;

import java.io.IOException;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.testng.xml.LaunchSuite;

public class PomClass extends LibGlobal {
	
		public static void main(String[] args) throws IOException {
			
			
			WebDriver d=launchBrowser();
			
			loadUrl("https://www.facebook.com/");
			
			maxScreen();
			
			String userName=excelRead(0, 0);
			
			loginPojo l=new loginPojo();
			
			fill(l.getTxtEmail().get(0), userName);
			
			fill(l.getTxtPass().get(0), excelRead(0,1));
			
			
			browserQuit();
			
			
		}

}
