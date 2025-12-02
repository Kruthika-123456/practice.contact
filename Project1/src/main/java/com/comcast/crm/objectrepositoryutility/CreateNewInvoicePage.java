package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewInvoicePage {

	WebDriver driver;

	public CreateNewInvoicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "subject")
	private WebElement subject1;

	@FindBy(xpath = "//select[@class='txtBox']")
	private WebElement dropdown;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	@FindBy(name = "bill_street")
	private WebElement billadd;

	@FindBy(name = "ship_street")
	private WebElement shipadd;

	public WebElement getsubject() {
		return subject1;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getShipadd() {
		return shipadd;
	}

	public WebElement getdropdown() {
		return dropdown;

	}

	public void createInv(String subject, String address) {
		subject1.sendKeys(subject);
		billadd.sendKeys(address);
		shipadd.sendKeys(address);
	}

	public void Handledropdown() {
		Select dd = new Select(dropdown);
		dd.selectByIndex(3);
	}
}
