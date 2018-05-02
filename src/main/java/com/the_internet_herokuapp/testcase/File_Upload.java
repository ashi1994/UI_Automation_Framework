package com.the_internet_herokuapp.testcase;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.common.Helper;
import com.constants.Contants;

import BaseOperation.BaseClass;

public class File_Upload extends BaseClass {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();
	  Reporter.log("successfully click File Download");
	  driver.findElement(By.id("file-upload")).click();
	  Helper.sleep(3000);
	  Helper.uploadFileByRobot(Contants.path);
	  Helper.sleep(10000);
	  driver.findElement(By.id("file-submit")).click();
	  Helper.sleep(10000);	  
	  
  }
}

