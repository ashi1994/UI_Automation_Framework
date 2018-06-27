package com.testcase.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestRun {
	WebDriver driver=null;
  @Test

	  public void getFirefox(){
          System.setProperty("webdriver.gecko.driver", "C:\\workspace\\msqaautomationjars\\geckodriver.exe");
          System.out.println("Firefox Method is running on Thread : " + Thread.currentThread().getId());
          driver = new FirefoxDriver();
          driver.get("http://www.SoftwareTestingMaterial.com");
          driver.close();
}

  @Test
      public void getChorme(){
          System.setProperty("webdriver.chrome.driver", "C:\\workspace\\msqaautomationjars\\chromedriver.exe");
          System.out.println("Chrome Method is running on Thread : " + Thread.currentThread().getId());
          driver = new ChromeDriver();
          driver.get("http://www.SoftwareTestingMaterial.com");
          driver.close();
  }
}
/*
 * https://www.softwaretestingmaterial.com/parallel-test-execution-testng/
 */

