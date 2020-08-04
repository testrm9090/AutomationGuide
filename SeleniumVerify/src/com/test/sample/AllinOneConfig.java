package com.test.sample;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class AllinOneConfig {
 
 
//	static WebDriver driver;
//	static WebElement element;
//	public void main (String[] args) throws Exception{
//		
//		//Accessing desktop web chrome browser
//		System.setProperty("webdriver.chrome.driver", "D:\\chromerdriver.exe");
//		driver.navigate().to("http://www.google.co.in");
//		
//		//Accessing desktop web firefox browser
//		driver = new FirefoxDriver();
//		
//		//Accessing desktop web internet explorer browser
//		System.setProperty("webdriver.ie.driver","D:\\iedriver.exe");
//		driver.navigate().to("http://www.google.co.in");
//		
//		//Accessing desktop mobile web browser
//		Map<String,String> mobileEmulation = new HashMap<String,String>();
//		mobileEmulation.put("device name", "Samsung galaxy s");		
//		Map<String,Object> chromeOptions = new HashMap<String,Object>();
//		chromeOptions.put("mobileEmulation", mobileEmulation);
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver");
//		driver = new ChromeDriver(capabilities);
//		driver.navigate().to("http://www.google.co.in");
//		
//		//Accessing device chrome browser via Appium
//		DesiredCapabilities capabilities1 = new DesiredCapabilities();
//		capabilities1.setCapability("deviceName", "43145153251r2351");
//		capabilities1.setCapability("browserName", "Chrome");
//		capabilities1.setCapability("launchTimeout", 1000);
//		capabilities1.setCapability("platformName", "chrome");
//		capabilities1.setCapability("platformVersion", "5.1.1");
//		driver = new RemoteWebDriver(new URL("http://12.13.14:4523/wd/hub"), capabilities1);
//		driver.navigate().to("http://www.google.co.in");
//		
//		//Accessing device native app via Appium
//		File file =new File("D:\\sample.apk");
//		DesiredCapabilities capabilities2 = new DesiredCapabilities();
//		capabilities2.setCapability("deviceName", "43145153251r2351");
//		capabilities2.setCapability("browserName", "Chrome");
//		capabilities2.setCapability("launchTimeout", 1000);
//		capabilities2.setCapability("platformName", "chrome");
//		capabilities2.setCapability("platformVersion", "5.1.1");
//		capabilities2.setCapability("app" ,file.getAbsolutePath());
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4523/wd/hub"), capabilities2);
//		driver.navigate().to("http://www.google.co.in");
//		
//		//Selendroid via desktop chrome browser
//		driver = new RemoteWebDriver(DesiredCapabilities.chrome());
//		
//		//Selendroid via desktop firefox browser
//		driver = new RemoteWebDriver(DesiredCapabilities.android());
//}
				
		
	}
	
 