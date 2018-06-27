package com.testcase.all;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class ScreenshotDemo{

	String driverExecutablePath = "lib\\chromedriver.exe";
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		driver = new ChromeDriver();
		
		//Set implicit wait of 3 seconds
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	
	@Test
	//Tests google calculator
	public void googleCalculator() throws IOException{
		
		//Launch google
		driver.get("http://www.google.co.in");
		
		//Write 2+2 in google textbox
		WebElement googleTextBox = driver.findElement(By.id("lst-ib"));
		googleTextBox.sendKeys("2+2");
		
		//Hit enter
		googleTextBox.sendKeys(Keys.ENTER);
		
		//Get result from calculator
		WebElement calculatorTextBox = driver.findElement(By.id("cwtltblr"));
		String result = calculatorTextBox.getText();
		
		//Intentionaly checking for wrong calculation of 2+2=5 in order to take screenshot for failing test
		Assert.assertEquals(result, "5");
	}
		
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getStatus());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
	   }        
	}
	
}

/**
 * https://www.softwaretestingmaterial.com/capture-screenshot-of-failed-test-cases-using-selenium-webdriver-2/
 * 
 * We can use try-catch also for taking screenshot,put scripts in tey block and screen shot code in catch block
 * 
*/