package com.test.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidNativeAppSetLocation {
	@SuppressWarnings("rawtypes")
	static AndroidDriver driver;

	public static void main(String arr[]) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "21aa5b6f2d017ece");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.jcp.debug");
		capabilities.setCapability("appActivity", "com.jcpenney.activities.StartupActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(5000);
		driver.findElement(By.id("com.jcp.debug:id/tvOnboardingSkipAll")).click();
		Thread.sleep(5000);

		Location location = new Location(33.019844, -96.698883, 203);
		driver.setLocation(location);
		System.out.println("location SET : " + location);
		Thread.sleep(5000);
		
		driver.closeApp();
	}
}
