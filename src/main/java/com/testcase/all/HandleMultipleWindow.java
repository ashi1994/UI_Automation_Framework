package com.testcase.all;


import java.util.Set;

import org.testng.annotations.Test;

public class HandleMultipleWindow extends BaseClass {
  @Test
  public void f() {
	  //this is for Handle multiple pop up
	  Set<String> windows=driver.getWindowHandles();
	  for(String s1:windows) {
		  driver.switchTo().window(s1);
	  }
  }
}
