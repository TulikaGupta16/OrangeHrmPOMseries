package com.qa.orangeHrm.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.qa.orangeHrm.factory.DriverFactory;
import com.qa.orangeHrm.pages.CoustmerSuccessStoryPage;
import com.qa.orangeHrm.pages.HomePage;

public class BaseTest {
	
	WebDriver driver;
	DriverFactory df;
	protected HomePage homePage;
	protected CoustmerSuccessStoryPage  coustmerSuccessStoryPage;
	
	@BeforeTest
	public void setUp()
	{
		df=new DriverFactory();
		driver=df.initDriver("chrome");
		homePage = new HomePage(driver);
		
	}
	
//	@AfterTest
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
