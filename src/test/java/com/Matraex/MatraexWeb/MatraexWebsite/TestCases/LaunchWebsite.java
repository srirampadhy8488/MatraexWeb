package com.Matraex.MatraexWeb.MatraexWebsite.TestCases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Matraex.MatraexWeb.MatraexWebsite.HomePage.HomePage;
import com.Matraex.MatraexWeb.MatraexWebsite.Setup.BaseClass;

public class LaunchWebsite  {
	
	@BeforeClass
	public void lunchBrowser() {
		BaseClass.setup();
	}
	
	@Test
	public void lunchUrl() {
		BaseClass.urlLunchValidation();		
	}
	@Test
	public void homePageMethods() {
		
		HomePage.getaquote();
	}
	@AfterClass
	public static void closeBrowser() {
		BaseClass.teardown();
	}

}
