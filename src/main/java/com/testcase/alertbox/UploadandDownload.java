package com.testcase.alertbox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class UploadandDownload {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("clientUpload")).click();
	  driver.findElement(By.id("clientUpload")).sendKeys("C://workspace//Alert_handel//convert.txt");
	  driver.findElement(By.id("clientUpload")).sendKeys(Keys.ENTER);
	  Thread.sleep(10000);
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    driver=new ChromeDriver();
	    String url="https://www.freepdfconvert.com/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		  driver.quit();
  }

}
