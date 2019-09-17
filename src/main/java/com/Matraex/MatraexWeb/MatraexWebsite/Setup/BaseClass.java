package com.Matraex.MatraexWeb.MatraexWebsite.Setup;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	public String baseurl= "http://matraexcoretech.com/matraex/";
	public  Logger logger;
	
 
	@BeforeClass
 	  public  void setup() {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Libraries/geckodriver");
			driver= new FirefoxDriver();
			 logger=Logger.getLogger("BaseClass"); 
			 //PropertyConfigurator.configure("log4j.properties");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			}
 	  @AfterClass
 	  public static void teardown() {
 		  driver.quit();
 	  }
 	  
  
}
