package com.test.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

	/**
	 * /**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--test-type");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);		
		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));
		// Enter something to search for
		element.sendKeys("Loaded Chrome Successfully !!");
		System.out.println("Page title is: " + driver.getTitle());

		// Close the browser
		driver.quit();
	}

}
