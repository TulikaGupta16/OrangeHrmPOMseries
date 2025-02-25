package com.qa.orangeHrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoustmerSuccessStoryPage {

	private WebDriver driver;

	public CoustmerSuccessStoryPage(WebDriver driver) {
		this.driver = driver;
	}

	By contact = By.xpath("//div[@class='d-flex web-menu-btn']//button[text()='Contact Sales']");
	
	public String getCoustmerPageTitle()
	{
		String title=driver.getTitle();
		System.out.println("title of testimonial page is====>" +title);
		return title;
	}
	
	public String getCoustmerPageUrl()
	{
		String url=driver.getCurrentUrl();
		System.out.println("url of testimonial page is====>" +url);
		return url;
	}
	
    public ContactSalePage doGetContactsalepage()
    {
    	driver.findElement(contact).click();
    	return new ContactSalePage(driver);
    }
}
