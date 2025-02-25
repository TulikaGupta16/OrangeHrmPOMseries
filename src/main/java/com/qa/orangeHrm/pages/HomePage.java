package com.qa.orangeHrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By dropdown = By.xpath("//a[text()='Why OrangeHRM']");
	private By secondDropdown = By
			.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/div/div/div/ul/li[1]");
	private By customers = By.xpath("//a[text()='Case Studies']");
    
   
    public String dogetPageTitle()
    {
    	String title = driver.getTitle();
    	System.out.println("page title is ====>" +title);
    	return title;
    }
    
    public String dogetPageUrl()
    {
    	String url = driver.getCurrentUrl();
    	System.out.println("page title is ====>" +url);
    	return url;
    }
    
//    public CoustmerSuccessStoryPage dogetDemo()
//    {
//    	
//    	Actions act = new Actions(driver);
//    	act.moveToElement(driver.findElement(dropdown)).build().perform();)
//    	
//    	return new  CoustmerSuccessStoryPage(driver);
//    	
//    }
    
    public CoustmerSuccessStoryPage dogetAnotherPage()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(driver.findElement(dropdown)).perform();
    	act.moveToElement(driver.findElement(secondDropdown)).perform();
//    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(customers))).click();;
    	act.click(driver.findElement(customers)).perform();
    	return new  CoustmerSuccessStoryPage(driver);
    }
    
    

}
