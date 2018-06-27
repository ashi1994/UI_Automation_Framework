package com.testcase.all;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTip {
	 WebDriver driver;
  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }
	 
  @Test
  public void f() {
	 
	 
	  driver.get("https://www.seleniumhq.org/");
	  WebElement element = driver.findElement(By.cssSelector("#header>h1>a"));
		// Get tooltip text
		String toolTipText = element.getAttribute("title");
		System.out.println("Tool tip text present :- " + toolTipText);
		assertEquals("Return to Selenium home page",toolTipText,"Some Thing wrong with feature" );
		
  }
	@Test
	public void h() {
		driver.navigate().to("https://jqueryui.com/tooltip/");

		// As there is frame, we have to navigate to frame
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

		// Text box field, where we mouse hover
		WebElement element = driver.findElement(By.id("age"));

		// Use action class to mouse hover on Text box field
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));

		// To get the tool tip text and assert
		String toolTipText = toolTipElement.getText();
		assertEquals("We ask for your age only for statistical purposes.", toolTipText);
		
	}
	@AfterTest
	public void tearDown(){
		driver.close();
	}
	
	  
  }

