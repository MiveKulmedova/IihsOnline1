package com.IIHSOnline1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IIHSOnline1.utilities.Driver;

public class SearchResultPage {
	
	public SearchResultPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "gsc-i-id1")
	public WebElement input_box;
	
	@FindBy(className = "gsc-option-selector")
	public WebElement sortBy;

}
