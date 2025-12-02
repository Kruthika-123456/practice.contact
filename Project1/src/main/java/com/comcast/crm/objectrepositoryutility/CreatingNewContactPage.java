package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	WebDriver driver;

	public CreatingNewContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "lastname")
	private WebElement lastname;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	@FindBy(name = "support_start_date")
	private WebElement startdate;

	@FindBy(name = "support_end_date")
	private WebElement enddate;

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getstartdate() {
		return startdate;
	}

	public WebElement getenddate() {
		return enddate;
	}

	public void createCnt(String contname) {
		lastname.sendKeys(contname);
		saveBtn.click();
	}

	public void createCntWithOrg(String contname) {
		lastname.sendKeys(contname);
	}

}
