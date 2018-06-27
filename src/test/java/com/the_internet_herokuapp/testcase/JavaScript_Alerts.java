package com.the_internet_herokuapp.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;

public class JavaScript_Alerts extends BaseClass{
  @Test(description="This test case will verify All alert of java script")
  public void verifyAllalert() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'JavaScript Alerts')]")).click();
	  
	  //Alert Box
	  driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]")).click(); 
	  Alert al=driver.switchTo().alert();
	  Thread.sleep(5000);
	  System.out.println(al.getText());
	  al.dismiss();
	  
	  //Confirm Box
	  driver.findElement(By.xpath("//*[contains(text(),'Click for JS Confirm')]")).click(); 
	  Alert al1=driver.switchTo().alert();
	  Thread.sleep(5000);
	  //al1.accept();
	  System.out.println(al1.getText());
	  al1.dismiss();
	  
	  //Prompt Box
	  driver.findElement(By.xpath("//*[contains(text(),'Click for JS Prompt')]")).click(); 
	  Alert al2=driver.switchTo().alert();
	  Thread.sleep(5000);
	  System.out.println(al2.getText());
	  al2.sendKeys("hello");
	  Thread.sleep(5000);
	  al2.accept();
	  
	  
	  
  }
}
