package com.sample;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class NEWW {

	
static WebDriver driver;
static WebElement element;

public static void main (String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	driver = new ChromeDriver();
	
	driver = new FirefoxDriver();
	
	File file = new File("D://sample.apk");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "aeiou113134");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "5.2.1");
	capabilities.setCapability("launchTimeout", 1000);
	capabilities.setCapability("app",file.getAbsolutePath());
	driver = new AndroidDriver(new URL("http://10.456.67.89:4523/wd/hub"), capabilities);
	
	Map<String,String> emulation = new HashMap<String,String>();
	emulation.put("DeviceName", "Samsung Galaxy S5");
	Map<String,Object> chromeoptions = new HashMap<String,Object>();
	chromeoptions.put("mobileEmulation", emulation);
	DesiredCapabilities capablities1 = new DesiredCapabilities();
	capablities1.setCapability(ChromeOptions.CAPABILITY, chromeoptions);
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	driver = new ChromeDriver(capablities1);
	
	}
}
