package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUsername=driver.findElement(By.id("username"));
		txtUsername.sendKeys("jackmavles");
		WebElement txtPass=driver.findElement(By.id("password"));	
		txtPass.sendKeys("selvam");
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		
		WebElement loc=driver.findElement(By.id("location"));
		
		Select s=new Select(loc);
		
		List<WebElement> allOptions=s.getOptions();
		
		for (int i = 0; i < allOptions.size(); i++) {
			
			WebElement each=allOptions.get(i);
			String location =each.getAttribute("value");
			System.out.println(location);
			
		}
		
		WebElement hotels=driver.findElement(By.id("hotels"));
		Select a=new Select(hotels);
		
		List<WebElement> allOptionshotels=a.getOptions();
		
		for (int i = 0; i < allOptionshotels.size(); i++) {
			
			WebElement each=allOptionshotels.get(i);
			String hotelName=each.getAttribute("value");
			System.out.println(hotelName);
			
		}
		
		WebElement room=driver.findElement(By.id("room_type"));
		
		Select c=new Select(room);
		List<WebElement> allRoomOptions = c.getOptions();
		
		for (int i = 0; i < allRoomOptions.size(); i++) {
			
			WebElement each=allRoomOptions.get(i);
			String roomType=each.getAttribute("value");
			System.out.println(roomType);
		}
				
		
		WebElement roomNumber=driver.findElement(By.id("room_nos"));
		
		Select b=new Select(roomNumber);
		List<WebElement> allRoomNumber = b.getOptions();
		for (int i = 0; i < allRoomNumber.size(); i++) {
			
			WebElement each = allRoomNumber.get(i);
			String roomdetails=each.getAttribute("value");
			System.out.println(roomdetails);
					
			
			
		}
		
		
		
		
		
		
	}
	
	
	

}
