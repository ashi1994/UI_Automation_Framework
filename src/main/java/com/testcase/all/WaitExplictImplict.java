package com.testcase.all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExplictImplict {
  private static final TimeUnit SECONDS = null;

@Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	 
	  /*
	   * 1. Implict wait condition
	   * Here we wait for 10 seconds, after that it gives NoSuchElementException. 
	   * If the element present in 5 second then it should not wait for another 5 seconds
	   */
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  /*
	   *2.  Worst Wait never use
	   */
	  Thread.sleep(2000);
	  
	  
	 
	  /*
	   *3. Explict wait condition and it is applicable for single element
	   *   Intelligent kind of wait
	   *   Explicit wait gives better options than that of an implicit wait as it will wait for dynamically loaded Ajax elements.
	   */
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
	  
	  /*
	   *4.Fluent wait,it has two parameters – timeout value and polling frequency.
	   */
	  
	  FluentWait wait1 = new FluentWait(driver);// Create object of FluentWait class and pass webdriver as input
	  
	  wait1.pollingEvery(2, SECONDS);// It should poll webelement after every two second
	  
	  wait1.withTimeout(30, SECONDS);//Max time for wait- If conditions are not met within this time frame then it will fail the script.
	  
      wait1.ignoring(NoSuchElementException.class);
			   
	  wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("id")));


	  
  }
}

//https://www.softwaretestingmaterial.com/webdriverwait-selenium-webdriver/
//http://www.techbeamers.com/webdriver-fluent-wait-command-examples/
