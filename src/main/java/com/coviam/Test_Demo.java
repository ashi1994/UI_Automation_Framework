package com.coviam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * TODO Put here a description of what this class does.
 *
 * @author ssamaji.
 *         Created Jun 5, 2018.
 */
public class Test_Demo {


@Test
public static void Test_Meth(){
	boolean isTestPassed=false;
	
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/"+"src/test/driver/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://coviam.com");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,50);
	
	wait.until(ExpectedConditions.urlContains("http://coviam.com/"));
	
	TestOperations operations=new TestOperations(driver);
	isTestPassed=operations.verifyNavigation();
//	System.out.println("isTestPassed"+isTestPassed);
	  
	operations.verifyCarrerSearch();
	
	
	
}
}
