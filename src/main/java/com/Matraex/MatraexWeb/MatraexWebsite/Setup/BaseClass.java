package com.Matraex.MatraexWeb.MatraexWebsite.Setup;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {
	public static WebDriver driver;
	public String baseurl= "http://matraexcoretech.com/matraex/";
	public  Logger logger;
	
      //for launching the app
 	  public  void setup() 
 	  {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Libraries/geckodriver.exe");
			driver= new FirefoxDriver();
			 logger=Logger.getLogger("BaseClass"); 
			 //PropertyConfigurator.configure("log4j.properties");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			}
 	  //for quit the driver
 	  public static void teardown() {
 		  driver.quit();
 	  }
 	  
 	 public void launch() {
 		 try {
 			driver.get(baseurl);
		} catch (Exception e) {
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
 		 
 		
 		
 	}
	public void EnquireNow() {
		driver.findElement(By.className("navbar navbar-default bootsnav navbar-fixed-top header-light background-transparent nav-box-width white-link navbar-expand-lg menu-center on no-full")).click();;
		
	}
  
}
