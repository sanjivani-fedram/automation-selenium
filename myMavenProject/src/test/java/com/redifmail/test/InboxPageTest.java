package com.redifmail.test;

import org.testng.annotations.BeforeMethod;

import com.redifmail.base.BasetestRedif;
import com.redifmail.pages.HomePage;
import com.redifmail.pages.InboxPage;
import com.redifmail.pages.SinInPage;

public class InboxPageTest extends BasetestRedif {
	HomePage home = null;
	SinInPage login = null;
	InboxPage inbox = null;

	@BeforeMethod()
	void setsinIn() {
		initilizaltion();
		home = new HomePage();
		login = new SinInPage();

	}

}
