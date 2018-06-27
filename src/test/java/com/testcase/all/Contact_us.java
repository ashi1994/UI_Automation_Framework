package com.testcase.all;
import java.util.*;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Contact_us {
	
	WebDriver webdriver;
  @Test
  public void f() throws InterruptedException {
	  webdriver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?controller=contact']")).click();
	  
	
	  /**
	   * @return All options belonging to this select tag
	   */
	  
	  Select sc=new Select(webdriver.findElement(By.name("id_contact")));
	  sc.selectByIndex(1);
	  List<WebElement> option=sc.getOptions();
	  
	  int iListSize = option.size();
	 for(int i =0; i < iListSize ; i++) {
	  String sValue = sc.getOptions().get(i).getText();

			// Printing the stored value
			System.out.println(sValue);
     }
			
	  webdriver.findElement(By.id("email")).sendKeys("a@gmail.com");
	  webdriver.findElement(By.id("id_order")).sendKeys("NA");
	  webdriver.findElement(By.id("submit")).sendKeys("C:\\Users\\aranjan\\Desktop\\ashi.txt"); 		
	  webdriver.findElement(By.id("message")).sendKeys("this is a message");
	  webdriver.findElement(By.id("submitMessage")).click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	    String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    webdriver=new ChromeDriver();
	    webdriver.manage().window().maximize();
	    String url="http://automationpractice.com";
	    webdriver.get(url);
	    
	    webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  webdriver.quit();
  }
}
