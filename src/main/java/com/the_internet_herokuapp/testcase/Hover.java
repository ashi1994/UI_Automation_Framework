package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import BaseOperation.BaseClass;

public class Hover extends BaseClass {
  @Test(description="This test case for mouse over and get the text")
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'Hovers')]")).click();
	  element=driver.findElement(By.xpath("//div[@class='example']/div[1]"));
	  action=new Actions(driver);
	  Thread.sleep(3000);
	  action.moveToElement(element).perform();
	  Thread.sleep(5000);	  
  }
}
