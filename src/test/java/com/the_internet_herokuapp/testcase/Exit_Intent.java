package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;
import com.common.Helper;

public class Exit_Intent extends BaseClass {
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//*[contains(text(),'Exit Intent')]")).click();
	  Reporter.log("successfully click ",true);
	  action=new Actions(driver);
	  action.moveToElement(driver.findElement(By.id("flash-messages"))).perform();
	  Helper.sleep(4000);	  
	  
  }
}

