package com.test.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidAppiumDeviceBrowser {

	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// Create object of DesiredCapabilities class and specify android
		// platform
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(CapabilityType.PLATFORM, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "21aa5b6f2d017ece");
		capabilities.setCapability(MobileCapabilityType.EVENT_TIMINGS, 10000);
		capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		capabilities.setCapability(CapabilityType.VERSION, "9.0");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new AndroidDriver(url, capabilities);

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.MINUTES);
		// Open url
		driver.get("http://www.facebook.com");

		// print the title
		System.out.println("Title " + driver.getTitle());

		// enter username
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");

		// enter password
		driver.findElement(By.name("pass")).sendKeys("selenium");
		// click on submit button
		driver.findElement(By.id("u_0_5")).click();
		Thread.sleep(2000);
		// close the browser
		driver.quit();

	}
}

/*
 * DesiredCapabilities capabilities1 = new DesiredCapabilities();
 * capabilities1.setCapability("platformName", "Android");
 * capabilities1.setCapability("deviceName", "3b40c088");
 * capabilities1.setCapability("browserName", "Chrome");
 * capabilities1.setCapability("launchTimeout", 10000);
 * capabilities1.setCapability("platformVersion", "6.0.1"); //driver = new
 * RemoteWebDriver(new URL("http://10.5.36.11:4723/wd/hub"), capabilities1);
 * driver = new AndroidDriver(new URL("http://10.5.36.11:4723/wd/hub"),
 * capabilities1); driver.navigate().to("http://www.google.co.in");
 * 
 * System.out.println("Android Device browser called sucessfully");
 */

/*
 * DesiredCapabilities capabilities = new DesiredCapabilities();
 * capabilities.setCapability("deviceName", "ce0117110d56631805");
 * //520370dff48c9323 //000e20727b839f 1115fb90a0a70304 //
 * capabilities.setCapability("modelNumber", "GT-I9500");
 * capabilities.setCapability("newCommandTimeout", 120);
 * capabilities.setCapability("browserName", "Chrome"); //
 * capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome"); //
 * capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0.1"); //
 * capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
 * 
 * 
 * capabilities.setCapability("launchTimeout", "100000");
 * capabilities.setCapability("platformName", "Android");
 * capabilities.setCapability("platformVersion", "6.0.1");
 * 
 * Thread.sleep(4000); //driver = new RemoteWebDriver(new
 * URL("http://10.5.36.11:4723/wd/hub"), capabilities); // driver = new
 * AndroidDriver(new URL("http://10.5.36.11:4723/wd/hub"), capabilities);
 * 
 */
