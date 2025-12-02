package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	// Rule-1 create a separte java class
	// Rule-2 object Creatio
	WebDriver driver;
	public Loginpage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement usernameEdt;

	@FindBy(name = "user_password")
	private WebElement passwordEdt;

	@FindBy(id = "submitButton")
	private WebElement loginbtn;

//rule-3 Initiallization done in test script not in POM calss

//Rule -4: object encapsulation

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

//Rule-5:provide action using busines method
	public void loginToapp(String URL, String USERNAME, String PASSWORD) {
		//driver.get(URL);
		//usernameEdt.sendKeys(USERNAME);
		//passwordEdt.sendKeys(PASSWORD);
		//loginbtn.click();
	}

}
