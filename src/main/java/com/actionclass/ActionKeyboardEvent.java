package com.actionclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseOperation.BaseClass;


public class ActionKeyboardEvent  {
	public WebDriver driver=new FirefoxDriver();
	WebElement source=null;
	WebElement desc=null;
	@Test
     public void test1(){
	Actions act=new Actions(driver);
	
	/*
	 * Sends keys to the active element
	 */
	act.sendKeys("b");
	act.sendKeys("x");
	
	/*
	 * Performs a modifier(Either Keys.SHIFT, Keys.ALT or Keys.CONTROL) key press, Note that the modifier key is never released implicitly
	 * Performs a modifier key press after focusing on an element
	 */
	act.keyDown(Keys.CONTROL);
	act.keyDown(desc,Keys.CONTROL);
	
	
	/*
	 * Performs a modifier(Either Keys.SHIFT, Keys.ALT or Keys.CONTROL)  key release
	 */
	act.keyUp(Keys.CONTROL);
	act.keyUp(desc,Keys.SHIFT);
	
	/*
	 * To send a series of keyStrokes onto the element
	 * To send a series of keystroke onto given element
	 */
	act.sendKeys("b");
	act.sendKeys(desc,"a");

	/*
	 * Send sequence of character in 
	 */
	act.keyDown(Keys.CONTROL).sendKeys("b");
	act.keyUp(Keys.CONTROL);
	
	
}
}