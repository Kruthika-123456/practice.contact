package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewOrganizationPage {
	WebDriver driver;

	public CreatingNewOrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "accountname")
	private WebElement accountname;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	@FindBy(name = "phone")
	private WebElement phone;

	@FindBy(name = "industry")
	private WebElement industrydd;

	public WebElement getAccountname() {
		return accountname;
	}

	public WebElement getphoneno() {
		return phone;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void createorg(String orgname) {
		accountname.sendKeys(orgname);
		saveBtn.click();

	}

	public void createorg(String orgname, String industry) {
		accountname.sendKeys(orgname);
		Select sel = new Select(industrydd);
		sel.selectByVisibleText(industry);
		saveBtn.click();

	}

	public void createorg1(String orgname, String phoneno) {
		accountname.sendKeys(orgname);
		phone.sendKeys(phoneno);
		saveBtn.click();
	}

}
