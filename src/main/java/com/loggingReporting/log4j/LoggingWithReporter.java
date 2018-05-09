package com.loggingReporting.log4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoggingWithReporter {
  @Test
  public void f() {
	  
	  String path="C:\\workspace\\AutomationFramework\\src\\test\\driver\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver",path);
      WebDriver driver=new FirefoxDriver();
      
      Reporter.log("Browser Opened",true);//if boolean value set to true then values will come on console and HTML report as well.
      
      driver.manage().window().maximize();
      
      Reporter.log("Browser Maximized",false);//if boolean value set to false then values will come on HTML report only.
      
      driver.get("http://www.google.com");
      
      Reporter.log("Application started",true);
      
      driver.quit();
      
      Reporter.log("Application closed",false);
      
  }
}
//http://learn-automation.com/generate-log-in-selenium-using-testng/