package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;

	@FindBy(linkText = "Campaigns")
	private WebElement Campaignlink;

	@FindBy(linkText = "Sign Out")
	private WebElement logoutlink;

	@FindBy(linkText = "More")
	private WebElement moreLink;

	@FindBy(linkText = "Opportunities")
	private WebElement opportunitieslink;

	@FindBy(linkText = "Products")
	private WebElement products;

	@FindBy(linkText = "Vendors")
	private WebElement vendors;

	@FindBy(linkText = "Invoice")
	private WebElement invoice;

	
	  @FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private
	  WebElement logout;
	 

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getInvoiceLink() {
		return invoice;
	}

	public WebElement getproductlink() {
		return products;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getCampaignlink() {
		return Campaignlink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getopportunitiesLink() {
		return opportunitieslink;
	}

	public WebElement getlogoutlink() {
		return logoutlink;
	}

	
	  public void logout() { Actions act = new Actions(driver);
	  act.moveToElement(logout).perform(); logoutlink.click();
	  
	  }
	 

	public void navigateTovendorPage() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLink).perform();
		vendors.click();

	}

	public void navigateToCampaginPage() {
		Actions act = new Actions(driver);
		act.moveToElement(moreLink).perform();
		Campaignlink.click();

	}

}
