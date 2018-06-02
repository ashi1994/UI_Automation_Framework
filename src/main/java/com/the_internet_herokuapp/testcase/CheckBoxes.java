package com.the_internet_herokuapp.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import BaseOperation.BaseClass;

public class CheckBoxes extends BaseClass {
 
 
  @Test(testName="Checkbox")
  public void checkbox() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'Checkboxes')]")).click();
	  Thread.sleep(1000);
	  element=driver.findElement(By.cssSelector("#checkboxes>input:nth-child(1)"));
	  if(element.isSelected())
		  Thread.sleep(2000);
		  element.click();
//		  
//		  To select all available Checkbox
//		   List<WebElement> li=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		   for(WebElement el:li){
//			   if(!el.isSelected())
//				   el.click();
//		   }
	
		 
  }
}
