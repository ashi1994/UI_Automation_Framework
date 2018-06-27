package com.the_internet_herokuapp.testcase;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;

public class DropDown_List extends BaseClass {
  @Test
  public void dropDown() throws InterruptedException {
	  driver.findElement(By.xpath("//*[contains(text(),'Dropdown')]")).click();
	  element=driver.findElement(By.id("dropdown"));
	  element.click();
	  Reporter.log("User is Sucessful clicked",true);
	  Select sc=new Select(element);
	  List<WebElement> li=sc.getOptions();
	  for(WebElement web:li)
		  System.out.println(web.getText());
	  Thread.sleep(2000);
	  sc.selectByVisibleText("Option 1");
	  Thread.sleep(3000);
	 	  
  }
}
