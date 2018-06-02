package com.testcase.all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.common.Helper;

public class ProgressBar {
	WebDriver driver=null;
	WebElement element=null;
	
	  @BeforeMethod
	  public void beforeMethod() {
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  Helper.sleep(4000);
		  driver.quit();
	  }
      
	  @Test
      public void f() {
		  driver.get("http://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
		  element=driver.findElement(By.xpath("//*[@id='cricle-btn']"));
		  element.click();
//		  WebDriverWait wait=new WebDriverWait(driver, 25);
//		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("percenttext"),"100%"));
		  FluentWait wait1 = new FluentWait(driver);
		  wait1.withTimeout(1, TimeUnit.MINUTES);
		  wait1.until(ExpectedConditions.textToBePresentInElementLocated(By.className("percenttext"),"100%"));
		  wait1.pollingEvery(5, TimeUnit.NANOSECONDS);
		  
		  
	  
  }
}
