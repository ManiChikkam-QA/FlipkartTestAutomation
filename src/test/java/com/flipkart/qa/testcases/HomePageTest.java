package com.flipkart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.AvailableItems;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.SearchedItems;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	AvailableItems availableitems;
	
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		AvailableItems availableitems = new AvailableItems();
		loginpage= new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	}
	
	@Test(priority=2)
	public void verifyHomePageTitle() {
	        String homePageTitle= homepage.verifyHomePageTitle();
	        Assert.assertEquals(homePageTitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","Home page title not matched");
	//System.out.println(homePageTitle);
	
	}
	
	
	@Test(priority=2)
	public void verifyFlipkartTextTest() {
		Assert.assertTrue(homepage.verifyFlipkartText());
	}
	
	@Test(priority=3)
	public void searchItemsTest() {
		homepage.searchItems(prop.getProperty("search1"));
	    availableitems=homepage.clickOnSearchbar();
	}
	
	@Test(enabled=false)
	public void clickOnSearchbarTest() {
		availableitems=homepage.clickOnSearchbar();
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
