package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactinfopage {

	WebDriver driver;

	public Contactinfopage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "dvHeaderText")
	private WebElement headermsg;

	@FindBy(id = "dtlview_Support End Date")
	private WebElement enddate;

	public WebElement getHeadermsg() {
		return headermsg;
	}

	public WebElement getenddate() {
		return enddate;
	}

}
