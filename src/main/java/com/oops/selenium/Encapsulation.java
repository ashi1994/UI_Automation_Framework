/*
 * All the classes in a framework are an example of Encapsulation. 
   In POM classes, we declare the data members using @FindBy and 
 * initialization of data members will be done using Constructor to utilize those in methods.
 */

package com.oops.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Encapsulation {
	WebDriver driver=new ChromeDriver();
	
	public Encapsulation(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name="something")
	WebElement login;
	
	@FindBy(id="something")
	WebElement password;
	
	public void inputUserName(String uname){
		login.sendKeys(uname);
	}
	
	public void inputPassword(String pwd){
		login.sendKeys(pwd);
	}
	
	public WebElement getUserName(){
		return login;
		
	}
	
	public WebElement getPassword(){
		return password;
	}
	

}
