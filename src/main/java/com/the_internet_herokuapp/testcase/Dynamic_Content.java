package com.the_internet_herokuapp.testcase;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import BaseOperation.BaseClass;

public class Dynamic_Content extends BaseClass {
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//*[contains(text(),'Dynamic Content')]")).click();
	  Reporter.log("successfully click ",true);
	  
	  List<WebElement> li=driver.findElements(By.tagName("img"));
	  for(WebElement el:li)
		  System.out.println(el.getAttribute("src"));
	  Reporter.getCurrentTestResult();
	  

	  
	  
  }
}

