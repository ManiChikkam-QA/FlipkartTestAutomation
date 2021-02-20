package com.flipkart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.AvailableItems;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.ProductSpecifications;
import com.flipkart.qa.util.TestUtil;

public class AvailableItemsTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	AvailableItems availableitems;
	ProductSpecifications productspecif;
	String sheetName = "Pincodes";
	
	public AvailableItemsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		ProductSpecifications productspecif = new ProductSpecifications();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		availableitems = homepage.searchItems(prop.getProperty("search1"));
		availableitems=homepage.clickOnSearchbar();
		
	}
	
	@Test(priority=1)
	public void clickOnSelectMobileTest() {
		availableitems.clickOnSelectMobile();
		
	}
	
	@DataProvider
	public Object[][] getFlipkartTestData() {
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test(enabled=false, dataProvider="getFlipkartTestData")
	public void enterPincodeTest(String pincode) {
		productspecif.enterPincode(pincode);
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
