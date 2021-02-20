package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class ProductSpecifications extends TestBase{
	
	@FindBy(xpath="//div[@class='_2C41yO']")
	WebElement MousehoverOnMobiles;
	
	@FindBy(xpath="//input[@class='_36yFo0']")
	WebElement EnterPIN;
	
	public ProductSpecifications() {
		PageFactory.initElements(driver, this);
	}
	
	public void mosehoverOnMobiles() {
		
	}
	
	public void enterPincode(String pincode) {
		//EnterPIN.clear();
		EnterPIN.sendKeys(pincode);
	}
	

}
