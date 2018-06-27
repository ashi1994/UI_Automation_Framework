package com.the_internet_herokuapp.testcase;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;

public class Disappearing_Elements extends BaseClass {
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'Disappearing Elements')]")).click();
	  Thread.sleep(3000);
	  List<String> expected=new ArrayList<>();
	  expected.add("Home");
	  expected.add("About");
	  expected.add("Contact Us");
	  expected.add("Portfolio");
	  expected.add("Gallery");
	  //Expected List
	  for(String str:expected)
		  System.out.println(str);
	  
	  List<WebElement> li=driver.findElements(By.cssSelector(".example>ul>li"));
	  for(WebElement el:li)
	    System.out.println(el.getText().trim());
	  System.out.println("No of WebElement  "+li.size());
	  assertEquals(expected.size(),li.size(),"Element is Differnet");
	  
	  
		
	  
  }

}