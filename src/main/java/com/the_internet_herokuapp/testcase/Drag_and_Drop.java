package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.common.Helper;

import BaseOperation.BaseClass;

public class Drag_and_Drop extends BaseClass{
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'Drag and Drop')]")).click();
	  Thread.sleep(3000);
	  WebElement src=driver.findElement(By.cssSelector("#column-a"));
	  WebElement dest=driver.findElement(By.cssSelector("#column-b"));
	 // Helper.dragAndDrop(src,dest);
	//  action=new Actions(driver);
	  src.click();
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src,dest).build().perform();
	 // act.clickAndHold(src).moveToElement(dest).release(dest).perform();
	  
	//  dragAndDrop.perform();
	  Thread.sleep(2000);
	  WebElement header=driver.findElement(By.cssSelector("#column-a>header"));
	  String head=header.getText();
	  System.out.println("head "+head);
	  
  }
}
