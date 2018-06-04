/*
 * Simple example of Interface In selenium WebDriver Is WebDriver Interface. 
 * When you are Initializing any browser using selenium WebDriver we write below code
 * An interface can have methods and variables just like the class but the methods declared in interface are by default abstract. 
 * We can achieve 100% abstraction and multiple inheritance in Java with Interface
 */

package com.oops.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Interface {
	WebDriver driver = new FirefoxDriver();
	
	WebDriver driver1 = new ChromeDriver();

}
