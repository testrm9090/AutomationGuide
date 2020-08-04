package com.test.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumChromeExample {
	WebDriver driver;
	WebDriverWait wait;
	String AppURL = "http://www.seleniumeasy.com";

	@BeforeTest
	public void setup() throws MalformedURLException {

		// Create an object for Desired Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browsername", "chrome");
		capabilities.setCapability("deviceName", "520370dff48c9323");
		capabilities.setCapability("platformName", "Android");		
		//capabilities.setCapability(MobileCapabilityType.LAUNCH_TIMEOUT,10000);
		 capabilities.setCapability(CapabilityType.BROWSER_NAME,BrowserType.CHROME);
		 capabilities.setCapability(CapabilityType.VERSION,"8.1.0");
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		wait = new WebDriverWait(driver, 5);
	}

	@Test
	public void testSearchAppium() {
		driver.get(AppURL);
		WebElement titleElement = driver.findElement(By.cssSelector("#site-name>a"));
		String homePageTitle = titleElement.getText();
		Assert.assertEquals(homePageTitle, "Selenium Easy");

		WebElement searchElement = driver.findElement(By.name("search_block_form"));
		searchElement.sendKeys("Appium Tutorials");

		WebElement searchBtnEle = driver.findElement(By.id("edit-submit"));
		searchBtnEle.click();

		By byPageTitle = By.id("page-title");
		wait.until(ExpectedConditions.presenceOfElementLocated(byPageTitle));

		String searchPageTitle = driver.findElement(byPageTitle).getText();
		Assert.assertEquals(searchPageTitle, "Search");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
