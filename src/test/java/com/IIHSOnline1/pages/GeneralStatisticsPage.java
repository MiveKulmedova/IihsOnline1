package com.IIHSOnline1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IIHSOnline1.utilities.Driver;

public class GeneralStatisticsPage {
	public GeneralStatisticsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText="Fatality Facts")
	public WebElement fatality_facts;
	
	
	
	
	
	
}
