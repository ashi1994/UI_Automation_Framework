package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.common.Helper;

import BaseOperation.BaseClass;

public class Key_Presses extends BaseClass {
  @Test(description="This test case for press any key on screen")
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'Key Presses')]")).click();
	  Reporter.log("successfully click");
	  action=new Actions(driver);
	  action.sendKeys("b").build().perform();
	  Helper.sleep(7000);
	  
  }
}