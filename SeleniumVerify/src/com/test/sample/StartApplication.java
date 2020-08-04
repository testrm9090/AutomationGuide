package com.test.sample;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
 
 
 
public class StartApplication {
 
                             
// create global variable
 
private static AndroidDriver driver;
 
public static void main(String[] args) throws MalformedURLException, InterruptedException 
{
	
 
	File file =new File("C:\\Users\\skumarma\\Downloads\\JCPenney-jcp-debug-develop-20180402-406.apk");
	DesiredCapabilities capabilities2 = new DesiredCapabilities();
	capabilities2.setCapability("platformName", "Android");
	capabilities2.setCapability("deviceName", "520370dff48c9323");
	
	capabilities2.setCapability("platformVersion", "7.0");
	capabilities2.setCapability("launchTimeout", 1000);	
	capabilities2.setCapability("app" ,file.getAbsolutePath());
	driver = new AndroidDriver(new URL("http://10.5.36.11:4723/wd/hub"), capabilities2);
	driver.navigate().to("http://www.google.co.in");

 
 
                }
 
 
 
}