package com.designpattern;

import org.openqa.selenium.WebDriver;

public class UseSinglton {
	
	public static void main(String[] args) {
		
		SingletonBrowserClass sbc1= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver1 = sbc1.getDriver();
		
		
		SingletonBrowserClass sbc2= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver2 = sbc2.getDriver();
		driver2.get("https://www.google.com");
	}

}

/*
Keep track of same driver instance throughout execution.
DBMS connectivity.
Loading external files like properties, excel etc once rather than loading again and again.
Logger.
*/