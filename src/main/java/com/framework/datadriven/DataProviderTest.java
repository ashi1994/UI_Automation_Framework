package com.framework.datadriven;

import org.testng.annotations.Test;

import com.baseselenium.BaseClass;

import org.openqa.selenium.By; 
import org.testng.annotations.DataProvider;
 

 
public class DataProviderTest extends BaseClass {
 
  @DataProvider(name = "Authentication")
 
//  public static Object[][] credentials() {
// 
//        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
// 
//  }
  public Object[][] getData(){
	  // Create object with two paraments
	  // first parameter is row and second one is column
	  Object[][] data = new Object[2][2];
	  data[0][0] = "testemailone@gmail.com";
	  data[0][1] = "password";
	  data[1][0] = "testemailtwo@test.com";
	  data[1][1] = "password";
	  
	  return data;
  }
  
 
  // Here we are calling the Data Provider object with its Name
 
  @Test(dataProvider = "Authentication")
 
  public void test(String sUsername, String sPassword) {
 
 
      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
      driver.findElement(By.id("log")).sendKeys(sUsername);
 
      driver.findElement(By.id("pwd")).sendKeys(sPassword);
 
      driver.findElement(By.id("login")).click();
 
      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
 
      driver.quit();
}
}

/*
DataProvider marks a methods for supplying the data to other methods.
Annotated methods return an array of Object i.e. Object[][].
DataProvider can have a name, and it will be used in other methods by using its name.
DataProvider can be implemented in the same class or different class.
A Data Provider is a method annotated with @DataProvider.
*/


//https://www.softwaretestingmaterial.com/data-driven-framework-selenium-webdriver/
//http://testingpool.com/dataprovider-in-testng/






