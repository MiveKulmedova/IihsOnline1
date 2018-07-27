package com.IIHSOnline1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IIHSOnline1.utilities.Driver;


public class FatalityFactsPage {
	
	public FatalityFactsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText="Select another topic")
	public WebElement Select_another_topic;
	
	@FindBy(linkText="State by state")
	public WebElement State_by_state;
	
	@FindBy(linkText="FARS")
	public WebElement Fars;
	
	

	
	
}
