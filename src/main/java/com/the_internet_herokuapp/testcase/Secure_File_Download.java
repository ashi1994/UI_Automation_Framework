package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.common.Helper;
import com.constants.Contants;

import BaseOperation.BaseClass;

public class Secure_File_Download extends BaseClass {
  @Test
  public void f() {
//	  driver.findElement(By.xpath("//*[contains(text(),'Basic Auth')]")).click();
//	  Reporter.log("Successfully click Basic Authentication");
	  String burl=driver.getCurrentUrl();
	  String baseUrl="http://" + "admin" + ":" + "admin" + "@" + "the-internet.herokuapp.com/download_secure";
	  driver.get(baseUrl);
	  driver.findElement(By.partialLinkText("some-file.txt")).click();
	  Helper.sleep(2000);
	  Helper.fileDownloaded_Verify(Contants.downloadpath,"some-file.txt");
	  Helper.sleep(5000);
	  
  }
}
/*
 * Using code above we are providing credentials in URL which will add username & password in URL ), 
 * while running the script it will bypass the authentication window successfully.
 * 
 */