package com.test.sample;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileEmulation {

	static WebDriver driver;
	static WebElement element; 
	public static void main(String[] agrs) throws Exception{
				
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Galaxy Note 3");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		System.setProperty("webdriver.chrome.driver", "C://SeleniumJars//chromedriver.exe");  
		driver = new ChromeDriver(capabilities);
		driver.get("http://m.jcpenney.com");
		
		//element = driver.findElement(By.id("sb_ifc0"));
	
		
		
		String webViewText = driver.findElement(By.xpath("//a[text()='JCPenney Home']")).getText();
		System.out.println(webViewText);
		
		driver.findElement(By.xpath("//div[contains(@class,'_2IWk1')]")).click();
		
	/*	Map<String, String> deviceMetrics = new HashMap<String, Object>();
		deviceMetrics.put("width", 360);
		deviceMetrics.put("height", 640);
		deviceMetrics.put("pixelRatio", 3.0);
		Map<String, String> mobileEmulation = new HashMap<String, String>();

		mobileEmulation.put("deviceMetrics", deviceMetrics);
		mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

		Map<String, Object> chromeOptions = new Map<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new ChromeDriver(capabilities);*/		
	}	
}
