package com.redifmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage {
	@FindBy(xpath = "//a[@class='rd_active']")
	private WebElement inbox;

	public WebElement getInbox() {
		return inbox;
	}
	
	public InboxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void goOnInbox() {
		inbox.click();
	}

}
