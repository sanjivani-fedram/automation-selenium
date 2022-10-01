package com.redifmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redifmail.base.BasetestRedif;

public class SinInPage extends  BasetestRedif{
	@FindBy(xpath = "//input[@id='login1']")
	private WebElement userid;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passward;
	
	@FindBy(xpath = "//input[@name='proceed']")
	private WebElement sininbtn;

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPassward() {
		return passward;
	}

	public WebElement getSininbtn() {
		return sininbtn;
	}
	
	public  SinInPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean onsininpage() {
		boolean flag = false;
		flag = userid.isDisplayed();
		return flag ;
	}
	public InboxPage  DoLogIn(String user,String pass) {
		userid.sendKeys(user);
		passward.sendKeys(pass);
		sininbtn.click();
		return new InboxPage(driver);
		
	}
	public void goOnInboxPage() {
		
	}

	
	

}
