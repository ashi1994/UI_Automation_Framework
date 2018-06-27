/*
 * We create a Base Class in the Framework to initialize WebDriver interface, 
 * WebDriver waits, Property files, Excels, etc., in the Base Class.
 */
package com.oops.selenium;

import org.testng.annotations.Test;

import com.baseselenium.BaseClass;

public class Inheritance extends BaseClass {
	
	@Test
	void run(){
		driver.get("something");
	}
	

}
