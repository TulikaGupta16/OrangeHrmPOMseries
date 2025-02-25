package com.qa.orangeHrm.pages;

import org.openqa.selenium.WebDriver;

public class ContactSalePage {
	private WebDriver driver;
	
	public ContactSalePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String dogetContantPageTitle()
	{
		String contactPageTitle = driver.getTitle();
		System.out.println("contact page title=====>"+contactPageTitle);
		return contactPageTitle;
	}
	
	

}
