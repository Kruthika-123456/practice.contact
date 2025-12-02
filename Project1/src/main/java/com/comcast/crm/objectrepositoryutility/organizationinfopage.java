package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationinfopage {
	WebDriver driver;

	public organizationinfopage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "dvHeaderText")
	private WebElement headermsg;

	@FindBy(xpath = "//td[@id='mouseArea_Phone']")
	private WebElement phonenoVer;

	@FindBy(id = "mouseArea_Organization Name")
	private WebElement orgmsg;

	public WebElement getHeadermsg() {
		return headermsg;
	}

	public WebElement getPhonenoVefy() {
		return phonenoVer;
	}

	public WebElement getOrgMsg() {
		return orgmsg;
	}

}
