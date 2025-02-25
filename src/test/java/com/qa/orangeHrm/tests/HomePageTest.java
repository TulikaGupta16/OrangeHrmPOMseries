package com.qa.orangeHrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orangeHrm.base.BaseTest;
import com.qa.orangeHrm.pages.CoustmerSuccessStoryPage;

public class HomePageTest extends BaseTest{
	
	@Test
	public void homePageTitleTest()
	{
		String actualTitle=homePage.dogetPageTitle();
		
		Assert.assertEquals(actualTitle ,"Book Your Free Demo | OrangeHRM");
	}
	@Test
	public void homePageUrlTest()
	{
		String actualUrl = homePage.dogetPageUrl();
		
		Assert.assertTrue(actualUrl.contains("book-a-free-demo"));
	}
	@Test(priority=Integer.MAX_VALUE)
	public void doGetDemoTest()
	{
		coustmerSuccessStoryPage=homePage.dogetAnotherPage();
		Assert.assertEquals(coustmerSuccessStoryPage.getCoustmerPageTitle(),"HR Software Customer Reviews | OrangeHRM");
		
	}
	
	

}
