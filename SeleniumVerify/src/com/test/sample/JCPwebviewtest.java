package com.test.sample;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class JCPwebviewtest {
	static AndroidDriver driver;

	public static void main(String arr[]) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		File file = new File("C://APK//D://jcp-debug-10.6.0-featurew.252+0d47c7d.apk");
		capabilities.setCapability("deviceName", "21aa5b6f2d017ece");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "Selendroid");
//		capabilities.setCapability("appPackage", "com.jcp.debug");
//		capabilities.setCapability("appActivity", "com.jcpenney.activities.StartupActivity");
		capabilities.setCapability("app",file.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(5000);
		driver.findElement(By.id("com.jcp.debug:id/tvOnboardingSkipAll")).click();
		driver.findElement(By.id("com.jcp.debug:id/navigation_bar_my_account")).click();
		driver.findElement(By.id("com.jcp.debug:id/navigation_bar_home")).click();
		Thread.sleep(5000);		
		
		driver.findElement(By.xpath("//div[contains(@class,'_2IWk1')]")).click();
		
	
		
		Thread.sleep(5000);
		
	}
}


//d.findElement(By.xpath("//*[@id='couponDrawer']/button")).click();
//d.findElement(By.xpath("/html/body/div[1]/main/footer/div[3]/div/div/button")).click();
//
//
//d.findElement(By.xpath("//*[@id='ctaBlock']/div/a/div")).click();
//d.findElement(By.xpath("/html/body/div[1]/main/header/div/div[1]/ul/li[4]/div/a/div")).click();
//
//String webViewText = driver.findElementByXPath("//*[@id='jcp-logo']").getText();
//System.out.println(webViewText);