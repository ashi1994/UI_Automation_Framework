/**
 * Page Object Model is a Design Pattern which has become popular in Selenium Test Automation
 * it is mainly used to create repositry for storing web element
 * Let suppose we have 10 web element in webpage in future might be increased so there is problem to manage the code
 * In POM we create seperate class for each webpage(element+operation)
 * In pom we Seperate Page and Test cases.
 */

package com.designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Project_Object_Model {
	
	  WebDriver driver;

	    By user99GuruName = By.name("uid");

	    By password99Guru = By.name("password");

	    By titleText = By.className("barone");

	    By login = By.name("btnLogin");

	    

	    public Project_Object_Model(WebDriver driver){

	        this.driver = driver;

	    }

	    //Set user name in textbox

	    public void setUserName(String strUserName){

	        driver.findElement(user99GuruName).sendKeys(strUserName);

	    }

	    

	    //Set password in password textbox

	    public void setPassword(String strPassword){

	         driver.findElement(password99Guru).sendKeys(strPassword);

	    }

	    

	    //Click on login button

	    public void clickLogin(){

	            driver.findElement(login).click();

	    }

	    

	    //Get the title of Login Page

	    public String getLoginTitle(){

	     return driver.findElement(titleText).getText();

	    }

	    /**

	     * This POM method will be exposed in test case to login in the application

	     * @param strUserName

	     * @param strPasword

	     * @return

	     */

	    public void loginToGuru99(String strUserName,String strPasword){

	        //Fill user name

	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button

	        this.clickLogin();        

	        

	    }

}

//https://qeworks.com/page-object-model-based-automation-framework/
