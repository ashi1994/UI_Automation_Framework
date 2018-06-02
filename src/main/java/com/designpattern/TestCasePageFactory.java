package com.designpattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasePageFactory {
	WebDriver driver;
	Page_Factory login;

	@BeforeTest
	public void setup() {
		String exePath="C:\\workspace\\msqaautomationjars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
	}
	@AfterTest
	public void exit() {
		driver.close();
	}
	@Test
	public void testCase() {
		login=new Page_Factory(driver);
		//login.loginFunc("ashiwani","ranjan");
		login.test1();
		//String str=login.getTitle();
		//Assert.assertEquals(str,"Expected Title");
	}
		
	
}
