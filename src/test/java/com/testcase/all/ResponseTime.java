package com.testcase.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResponseTime {
	public static void main(String...s) throws Exception{
	
	System.setProperty("webdriver.chrome.driver","/Users/ashiwani.ranjan/Downloads/chromedriver");
	WebDriver driver=new ChromeDriver();
	long startTime = System.currentTimeMillis();

	driver.get("https://www.google.com");

	//new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("Calculate")));

	long endTime = System.currentTimeMillis();

	long totalTime = endTime - startTime;

	System.out.println("Total Page Load Time: " + totalTime + " milliseconds");

}
}