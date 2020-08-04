package com.test.sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class RealDeviceConnect {

 WebDriver driver;

 @BeforeTest
 public void setUp() throws MalformedURLException {
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability("deviceName", "21aa5b6f2d017ece");
  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
  capabilities.setCapability(CapabilityType.VERSION, "9.0");
  capabilities.setCapability("platformName", "Android");
  capabilities.setCapability("appPackage", "com.android.calculator2");
  capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

  driver.findElements(By.xpath("//android.widget.Button")).get(0).click();
  driver.findElement(By.name("2")).click();
  driver.findElement(By.name("+")).click();
  driver.findElement(By.name("5")).click();
  driver.findElement(By.name("=")).click();
  String result = driver.findElement(By.className("android.widget.EditText")).getText();
  System.out.println("Number sum result is : " + result);
 }
}