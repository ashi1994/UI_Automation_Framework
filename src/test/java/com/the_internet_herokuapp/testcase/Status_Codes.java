/*
 * To check if an image is broken, you can simply check if the naturalWidth of the element is 0. 
 * You would loop through the images on the page and do this check for each. 
 */
package com.the_internet_herokuapp.testcase;

import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;
import com.common.Helper;

public class Status_Codes extends BaseClass {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'Status Codes')]")).click();
	  Reporter.log("Successfully Click",true);
	  List<WebElement> all=driver.findElements(By.cssSelector("#content>div>ul>li>a"));
	  Collections.shuffle(all);
	  WebElement wb=all.get(0);
	  wb.click();
	  Helper.sleep(4000);
	  
	
	  
  }
}
