/*
 * Page factory is extension of POM or we can inhance version of POM.
 * PageFactory.initElements() static method takes the driver instance of the given class 
 * and the class type, and returns a Page Object with its fields fully initialized.
 */

package com.designpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Factory {

	WebDriver driver;
	
	 public Page_Factory(WebDriver driver) {
	    	this.driver=driver;
	    	//Page factory class has one method that is useful for Intialized the web element
	    	//This initElements method will create all WebElements
	    	PageFactory.initElements(driver,this);
	    }

    @FindBy(name="uid")

    public WebElement user99GuruName;

 
    @FindBy(name="password")

    WebElement password99Guru;

    

    @FindBy(className="barone")

    WebElement titleText;

    

    @FindBy(name="btnLogin")

    WebElement login;
    
    
    public void inputUserName(String usrname) {
    	user99GuruName.sendKeys(usrname);
    }
    
    public void inputPassword(String pass) {
    	password99Guru.sendKeys(pass);
    }
   
    public String getTitle() {
    	return titleText.getText();
    }
    
    public void clickLogin() {
    	login.click();
    }
    
    public void loginFunc(String usrname,String pass) {
    	inputUserName(usrname);
    	inputPassword(pass);
    	getTitle();
    	clickLogin();
    }
    
    
}
