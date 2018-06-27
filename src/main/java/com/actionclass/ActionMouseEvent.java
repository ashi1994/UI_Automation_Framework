package com.actionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.baseselenium.BaseClass;


public class ActionMouseEvent  {
	public WebDriver driver=new FirefoxDriver();
	WebElement source=null;
	WebElement desc=null;
	@Test
     public void test1(){
	Actions act=new Actions(driver);
	
	/*
	 * Performs a double-click at the current mouse location.
	 */
	act.doubleClick().perform();
	
	/*
	 * Performs a context-click(Right click) at the current mouse location
	 */
	act.contextClick().perform();
	
	/*
	 * A convenience method that performs click-and-hold at the location of the source element, 
	 * moves to the location of the target element, then releases the mouse.
	 */
	act.dragAndDrop(source,desc).perform();
	
	/*
	 * Clicks (without releasing) at the current mouse location.
	 */
	act.clickAndHold().perform();
	
	/*
	 * Moves the mouse to the middle of the element.
	 */
	act.moveToElement(desc).perform();
	//act.moveToElement(WebElement toElement, int xOffset, int yOffset)-
	/*
	 * Releases the depressed left mouse button at the current mouse location.
	 */
	act.release();

	/*
	 * A convenience method for performing the actions without calling build() first
	 */

	act.perform();
	
	/*
	 * Generates a composite action containing all actions so far, ready to be performed
	 */
	act.build();
}
}