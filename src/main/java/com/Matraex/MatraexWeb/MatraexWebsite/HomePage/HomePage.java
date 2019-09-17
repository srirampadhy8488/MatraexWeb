package com.Matraex.MatraexWeb.MatraexWebsite.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	// Get a quotation link on the top html video
	@FindBy(linkText="" )
	WebElement getaquotation;
	//under GET FREE QUOTE TODAY
	@FindBy(linkText="")
	WebElement enquirynowtop;
	//Enquiry now on let's Talk Now at the buttom of the page
	@FindBy(id="button4")
	WebElement enquirybuttom;
	
	
	public void getaquote(String quote) {
		getaquotation.click();
	}
	
	public void enquirynow(String enquiryTop) {
		enquirynowtop.click();
	}
	
	public void  letsTalkNow(String enquiryButtom) {
		enquirybuttom.click();
	}
	

}
