package com.the_internet_herokuapp.testcase;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;
import com.common.Helper;

public class Multiple_Windows extends BaseClass {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'Multiple Windows')]")).click();
	  Reporter.log("successfully click");
	  driver.findElement(By.partialLinkText("Click Here")).click();
	  String Parent_Window = driver.getWindowHandle();
	  // Switching from parent window to child window
	  for (String Child_Window : driver.getWindowHandles()){
	  driver.switchTo().window(Child_Window);
	  // Performing actions on child window
	  String text=driver.findElement(By.cssSelector(".example>h3")).getText();
	  System.out.println(text);
	  }
	  //Switching back to Parent Window
	  driver.switchTo().window(Parent_Window);
	  Helper.sleep(3000);
	  
	  
  }
}

