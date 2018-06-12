package com.testcase.all;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.common.Helper;

public class GoogleSearch {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/"+"src/test/driver/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https:\\www.google.co.in");
	  WebElement element=driver.findElement(By.id("lst-ib"));
	  element.click();
	  Helper.sleep(3000);
	  element.sendKeys("iphone 6");
	  Helper.sleep(3000);
	 element.sendKeys(Keys.TAB);
	 Helper.sleep(2000);
	 driver.findElement(By.name("btnK")).click();
	 Helper.sleep(2000);
	 driver.findElement(By.partialLinkText("iPhone 6 32GB")).click();
	 String parent=driver.getWindowHandle();
	 Set<String> childWindow=driver.getWindowHandles();
	 for(String s1:childWindow){
		 if(!s1.equals(parent))
		 driver.switchTo().window(s1);
	 }
	 Helper.sleep(20000);
	 driver.findElement(By.id("buyNowButton")).click();
	 Helper.sleep(8000);
	 driver.findElement(By.id("defaultPinCodeIds")).sendKeys("560068");
	 driver.findElement(By.className("CheckAvailability")).click();
	 
	 
	 
	  
  }
}
