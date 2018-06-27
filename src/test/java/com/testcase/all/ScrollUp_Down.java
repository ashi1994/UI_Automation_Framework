package com.testcase.all;
/*
 * JavaScriptExecutor is a interface.
 * JavascriptExecutor js = (JavascriptExecutor) driver;  
   js.executeScript(Script,Arguments);
   Script – This is the JavaScript that needs to execute.
   Arguments – It is the arguments to the script. It's optional.
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;

public class ScrollUp_Down extends BaseClass {
  @Test
  public void f() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  //js.executeScript("window.scrollBy(0,1000)");//To scroll down the web page by pixel.
	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");//To scroll down the web page at the bottom of the page.
	  //"document.body.scrollHeight" returns the complete height of the body i.e web page.
	 
	  
  }
}

//https://www.guru99.com/scroll-up-down-selenium-webdriver.html