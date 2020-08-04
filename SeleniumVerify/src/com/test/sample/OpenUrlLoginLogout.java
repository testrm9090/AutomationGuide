package com.test.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenUrlLoginLogout {

	 static
     {            
      System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
  }
	 //setting the browser driver
	 private static void Typevalue(WebDriver driver,String locator,String locatorName,String Value)
	 			
	 {
   	  try {
   			
   		WebDriverWait wait = new WebDriverWait(driver, 3); //waiting for page Load

		boolean str = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='USER']"))) != null;
		//An expectation for checking that an element is present on the page and visible.
   			if (str) {

   				driver.findElement(By.xpath(locator)).clear();
   				driver.findElement(By.xpath(locator)).click();
   				driver.findElement(By.xpath(locator)).sendKeys(Value);
   				String SuccessMsg = "<font color='green'>Typed '"+Value+"' in '"+locatorName+"'</font><br>";
   				System.out.println(SuccessMsg);
   			}
   		}catch (Exception e)
   		{
   			System.out.println(e.getLocalizedMessage());
   		}
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();	//creating a new instance of Chrome Driver
         
          driver.get("https://businessq2.socalgas.com/"); 		//Navigate to URl
         String UserId="//input[@id='USER']";					//setting the XPath of element to be found
         String UserVaLUE="pbusiness2";							//Setting Value to be entered in element
         Typevalue(driver, UserId, "UserID", UserVaLUE);		//Calling the TypeValue method
         
       
         String Password="//input[@id='PASSWORD']";		//setting the XPath of element to be found
         String PasswordVaLUE="password";				//Setting Value to be entered in element
         Typevalue(driver, Password, "Password", PasswordVaLUE);	//Calling the TypeValue method


         driver.findElement(By.xpath("//input[@id='loginButton']")).click(); //Finding the LoginButton by Xpath and clicking
         WebDriverWait wait = new WebDriverWait(driver, 90);			//wait until page loads

			boolean str = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='greeting-user']"))) != null;
			//An expectation for checking that an element is present on the page and visible.
         if(str){
        	 driver.findElement(By.xpath("//button[@id='pt1:logout-btn']")).click(); //Finding the LogoutButton by Xpath and clicking
         }
          //driver.manage().window().maximize();
     
   }
	}

