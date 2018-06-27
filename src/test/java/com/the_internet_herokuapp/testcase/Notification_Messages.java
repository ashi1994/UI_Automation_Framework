package com.the_internet_herokuapp.testcase;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;

public class Notification_Messages extends BaseClass {
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[contains(text(),'Notification Messages')]")).click();
	  Reporter.log("successfully click",true);
	  String text=driver.findElement(By.id("flash")).getText().replace("×","").trim();
	  System.out.println(text);
	  if(text.equals("Action unsuccesful, please try again"))
		  System.out.println("some thing wrong");
		  else if(text.equals("Action successful"))
			  System.out.println("All is well");
			  else
				  System.out.println("Unable to verify condition");		  
		  }
	  }
	  
	  


