package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPageInfo {
	WebDriver driver;

	public OpportunitiesPageInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headermsg;

	@FindBy(className = "dvtCellInfo")
	private WebElement orgname;

	public WebElement getHeadermsg() {
		return headermsg;
	}

	public WebElement getorgmsg() {
		return orgname;
	}

}
