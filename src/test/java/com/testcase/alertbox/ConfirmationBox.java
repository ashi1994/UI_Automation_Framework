package com.testcase.alertbox;

import org.testng.annotations.Test;

import com.common.Helper;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ConfirmationBox {
	WebDriver driver;
  @Test(description="This test case verify the Confimation Alert")
  public void f()  {
	  Helper.sleep(4000);
	  driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
	  //driver.findElement(By.xpath("//*[text()='Try it']")).click();
	  Alert alrt=driver.switchTo().alert();
	  System.out.println(alrt.getText());
	  alrt.dismiss();
	  assertEquals(driver.findElement(By.id("confirmdemo")).getText(), "You Clicked on Cancel!","Not matching");
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    driver=new ChromeDriver();
	    String url=System.getProperty("user.dir")+"/"+"src/test/resources/alert2.html";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	   
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
