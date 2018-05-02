package com.designpattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasePom {
	WebDriver driver;
	Project_Object_Model login;
	
	 @BeforeTest

	    public void setup(){

	        driver = new FirefoxDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://demo.guru99.com/V4/");

	    }
	 @AfterTest
	 
	    public void tearDown() {
		 driver.close();
	 }
	 
	 @Test
	 public void Verify() {
	 login=new Project_Object_Model(driver);
	 String title=login.getLoginTitle();
	 Assert.assertEquals(title, "Expected Title");
	 login.loginToGuru99("ashiwani","password");
	 
	 
	 
	 }
}
