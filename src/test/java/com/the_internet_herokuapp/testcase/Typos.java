package com.the_internet_herokuapp.testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;
import com.constants.Contants;

public class Typos extends BaseClass {
  @Test(description="This test case is for check if there is typos in the String")
  
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'Typos')]")).click();
	  String text=driver.findElement(By.xpath("//div[@class='example']/p[1]")).getText();
	  System.out.println(text);
	  String text1=driver.findElement(By.xpath("//div[@class='example']/p[2]")).getText();
	  System.out.println(text1);
	  assertEquals(text,Contants.expected1,"Not Equals");
	  Thread.sleep(4000);
	  assertEquals(text1,Contants.expected2,"Not Equals");
	  
	  
  }
}
