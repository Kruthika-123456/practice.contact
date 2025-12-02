package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class webDriverUtility {
	public void switchToTabOnUrl(WebDriver driver, String PartialUrl) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains(PartialUrl)) {
				break;

			}
		}

	}

	public void WaitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void MoveToElement(WebDriver driver, WebElement Element) {
		Actions act = new Actions(driver);
		act.moveToElement(Element).perform();

	}

	public void MaximaizeTheWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void FileUploaderm(WebElement fileupload, String path) {
		fileupload.sendKeys(path);
	}

	public String getParentWindow(WebDriver driver) {
		String parentwindow = driver.getWindowHandle();
		return parentwindow;
	}

	public Set<String> getAllWindow(WebDriver driver) {
		return driver.getWindowHandles();
	}

	public void switchToWindowByHandle(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
	}

	public void switchToChildWindow(WebDriver driver, String parentWindow) {
		Set<String> childwindows = driver.getWindowHandles();
		for (String childwindow : childwindows) {
			if (!parentWindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				break;
			}

		}
//return driver
	}

	public void parentWindow(WebDriver driver, String parentWindow) {
		driver.switchTo().window(parentWindow);
	}

	public void closeCurrentWindow(WebDriver driver) {
		driver.close();
	}

	public void closeAllWindow(WebDriver driver) {
		driver.quit();
	}

	public String getWindowTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

//frames
	public void SwitchtoFrame(WebDriver driver, String names)

	{

		driver.switchTo().frame(names);

	}

	public void SwitchtoFrame(WebDriver driver, int index)

	{

		driver.switchTo().frame(index);

	}

	public void SwitchtoFrame(WebDriver driver, WebElement element)

	{

		driver.switchTo().frame(element);

	}

	public void switchToalertaccept(WebDriver driver)

	{

		driver.switchTo().alert().accept();

	}

	public void switchToalertDismiss(WebDriver driver)

	{

		driver.switchTo().alert().dismiss();

	}

	public void switchToalertsendkeys(WebDriver driver)

	{

		driver.switchTo().alert().getText();

	}

}
