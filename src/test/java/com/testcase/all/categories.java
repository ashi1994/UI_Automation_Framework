package com.testcase.all;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class categories {
	WebDriver webdriver;
  @Test
  public void f() {
	  webdriver.findElement(By.cssSelector(".sf-with-ul[title=Women]")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    webdriver=new ChromeDriver();
	    String url="http://automationpractice.com";
	    webdriver.get(url);
	    webdriver.manage().window().maximize();
  }

  @AfterMethod
	  public void afterMethod() {
		  webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		  webdriver.quit();
	  }
  }


