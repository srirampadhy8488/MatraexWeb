package com.Matraex.MatraexWeb.MatraexWebsite.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	// Get a quotation link on the top html video
	@FindBy(linkText="" )
	static WebElement getaquotation;
	//under GET FREE QUOTE TODAY
	@FindBy(linkText="")
	static WebElement enquirynowtop;
	//Enquiry now on let's Talk Now at the buttom of the page
	@FindBy(id="button4")
	static WebElement enquirybuttom;
	
	
	public static  void getaquote() {
		getaquotation.click();
	}
	
	public static void enquiryNowTop() {
		enquirynowtop.click();
	}
	
	public static void  letsTalkNow() {
		enquirybuttom.click();
	}
	

}
