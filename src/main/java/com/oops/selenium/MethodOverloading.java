/*
 * We use implicit wait in Selenium. Implicit wait is an example of overloading. 
 * In Implicit wait we use different time stamps such as SECONDS, MINUTES, HOURS etc.,
 * 
 */

package com.oops.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOverloading {
	WebDriver driver=new ChromeDriver();
	
	
	public void waitOverload(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.DAYS);
	}
	
	public void frameOverloading(){
		driver.switchTo().frame(1);
		driver.switchTo().frame("name");
		driver.switchTo().frame("element");
	}
	
	public void elementFindOverloading(){
		driver.findElement(By.xpath("path"));
		driver.findElement(By.id("1"));
		driver.findElement(By.name("name"));
		driver.findElement(By.cssSelector("selecter"));	
	}
	
	public void waitMethod() throws InterruptedException{
		driver.wait();
		driver.wait(1000);
		driver.wait(1000, 10);
	}

}
