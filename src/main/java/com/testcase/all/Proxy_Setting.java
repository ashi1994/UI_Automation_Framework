package com.testcase.all;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Proxy_Setting extends BaseClass {
  @Test
  public void f() {
	  
	  FirefoxProfile profile = new FirefoxProfile();
	  profile.setPreference("network.proxy.type", 1);
	  profile.setPreference("network.proxy.http", "localhost");
	  profile.setPreference("network.proxy.http_port", 3128);
	  driver = new FirefoxDriver();
	 
  }
}
