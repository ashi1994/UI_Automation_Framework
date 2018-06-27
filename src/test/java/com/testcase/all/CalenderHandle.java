package com.testcase.all;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.common.Helper;

public class CalenderHandle extends BaseClass {
	
  @Test
  public void f() throws InterruptedException {
	  //driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
	  Helper.open_Browser("chrome");
	  driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
	  driver.findElement(By.id("datepicker")).click();
	  String caldate="1/March/2018";
	  String []temp=caldate.split("/");
	  String dd,mm,yy;
	  dd=temp[0];
	  mm=temp[1];
	  yy=temp[2];
	  String month,year;
	  year=driver.findElement(By.className("ui-datepicker-year")).getText();
	  month=driver.findElement(By.className("ui-datepicker-month")).getText();
	  WebElement next=driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']"));
	  while (!year.equalsIgnoreCase(yy)) 
	  {
	  driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	  year=driver.findElement(By.className("ui-datepicker-year")).getText();
	  }
	  while (!month.equalsIgnoreCase(mm))
	  {
	  driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	  month=driver.findElement(By.className("ui-datepicker-month")).getText(); 
	  }

	  boolean test=false;

	  List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table//td"));
	  for (int i = 0; i <alldates.size(); i++) 
	  {
	  String date=alldates.get(i).getText();
	  System.out.println(date);
	  if (date.equalsIgnoreCase(dd)) 
	  {
	  System.out.println("True");
	  alldates.get(i).click();
	  test=true;
	  System.out.println("test pass");
	  break;
	  }
	  }
	  Thread.sleep(5000);

	  }
 }

