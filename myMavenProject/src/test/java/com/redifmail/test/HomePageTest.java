package com.redifmail.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redifmail.base.BasetestRedif;
import com.redifmail.pages.HomePage;
import com.redifmail.pages.SinInPage;

public class HomePageTest extends BasetestRedif {
	HomePage home = null;
	SinInPage login = null;

	@BeforeMethod()
	void setup() {
		initilizaltion();
		home = new HomePage();

	}

	@Test(priority = 1)
	void varifyHomePage() {
		boolean ison = home.displyTheLogo();
		Assert.assertTrue(ison);
	}

	@Test(priority = 2)
	void goOnsinInPage() {
		home.clicksinIn();
		login = new SinInPage();
		boolean isloginpage = login.onsininpage();
		Assert.assertTrue(isloginpage);
	}

	@AfterMethod()
	void close() {
		teardown();
	}

}
