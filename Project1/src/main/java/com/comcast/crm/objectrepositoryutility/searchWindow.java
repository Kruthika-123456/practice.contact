package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchWindow {

	WebDriver driver;

	public searchWindow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "search_text")
	private WebElement search;

	@FindBy(name = "search")
	private WebElement searchnow;

	public WebElement getSearchText() {
		return search;
	}

	public WebElement getSearchnow() {
		return searchnow;
	}

}
