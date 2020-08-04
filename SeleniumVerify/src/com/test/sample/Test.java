package com.test.sample;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

public class Test {

	static WebDriver webdriver;
	static WebElement webelement;

	public static void main (String[] args) throws IOException{
		
	System.setProperty("webdriver.chrome", "D:\\chromedriver.exe");
	webdriver.navigate().to("");
		
	webdriver = new FirefoxDriver();
	webdriver.navigate().to("");
	
	
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "");
	capabilities.setCapability("browserName", "Android");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "5.1.1");	
	capabilities.setCapability("launchTimeout", 10000);

	webdriver = new RemoteWebDriver(new URL("http://10.155.31.45:4523/wd/hub"),capabilities);
	webdriver.navigate().to("");
	
	
	File file = new File("Apk location");
	DesiredCapabilities capabilities1 = new DesiredCapabilities();
	capabilities1.setCapability("path", file);
	capabilities1.setCapability("devicename", "");
	capabilities1.setCapability("browserName", "Chrome");
	capabilities1.setCapability("platformName", "Android");
	capabilities1.setCapability("platformVersion", "5.1.1");
	capabilities1.setCapability("", file.getAbsolutePath());
	
	webdriver = new AndroidDriver(new URL ("http://10.122.13.14:4523/wd/hub"), capabilities1);
	webdriver.navigate().to("");
	
	
	Map<String, String> emulation = new HashMap<String,String>();
	emulation.put("deviceName", "Samsung S2");
	Map<String, Object> chromeOptions = new HashMap<String,Object>();
	chromeOptions.put("emulation",emulation);
	DesiredCapabilities capabilities2 = new DesiredCapabilities();
	capabilities2.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	webdriver.navigate().to("");
	
	
	}
	
		 
		
	}
	

