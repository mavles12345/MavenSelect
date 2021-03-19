package org.pom;

import java.util.List;

import org.baseclass.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPojo extends LibGlobal {
	
	
	public loginPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private List<WebElement> txtEmail;
	
	@FindBy(id="pass")
	private List<WebElement> txtPass;
	
	@FindBy(id="login")
	private WebElement txtclick;

	public List<WebElement> getTxtEmail() {
		return txtEmail;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtclick() {
		return txtclick;
	}
	
	

}
