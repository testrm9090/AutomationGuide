package com.test.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidNativeAppTest {	
	static AndroidDriver driver;
	public static void main(String arr[]) throws MalformedURLException, InterruptedException 
	{
	/*	File app= new File("D:\\Apk\\Kmart.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "32049be0e13f410b");
		capabilities.setCapability("platformVersion", "Android");
		capabilities.setCapability("platformName", "5.1.1");
		capabilities.setCapability("app", app.getAbsolutePath());
	
		driver = new AndroidDriver(new URL("http://10.155.179.59:4723/wd/hub"),capabilities);
		driver.findElement(By.id("@+id/accept")).click();
	
		//driver.findElement(By.id("com.Button:id/button1_main1")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();*/
		
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "21aa5b6f2d017ece");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.jcp");
		capabilities.setCapability("appActivity", "com.jcpenney.activities.StartupActivity");
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.jcp:id/tvOnboardingSkipAll")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.id("com.jcp:id/search_button")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.id("com.jcp:id/search_src_text")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("com.jcp:id/search_src_text")).sendKeys("Shirts");
		Thread.sleep(5000);

	//	((AndroidDriver) driver).sendKeyEvent(AndroidKeyCode.ENTER);
		Thread.sleep(5000);
		
	 Location location = new Location(33.019844,-96.698883,203);
	  driver.setLocation(location);
	  System.out.println("locatttionnnnnnnnnnnnnnnnn"+ location);
		
	driver.closeApp();
	}
}


