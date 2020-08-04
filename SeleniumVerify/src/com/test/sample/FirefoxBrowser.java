package com.test.sample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	/**
	 * /**
	 * 
	 * @param args
	 */
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D://Selenium Setup//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
   
		driver.navigate().to("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));
		// Enter something to search for
		element.sendKeys("Loaded firefox Successfully !!");	
		// Should see: "cheese! - Google Search"
		System.out.println("Page title is: " + driver.getTitle());

		//Dropdown slect

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("document.getElementById('').selectedIndex=2");
	}
}


