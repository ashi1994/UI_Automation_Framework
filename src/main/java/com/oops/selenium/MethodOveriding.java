/*
 * We use a method which was already implemented in another class by changing its parameters.(Helper class)
 */

package com.oops.selenium;

import org.openqa.selenium.WebElement;

import com.common.Helper;

public class MethodOveriding {
	WebElement element=null;
	
	
	public void overrideMouseOverMethod(){
		Helper.mouseOver(element);
	}
	
	public void overrideSleep(){
		Helper.sleep(2000);
	}

}
