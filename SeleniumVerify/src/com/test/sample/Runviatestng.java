package com.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Runviatestng{
	/**
	 
	 */
	public static WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		 //driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@Test(priority =1)
	public void LoadGoogle() {

		try {
			WebElement element = driver.findElement(By.name("q"));
			// Enter something to search for
			element.sendKeys("Loaded IE Successfully !!");

			element.submit();
			(new WebDriverWait(driver, 10))
					.until(new ExpectedCondition<Boolean>() {
						public Boolean apply(WebDriver d) {
							return d.getTitle().toLowerCase()
									.startsWith("cheese!");
						}
					});
			// Should see: "cheese! - Google Search"
			System.out.println("Page title is: " + driver.getTitle());
		} catch (Exception e) {
			System.out.println("Not Loaded :-( Try again !");

		}
	}

	@AfterClass
	public void afterClass() {

		driver.close();
		driver.quit();
		System.out.println("Web driver quited");
	}
}
