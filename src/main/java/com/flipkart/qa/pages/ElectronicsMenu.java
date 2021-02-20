package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.qa.base.TestBase;

public class ElectronicsMenu extends TestBase{
	
	@FindBy(xpath="//div[contains(text(),'Electronics')]")
	
	WebElement MousehoverOnElectronics;
	

}
