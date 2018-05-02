package com.testcase.all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Refresh_Page extends BaseClass {
  @Test(priority=1,enabled=false)
  public void f() {
	  
	  driver= new FirefoxDriver();
		String URL="http://www.facebook.com";
		driver.navigate().to(URL);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("sample@email.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		//driver.getCurrentUrl();
		//driver.navigate().to(driver.getCurrentUrl());
		//driver.get(driver.getCurrentUrl());
  }
  /*
   * This is using Actions Class
   */
  
  @Test(priority=2)
public void f2() {
	  
	driver= new FirefoxDriver();
	driver.navigate().to("http://google.com");
	Actions actions = new Actions(driver);
	actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	


  }
}
