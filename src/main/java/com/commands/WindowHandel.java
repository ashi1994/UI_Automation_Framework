package com.commands;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandel {
  @Test
  public void f() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.naukri.com/");
	  String mainwindow=driver.getWindowHandle();//After opening the website, we need to get the main window handle 
	  System.out.println(mainwindow);
	  Set<String> set=driver.getWindowHandles();//We now need to get all the window handles.
	  System.out.println("Number of windows opened" +set.size());
	  for(String childwindow:set){
		  //// Here we will compare if parent window is not equal to child window then we will close
		  if(!childwindow.equals(mainwindow)){
			  driver.switchTo().window(childwindow);
			  System.out.println(driver.switchTo().window(childwindow).getTitle());
			   driver.close();
			  }
		  }
	// once all pop up closed now switch to parent window
	  driver.switchTo().window(mainwindow);
	  }
  
 }

