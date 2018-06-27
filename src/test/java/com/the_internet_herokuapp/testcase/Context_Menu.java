package com.the_internet_herokuapp.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;
import com.common.Helper;

public class Context_Menu extends BaseClass {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'Context Menu')]")).click();
	  Reporter.log("Successfully Click ");
	  element=driver.findElement(By.id("hot-spot"));
	  action=new Actions(driver);
	  action.moveToElement(element);
	  Helper.sleep(3000);
	  action.contextClick(element).perform();
	  Helper.sleep(4000);
	  
	  
  }
}

