package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.common.Helper;

import BaseOperation.BaseClass;

public class Basic_Auth extends BaseClass {
  @Test(testName="Basic Authentication")
  public void f() {
//	  driver.findElement(By.xpath("//*[contains(text(),'Basic Auth')]")).click();
//	  Reporter.log("Successfully click Basic Authentication");
	  String burl=driver.getCurrentUrl();
	  String baseUrl="http://"+"admin"+":"+"admin"+"@"+"the-internet.herokuapp.com/basic_auth";
	  driver.get(baseUrl);
	  Helper.sleep(5000);
	  
  }
}

/*
 * Using code above we are providing credentials in URL which will add username & password in URL ), 
 * while running the script it will bypass the authenticastion window successfully
 * 
 */