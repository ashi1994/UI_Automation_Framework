package com.the_internet_herokuapp.testcase;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.common.Helper;
import com.constants.Contants;

import BaseOperation.BaseClass;

public class File_Download extends BaseClass {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'File Download')]")).click();
	  Reporter.log("successfully click File Download");
	  driver.findElement(By.linkText("some-file.txt")).click();
	  Helper.sleep(5000);
	  assertTrue((Helper.fileDownloaded_Verify(Contants.downloadpath,"some-file.txt")),"File not match");
	  Helper.sleep(4000);	  
  }
}
