package com.actionclass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws MalformedURLException {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedriver.exe");
	  URL ra=new URL("http://10.33.176.105:4444/wd/hub");
	   DesiredCapabilities dc=new DesiredCapabilities();
	   dc.setBrowserName("chrome");
	  WebDriver driver=new RemoteWebDriver(ra,dc);

	  
  }
}
