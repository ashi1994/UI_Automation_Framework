package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrowserCommand {
	@Test
	public void browser(){
    WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.co.in");
	driver.close();//it will close current working broswer
	driver.quit();//it will close all browser that are opened webdriver
	driver.getCurrentUrl();//to get current url
	driver.getTitle();//to get title of page
	driver.getPageSource();//to get page source
}
}	

