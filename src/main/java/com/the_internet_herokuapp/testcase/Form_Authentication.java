package com.the_internet_herokuapp.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.common.Helper;
import com.constants.Contants;
import BaseOperation.BaseClass;


public class Form_Authentication extends BaseClass {
  @Test(description="This test case for Login with valid username and password and its message when it is failed")
  public void valid()  {
	  driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();
	  Helper.sleep(2000);
	  element=driver.findElement(By.id("username"));
	  element.click();
	  element.sendKeys(Contants.username);
	  Helper.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys(Contants.password);
	  Helper.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='radius']/i")).click();
	  String message=driver.findElement(By.cssSelector(".flash")).getText();
	  System.out.print(message);
	  assertEquals(message,Contants.validwarning,"Warning not match");
  }
//	@Test(description="This test case for Login with invalid username and password and its message when it is failed")  
//	public void invalid() {
//		  driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();
//		  Helper.sleep(2000);
//		  driver.findElement(By.id("username")).sendKeys("test");
//		  Helper.sleep(2000);
//		  driver.findElement(By.id("password")).sendKeys("test");
//		  Helper.sleep(2000);
//		  driver.findElement(By.xpath("//button[@class='radius']/i")).click();
//		
//		
//	}
	  
	  
	  
	  
  }

