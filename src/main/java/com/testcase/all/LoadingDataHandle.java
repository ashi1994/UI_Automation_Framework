package com.testcase.all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.common.Helper;

public class LoadingDataHandle {
	WebDriver driver=null;
	WebElement element=null;
	
	  @BeforeMethod
	  public void beforeMethod() {
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedriver.exe");
            driver=new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            driver.manage().window().maximize();
		   
	  }

	  @AfterMethod
	  public void afterMethod() {
		  Helper.sleep(4000);
		  driver.quit();
	  }
      
	  @Test
      public void f() {
		  driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
		  element=driver.findElement(By.xpath("//*[@id='save']"));
		  element.click();
		  WebDriverWait wait=new WebDriverWait(driver, 5);
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("loading"),"First Name"));
		  
		  
	  
  }
}
