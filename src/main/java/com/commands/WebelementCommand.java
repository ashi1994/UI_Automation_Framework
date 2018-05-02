package com.commands;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebelementCommand {
	@Test
	public void browser(){
    WebDriver driver=new ChromeDriver();
    WebElement element=driver.findElement(By.xpath("//div[@name='email']"));
    element.clear();//If this element is a text entry element, this will clear the value. 
    element.sendKeys("test page");//This simulate typing into an element and accepts CharSequence as a parameter 
    element.click();//it used to click on button
    element.submit();//it works better than Click
    element.getText();//to get text
    boolean status = element.isDisplayed();//it check whether element is displayed or not return true or false
    boolean status1 = element.isEnabled();//it check whether element is disable or not it return true or false
    boolean status2 = element.isSelected();//Determine whether or not this element is selected or not and  applies to input elements such as Checkboxes, Select Options and Radio Buttons.
    element.getCssValue("color");//This method Fetch CSS property value of the give element. 
    element.getAttribute("name");//This method gets the value of the given attribute of the element
    Point pt=element.getLocation();//This method locate the location of the element on the page and returns the Point object and which we can get X and Y coordinates of specific element
    System.out.println(pt.x+" "+pt.y);
    Dimension dim=element.getSize();///This method get the dimension of the element on the page and returns the Dimension object and which we can get height and width of specific element
    System.out.println(dim.height+" "+dim.width);
	
	}
	
}