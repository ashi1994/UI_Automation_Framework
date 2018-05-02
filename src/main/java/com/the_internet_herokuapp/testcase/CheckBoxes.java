package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import BaseOperation.BaseClass;

public class CheckBoxes extends BaseClass {
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'Checkboxes')]")).click();
	  Thread.sleep(1000);
	  element=driver.findElement(By.cssSelector("#checkboxes>input:nth-child(1)"));
	  if(element.isSelected())
		  Thread.sleep(2000);
		  element.click();
		 
  }
}
