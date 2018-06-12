package com.testcase.alertbox;

import org.openqa.selenium.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alertpopup {
	
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver", exePath);
		    driver=new ChromeDriver();
		    //String url="C://workspace//Alert_handel//alert1.html";
		    String url=System.getProperty("user.dir")+"/"+"src/test/resources/alert1.html";
		    driver.get(url);
		    driver.manage().window().maximize();
	}
	
  @Test(description="Simple Alert")
  public void f() throws InterruptedException {
	  
			Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	  driver.quit();
  }
}
