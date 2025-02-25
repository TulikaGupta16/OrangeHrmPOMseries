package com.qa.orangeHrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orangeHrm.base.BaseTest;

public class CoustmerSuccessStoryTest extends BaseTest{
	
	@Test
	public void pageurltest()
	{
		String url=coustmerSuccessStoryPage.getCoustmerPageUrl();
		
		Assert.assertEquals(url,"https://www.orangehrm.com/en/book-a-free-demo");
	}

	@Test
	public void contactpageTitleTest()
	{
		contactSalePage=coustmerSuccessStoryPage.doGetContactsalepage();
		
		Assert.assertEquals(contactSalePage.dogetContantPageTitle(),"Get in Touch with OrangeHRM Sales | OrangeHRM");
	}
}
