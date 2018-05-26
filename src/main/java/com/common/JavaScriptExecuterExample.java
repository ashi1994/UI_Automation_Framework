package com.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterExample {
	
    static WebDriver driver=new ChromeDriver();
    static JavascriptExecutor js=(JavascriptExecutor)driver;
    /**
     * To click a Button in Selenium WebDriver using JavaScript
     * @param element
     */
    public static void clickByJavascript(WebElement element){
    	if (element.isEnabled() && element.isDisplayed()) {
			System.out.println("Clicking on element with using java script click");
    	      js.executeScript("arguments[0].click();", element);}
    	else
    	     System.out.println("Unable to click element");
    	}
    
    public static void scrollByJavaScript(){
    	//Vertical(Y-axis) scroll - down by 150  pixels
    	  js.executeScript("window.scrollBy(0,150)");
    	// for scrolling till the bottom of the page we can use the code like
    	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");  
    }
    public static void getUrlTitelDomainByJavaExecuter(){
    	 //to get the Title of our webpage
    	 String sText =  js.executeScript("return document.title;").toString();
    	 System.out.println(sText);
    	 
    	 //to get the domain
    	 String sText1 =  js.executeScript("return document.domain;").toString();
    	 System.out.println(sText1);
    	 
    	 //to get the URL of our webpage
    	 String sText2 =  js.executeScript("return document.URL;").toString();
    	 System.out.println(sText2);
    }
    
    public static void getInnerText(){
    	 // to get innertext of the entire webpage in Selenium
    	 String sText =  js.executeScript("return document.documentElement.innerText;").toString();
    	 System.out.println(sText);
    }
    
    public static void generateAlertPopup(){
    	 js.executeScript("alert('hello world');");
    }
    
    
    

}
