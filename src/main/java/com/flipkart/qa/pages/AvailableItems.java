package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class AvailableItems extends TestBase {

	@FindBy(xpath="//div[contains(text(),'Apple iPhone 12 (Black, 128 GB)')]")
	
	WebElement SelectedMobile;
	
	// Initializing the Page Objects:
			public AvailableItems() {
				PageFactory.initElements(driver, this);
			}
	
	public ProductSpecifications clickOnSelectMobile() {
		SelectedMobile.click();
		return new ProductSpecifications();
		
		
	}
}

