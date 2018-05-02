package com.the_internet_herokuapp.testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.common.Helper;
import com.constants.Contants;

import BaseOperation.BaseClass;

public class Forgot_Password extends BaseClass{
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).click();
	  driver.findElement(By.id("email")).sendKeys("a@gmail.com");
	  Helper.sleep(2000);
	  driver.findElement(By.cssSelector("#form_submit")).click();
	  Helper.sleep(4000);
	  String text=driver.findElement(By.cssSelector("#content")).getText().trim();
	  System.out.println(text);
	  assertEquals(Contants.passwordSent,text,"Something wrong with sending mail");
	  Helper.sleep(5000);
	  
  }
}
