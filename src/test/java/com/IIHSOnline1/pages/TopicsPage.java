package com.IIHSOnline1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IIHSOnline1.utilities.Driver;

public class TopicsPage {
	public TopicsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText="General statistics")
	public WebElement general_statistics;
	
	
	
}
