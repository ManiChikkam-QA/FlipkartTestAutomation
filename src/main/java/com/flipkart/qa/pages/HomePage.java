package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//img[@alt='Mobiles']")
	
	WebElement selectmobiles;

	@FindBy(xpath = "//a[@class='_1jJQdf _2Mji8F']")
	WebElement mobilesclick;
	
	@FindBy(xpath = "//div[@class='exehdJ']")
	WebElement FlipkartTxt;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement Searchbar;
	
	@FindBy(xpath="//div[@class='_3OO5Xc']//following-sibling::button[1]")
	WebElement SearchbarClick;
	
    @FindBy(xpath="//div[contains(text(),'Electronics')]")
	
	WebElement ClickOnElectronics;
	
	// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		public MobilesPage selectMobiles() {
			selectmobiles.click();
			return new MobilesPage();
		}
		
		public MobilesAvailable clickOnMobiles() {
			mobilesclick.click();
			return new MobilesAvailable();
		}
		
		public boolean verifyFlipkartText() {
			return FlipkartTxt.isDisplayed();
			
		}
		
		public AvailableItems searchItems(String s1) {
			Searchbar.sendKeys(s1);
			return new AvailableItems();
		}
		
		public AvailableItems clickOnSearchbar() {
			SearchbarClick.submit();
			return new AvailableItems();
		}
		
		public void clickOnElectronics() {
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(ClickOnElectronics).build().perform();
		}
		
		
}
