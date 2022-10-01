package com.redifmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redifmail.base.BasetestRedif;

public class HomePage extends BasetestRedif {

	private static final String Assert = null;

	private static final String SinInPage = null;

	@FindBy(xpath = "//div[@class='cell']")
	private WebElement radifmailLogo;

	@FindBy(xpath = "//a[@class='signin']")
	private WebElement sinin;

	public WebElement getRadifmailLogo() {
		return radifmailLogo;
	}

	public WebElement getSinin() {
		return sinin;
	}

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean displyTheLogo() {
		boolean isDisplyLogo = radifmailLogo.isDisplayed();
		return isDisplyLogo;
		
	}
	
	public SinInPage clicksinIn() {
		sinin.click();
		return new SinInPage();
		
	}

}
