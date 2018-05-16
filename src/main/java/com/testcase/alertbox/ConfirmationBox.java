package com.testcase.alertbox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ConfirmationBox {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
	  driver.findElement(By.xpath("//*[text()='Try it']")).click();
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Alert alrt=driver.switchTo().alert();
	  
	  alrt.dismiss();
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    driver=new ChromeDriver();
	   // String url="C://workspace//Alert_handel//alert2.html";
//	    String url=System.getProperty("user.dir")+"/"+"src/test/resources/alert2.html";
//	    driver.get(url);
	    driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
	    driver.manage().window().maximize();
	   
  }

  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	  driver.quit();
  }

}
