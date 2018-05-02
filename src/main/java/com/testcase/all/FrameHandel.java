package com.testcase.all;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandel {
	WebDriver driver;

  @Test
  public void f() {
	  List<WebElement> frames=driver.findElements(By.tagName("iframe"));
	  System.out.println("Number of frames "+frames.size());
	  //for getting text on all frame
	  for(int i=0;i<frames.size();i++)
		   System.out.println(driver.findElement(By.tagName("iframe")).getText());
	  
//	  driver.switchTo().frame(1); //pass frame number as parameter.
//	  or
//	  driver.switchTo().frame(“frame Name”); //pass frame name as parameter.
//	  or
//	  driver.switchTo().frame(“xpath of the frame”);
	  
	  driver.switchTo().defaultContent();//to move last frame
	  driver.switchTo().parentFrame();//to move to most parent frame
	  
	  //After switching inside a frame selenium will be able to operate on elements.
	  
//	  driver.findElement(By.xpath("//*[@id=’username’]")).sendKeys("username");
//	  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
	  
	  
	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //String url="https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width";
	    String url="http://toolsqa.wpengine.com/iframe-practice-page/";
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
}