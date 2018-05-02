package com.phptravel.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.phptravel.op_element.HotelBook;

import BaseOperation.BaseClass;


public class HotelBookTest extends BaseClass  {
	WebDriver driver;
	HotelBook hb=null;
	
  @Test
  public void f() {
	  hb=new HotelBook(driver);
	  hb.login();
  }
}
