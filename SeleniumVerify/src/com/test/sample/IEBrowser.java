package com.test.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IEBrowser {
	/**
	 * /**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "D://IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		
		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		
		// Close the browser
		driver.quit();
	}

}
