package com.Matraex.MatraexWeb.MatraexWebsite.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Matraex.MatraexWeb.MatraexWebsite.Setup.BaseClass;


public class LaunchWebsite extends BaseClass 
{
	/*@Test
	public void launch() {
=======
public class LaunchWebsite extends BaseClass {
	
	@BeforeClass
	public void lunchBrowser() {
		setup();
	}
	
	@Test
	public void launchUrl() {

		driver.get(baseurl);
		logger.info("Url opened");
		if(driver.getTitle().equalsIgnoreCase("Matraex-web development company")) {
			Assert.assertTrue(true);
			logger.info("Title matched");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Title didn't matched");
		}		
	}*/
	
	@BeforeClass
	public void launch() {
	BaseClass cls=new BaseClass();
	cls.setup();
	}

	@AfterClass
	public void closeBrowser() {
		teardown();

	}
	 @Test
	 public void EnquireNow() 
	 {
		BaseClass cls=new BaseClass();
		cls.EnquireNow();
	 }
	

}
