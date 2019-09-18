package com.Matraex.MatraexWeb.MatraexWebsite.Setup;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static  WebDriver driver;
	public static String baseurl= "http://matraexcoretech.com/matraex/";
	public static   Logger logger;
	
 
	
 	  public static  void setup() {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Libraries/geckodriver");
			driver= new FirefoxDriver();
			 logger=Logger.getLogger("BaseClass"); 
			 //PropertyConfigurator.configure("log4j.properties");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			}
 	  public static void urlLunchValidation() {
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
 	  }
 	 
 	  public static  void teardown() {
 		  driver.quit();
 	  }
 	  
  
}
