package com.Matraex.MatraexWeb.MatraexWebsite.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText="" )
	WebElement getaquotation;
	@FindBy(linkText="")
	WebElement enquirynow;
	//@FindBy()
	public void getaquote(String quote) {
		getaquotation.click();
	}
	public void enquirynow(String enquiry) {
		enquirynow.click();
	}
	

}
