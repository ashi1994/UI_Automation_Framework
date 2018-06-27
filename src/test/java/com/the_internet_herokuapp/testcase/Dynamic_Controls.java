package com.the_internet_herokuapp.testcase;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;
import com.common.Helper;

public class Dynamic_Controls extends BaseClass {
  @Test
  public void Dynamic_Controls_verify() {
	  
	  driver.findElement(By.xpath("//*[contains(text(),'Dynamic Controls')]")).click();
	  Reporter.log("Successfully click ",true);
	  boolean bo=driver.findElements(By.xpath("//*[@class='example']/form/div")).size()>0;
	  if(bo){
		  driver.findElement(By.xpath("//*[@class='example']/form/button")).click();//For remove that element
	  Helper.sleep(6000);
	  assertEquals("It's gone!",driver.findElement(By.xpath("//*[@class='example']/form/p")).getText().trim(),"Not Matched");//Its verify the message
	  driver.findElement(By.xpath("//*[@class='example']/form/button")).click();//For add element
	  Helper.sleep(4000);
	  assertEquals("It's back!",driver.findElement(By.xpath("//*[@class='example']/form/p")).getText().trim(),"Not Matched");//Its verify the message
	  
	  }
	  else
		  driver.findElement(By.xpath("//*[@class='example']/form/button")).click();//For adding the element
		  Helper.sleep(6000);
		  
		  
	  
	  
	  
	  
//	  List<WebElement> li=driver.findElements(By.tagName("img"));
//	  for(WebElement el:li)
//		  System.out.println(el.getAttribute("src"));
//	  Reporter.getCurrentTestResult();
//	  

	  
	  
  }
}

