package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewVendorPage {
	WebDriver driver;

	public CreateNewVendorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "vendorname")
	private WebElement vendername;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public WebElement getCreateNewVndBtn() {
		return vendername;
	}

	public WebElement getsaveBtn() {
		return saveBtn;
	}

	public void creatvendor(String vendorname) {
		vendername.sendKeys(vendorname);
		saveBtn.click();
	}

}
