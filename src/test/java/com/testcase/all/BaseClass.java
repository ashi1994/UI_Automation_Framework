package com.testcase.all;

import org.testng.annotations.Test;

import com.common.Helper;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	protected static WebDriver driver;
	WebElement element;
	
 
  @BeforeMethod
  public void beforeMethod() {
	  Helper.open_Browser("chrome");
	   
  }

  @AfterMethod
  public void afterMethod() {
	  Helper.close_browser();
  }

}
