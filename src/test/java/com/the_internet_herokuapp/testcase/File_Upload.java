package com.the_internet_herokuapp.testcase;


import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;
import com.common.Helper;
import com.constants.Contants;


public class File_Upload extends BaseClass {
  @Test(testName="File Upload")
  public void f() throws FindFailed {
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();
	  Reporter.log("successfully click File Download",true);
	  driver.findElement(By.id("file-upload")).click();
	  Helper.sleep(3000);
//    Helper.uploadFileByRobot(Contants.path);
//	  Helper.sleep(10000);
	  Screen sc=new Screen();
	  Pattern fileInputTextBox = new Pattern(System.getProperty("user.dir")+"/"+"src/test/resources/filesave.PNG");
	  Pattern openButton = new Pattern(System.getProperty("user.dir")+"/"+"src/test/resources/open.PNG");
	  sc.wait(fileInputTextBox, 20);
	  sc.type(fileInputTextBox,Contants.path);
	  sc.click(openButton);
	  driver.findElement(By.id("file-submit")).click();
	  Helper.sleep(10000);	  
	  
  }
}

