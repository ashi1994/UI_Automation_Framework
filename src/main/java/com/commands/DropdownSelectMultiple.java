/*
 * Select is a class which is provided by Selenium to perform multiple operations on DropDown object and Multiple Select object.
 */

package com.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownSelectMultiple {
	@Test
	public void dropDown() {
		System.setProperty("webdriver.chrome.driver","c:\\path");
		WebDriver driver=new ChromeDriver();
		Select sc=new Select(driver.findElement(By.xpath("//drpdownelemnt")));
		sc.selectByIndex(1);
		sc.selectByValue("value");
		sc.selectByVisibleText("some text");
		sc.deselectByIndex(1);
		sc.deselectByValue("value");
		sc.deselectByVisibleText("some text");
		sc.deselectAll();
		List<WebElement> li=sc.getOptions();
		for(WebElement el:li)
			System.out.println(el.getText());
		
		sc.isMultiple();//This tells whether the SELECT element support multiple selecting options at the same time or not
			
		
	}

}
