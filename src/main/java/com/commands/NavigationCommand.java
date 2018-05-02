package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommand {
	@Test
	public void browser(){
    WebDriver driver=new ChromeDriver();
	driver.navigate().to("https:\\www.google.co.in");//This method Loads a new web page in the current browser window. 
	driver.navigate().back();//This method does the same operation as clicking on the Forward Button of any browser.
	driver.navigate().forward();//This method does the same operation as clicking on the Back Button of any browser
	driver.navigate().refresh();//This method Refresh the current page
	

}
}