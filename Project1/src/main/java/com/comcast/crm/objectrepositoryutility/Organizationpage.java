package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {

	WebDriver driver;

	public Organizationpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrgBtn;

	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement SearchCreatedOrg;

	@FindBy(xpath = "//input[@name='related_to_display']/following-sibling::img")
	private WebElement SearchCreatedOrgForOpp;

	@FindBy(xpath = "//input[@name='vendor_name']/following-sibling::img")
	private WebElement searchCreatedorgforPrd;

	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement SearchCreatedOrgForInv;

	public WebElement getSearchForCreatedInv() {
		return SearchCreatedOrgForInv;
	}

	public WebElement getcreateNewOrgBtn() {
		return createNewOrgBtn;
	}

	public WebElement getSearchCreatedOrg() {
		return SearchCreatedOrg;
	}

	public WebElement getSearchCreatedOrgForOpp() {
		return SearchCreatedOrgForOpp;
	}

	public WebElement getSearchCreatedOrgForPrd() {
		return searchCreatedorgforPrd;
	}
}
