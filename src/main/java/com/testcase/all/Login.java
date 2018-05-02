package com.testcase.all;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver webdriver;
  @Test
  public void f() throws InterruptedException {
	  
	 
	  webdriver.findElement(By.cssSelector(".login")).click();
	  
	  webdriver.findElement(By.cssSelector("#email")).sendKeys("ashiwanir324@gmail.com");
	  
	  webdriver.findElement(By.cssSelector("#passwd")).sendKeys("mithu1994");
	  
	  webdriver.findElement(By.cssSelector("#SubmitLogin>span")).click();
	
	  webdriver.navigate().forward();
	 
	 
	 
  } 
  
  @BeforeMethod
  public void beforeMethod() {
	    String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    webdriver=new ChromeDriver();
	    String url="http://automationpractice.com";
	    webdriver.get(url);
	    webdriver.manage().window().maximize();
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	  webdriver.quit();
  }

}
