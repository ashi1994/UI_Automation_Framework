package com.commands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.Test;

import BaseOperation.BaseClass;

public class MultipleTabHandles extends BaseClass {
	
  @Test
  public void f() throws AWTException, InterruptedException {
	  String parentWindow = driver.getWindowHandle();
	  Robot r = new Robot(); 
	  r.keyPress(KeyEvent.VK_CONTROL); 
	  r.keyPress(KeyEvent.VK_T); 
	  r.keyRelease(KeyEvent.VK_CONTROL); 
	  r.keyRelease(KeyEvent.VK_T);
	  Thread.sleep(5000);
//	  r.keyPress(KeyEvent.VK_CONTROL); //If you want switch on particular tab then we can CNTRL+1 and so on
//	  r.keyPress(KeyEvent.VK_1); 
//	  r.keyRelease(KeyEvent.VK_CONTROL); 
//	  r.keyRelease(KeyEvent.VK_1);
	  driver.switchTo().window(parentWindow);//it will move to parent tab
	  Thread.sleep(5000);
	  this.driver.get("https://www.google.co.in");
  }
}
