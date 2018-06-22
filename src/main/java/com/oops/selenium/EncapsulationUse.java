package com.oops.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EncapsulationUse {
	WebDriver driver=new FirefoxDriver();

	public void use(){
		Encapsulation obj=new Encapsulation(driver);
		obj.getUserName().sendKeys("ashiwani");
		obj.getPassword().sendKeys("password");
		
	}
	
}
