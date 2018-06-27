package com.testcase.all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.common.*;

public class UploadBehaviour extends BaseClass {
  @Test
  public void f() throws InterruptedException {
	  //driver.get("http://topdf.com/");
	  driver.findElement(By.xpath("//span[@class='ui-button-text' and text()='Upload Files']")).click();
	  //element.click();
	 // element.sendKeys("C://workspace//test.txt");
	  //element.sendKeys(Keys.ENTER);
	  //Helper.uploadFileBySendKeys("C://workspace//test.txt",element);
	 // C://workspace//test.txt
	  //C://workspace//test.txt
		  Helper.uploadFileByRobot("C://workspace//test.txt");
	  
  }
}
