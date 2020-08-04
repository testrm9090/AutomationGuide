package com.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class JcpHybridAppPOC {

	static AndroidDriver driver;
	
	public void setUp() {
		System.out.println("Session is creating");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "21aa5b6f2d017ece");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appPackage", "com.jcp.debug");
		cap.setCapability("appActivity", "com.jcpenney.activities.StartupActivity");
		;
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Session is created");
	}

	public void getWebViewText() throws InterruptedException {
		System.out.println("First Current Context : " + driver.getContext());

		for (int i = 0; i <= 20; i++) {
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				nativeContent();
				break;
			} catch (Exception e) {
				verticalSwipe();
			}
		}

		// Using this method we switch to web view
		switchContext("WEBVIEW");
		webContent();
	}

	/**
	 * This method for switch view
	 */

	public void switchContext(String context) {
		System.out.println("Before Switching : " + driver.getContext());
		Set<String> con = driver.getContextHandles();
		for (String c : con) {
			System.out.println("Available Context : " + c);
			if (c.contains(context)) {
				driver.context(c);
				break;
			}
		}
		System.out.println("After Switching : " + driver.getContext());
	}

	public void nativeContent() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.jcp.debug:id/tvOnboardingSkipAll")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.jcp.debug:id/navigation_bar_my_account")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.jcp.debug:id/navigation_bar_home")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_always_button")).click();
	}

	public void webContent() throws InterruptedException {
		driver.findElement(By.id("ctaBlock")).click();
		String webViewText = driver.findElement(By.xpath("//*[@data-automation-id='cart-is-empty']")).getText();
		System.out.println("Cart is empty >>>>>>>>>>>>>>>>>>>>>>>> " + webViewText);

		String webViewText1 = driver.findElement(By.xpath("//*[@class='_2DePO']")).getText();
		System.out.println("See items >>>>>>>>>>>>>>>" + webViewText1);

		String webViewText2 = driver.findElement(By.xpath("//*[@data-automation-id='plcc-banner-heading']")).getText();
		System.out.println("PLCC BANNER HEADING >>>>>>>>>>>>>>>. " + webViewText2);

		driver.findElement(By.id("start-shopping-btn")).click();

		Thread.sleep(7000);
	}

	public void verticalSwipe() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width / 2;
		int starty = (int) (height * 0.80);
		int endy = (int) (height * 0.20);
		driver.swipe(x, starty, x, endy, 500);
	}

	public void tearDown() {
		driver.quit();
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		JcpHybridAppPOC obj = new JcpHybridAppPOC();
		obj.setUp();
		obj.getWebViewText();
		obj.tearDown();
	}
}