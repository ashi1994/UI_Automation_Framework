package com.testcase.all;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.common.Helper;

public class DataListFilter {
	WebDriver driver=null;
	WebElement element=null;
	
	  @BeforeMethod
	  public void beforeMethod() {
	    	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedriver.exe");
		     System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/"+"src/test/driver/geckodriver.exe");
            //driver=new ChromeDriver();
		     driver=new FirefoxDriver();
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
		  driver.get("http://www.seleniumeasy.com/test/data-list-filter-demo.html");
		  element=driver.findElement(By.xpath("//*[@id='input-search']"));
		  element.click();
		  element.sendKeys("test2@company.com");
		  Helper.sleep(4000);
		  element.clear();
		  element.sendKeys("980-543-3333");
		  Helper.sleep(4000);
		 
		  
		  
	  
  }
}
