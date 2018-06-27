package com.testcase.all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseClickAndSElect extends BaseClass {
  @Test
  public void f() {
	  driver.get("http://automationpractice.com/index.php");
	  Actions act=new Actions(driver);
	  element=driver.findElement(By.xpath("//a[@class='sf-with-ul' and text()='Women']"));
	  act.moveToElement(element);
	  
	  WebElement subelement=driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=7&controller=category' and @title='Blouses']"));
       act.moveToElement(subelement).click().build().perform();
       
       /**
        * Function for Right click,Double Click,Press keys
        * 
        */
       act.doubleClick().perform();//double click
       act.contextClick().perform();//right click
       
       WebElement textbox = driver.findElement(By.id("idOfElement"));
       textbox.sendKeys(Keys.RETURN);
       
       
  
  }
  
}
