package com.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MobileTestWebSelendroid   {
	static WebDriver driver;
	  public static void main(String s[]) throws Exception {
		driver = new RemoteWebDriver(DesiredCapabilities.android());
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selendroid");
		driver.findElement(By.xpath("//*[@id='sblsbb']/button/span")).click();
		driver.quit();
	  }
	}
