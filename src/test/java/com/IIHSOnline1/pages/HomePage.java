package com.IIHSOnline1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IIHSOnline1.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@href='/iihs/topics']")
	public WebElement topics;

	@FindBy(id = "SearchText")
	public WebElement searchText;

	
	
}
