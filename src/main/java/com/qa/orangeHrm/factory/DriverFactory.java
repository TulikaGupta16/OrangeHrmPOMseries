package com.qa.orangeHrm.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.qa.orangeHrm.exception.FrameworkException;

public class DriverFactory {

	WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is====>" + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("plz pass correct browser name" + browserName);
			throw new FrameworkException("==invalid bowser name==");
		}
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		return driver;
	}
	
}
