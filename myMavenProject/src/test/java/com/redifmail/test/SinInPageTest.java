package com.redifmail.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redifmail.base.BasetestRedif;
import com.redifmail.pages.HomePage;
import com.redifmail.pages.InboxPage;
import com.redifmail.pages.SinInPage;

public class SinInPageTest extends BasetestRedif {
	HomePage home = null;
	SinInPage login = null;
	InboxPage inbox = null;
	@BeforeMethod()
	void setsinIn() {
		initilizaltion();
		home = new HomePage();
		login = new SinInPage();
		
	}

	@Test
	void varifySinInPage() {
		boolean issinin = login.onsininpage();
		Assert.assertTrue(issinin);

	}

	@Test
	void checklogInpage() {
		home.clicksinIn();
		 inbox = login.DoLogIn(prop.getProperty("userId"), prop.getProperty("passward"));
		 if (!inbox.equals(null))
			 Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);

	}

	@AfterMethod()
	void closesinInpage() {
		teardown();
	}

}
