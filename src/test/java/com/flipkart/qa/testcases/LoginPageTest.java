package com.flipkart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() {
		
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp(){
		Initialization();
		                     
		loginpage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitle() {
		
		String title = loginpage.validateLoginPage();
		
		Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	
	@Test(priority=2)
	public void fktLogoImage() {
		boolean flag=loginpage.validateFKTImage();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void loginTest() {
		
		homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
