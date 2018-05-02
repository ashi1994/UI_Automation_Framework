package com.the_internet_herokuapp.testcase;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.common.Helper;

import BaseOperation.BaseClass;

public class WYSIWYG_Editor extends BaseClass {
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//*[contains(text(),'WYSIWYG Editor')]")).click();
	  Reporter.log("Successfully click ",true);
	  //driver.findElement(By.xpath("//*[@id='content']/div/textarea")).clear();
	  Helper.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='content']/div/textarea")).sendKeys("In the journey of Automation, you will end up many situations where your test creates a file and you need to check if the file is created or if the content of the file is appropriate and as per expectations");
	

	  
	  
  }
}

