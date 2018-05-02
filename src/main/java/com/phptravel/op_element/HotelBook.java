package com.phptravel.op_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBook {
	WebDriver driver;
	
	 public HotelBook(WebDriver driver) {
			this.driver=driver;
	}
	  By location=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	  By checkin=By.name("checkin");
	  By checkout=By.name("checkout");
	  By adults=By.name("adults");
	  By child=By.name("child");
	  By submit=By.xpath("//button[contains(text(),'Search')]/i");
  
  public void inputLocation(String input){
	  driver.findElement(location).click();
	  driver.findElement(location).sendKeys(input);
  }
  
  public void inputCheckin(String input){
	  driver.findElement(checkin).clear();
	  driver.findElement(checkin).sendKeys(input);
  }
  public void inputCheckOut(String input){
	  driver.findElement(checkin).clear();
	  driver.findElement(checkout).sendKeys(input);
  }
  public void inputAdult(){
	  Select sc=new Select(driver.findElement(adults));
	  sc.selectByIndex(1);
  }
  
  public void inputChild(){
	  Select sc=new Select(driver.findElement(child));
	  sc.selectByValue("2");
  }
  public void login(){
	  inputLocation("Patna");
	  inputCheckin("28/03/2018");
	  inputCheckin("29/03/2018");
	  inputAdult();
	  inputChild();
  }
  
}
