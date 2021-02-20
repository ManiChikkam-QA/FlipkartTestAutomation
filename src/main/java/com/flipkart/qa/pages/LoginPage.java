package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory -OR:
	
	//@FindBy(linkText="Login")
	//WebElement LoginBtn;
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement BtnLogin;
	
    @FindBy(xpath="//img[contains(@class,'_2xm1JU')]")
	WebElement fktimage;

	
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPage() {
		
		return driver.getTitle();
	}
	
	public boolean validateFKTImage() {
		
		return fktimage.isDisplayed();
		
	}
	
	public HomePage login(String un,String pwd) {
		
		
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		BtnLogin.click();
		//LoginBtn.click();
		
		return new HomePage();
		
	}
	
}
