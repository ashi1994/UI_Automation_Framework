package com.testcase.all;
import org.testng.annotations.Test;
import com.common.*;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class signup {
	WebDriver webdriver;
  @Test
  public void f() throws Exception {
	  webdriver.findElement(By.cssSelector(".login")).click();
      Thread.sleep(10000);
      
      Helper.takeSnapShot(webdriver, Helper.screenShotName());
      
	  webdriver.findElement(By.cssSelector("#email_create")).sendKeys("a@mail.com");
	  Thread.sleep(10000);
	  webdriver.findElement(By.cssSelector("#SubmitCreate")).click();
	  Thread.sleep(10000);
	  
	  
	  List<WebElement>  oRadioButton = webdriver.findElements(By.name("id_gender"));
	  int iSize = oRadioButton.size();
	  for(int i=0; i < iSize ; i++ ){
		  
			 // Store the checkbox name to the string variable, using 'Value' attribute
		 
			 String sValue = oRadioButton.get(i).getAttribute("value");
		 
			 // Select the checkbox it the value of the checkbox is same what you are looking for
		 
			 if (sValue.equalsIgnoreCase("1")){
		 
				 oRadioButton.get(i).click();
				 Thread.sleep(15000);
		 
				 // This will take the execution out of for loop
		 
				 break;
		 
				 }
		}
	  webdriver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Textfirstname");
	  Thread.sleep(5000);
	  webdriver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Textlastname");
	  Thread.sleep(5000);
	  webdriver.findElement(By.cssSelector("#passwd")).sendKeys("Textpassword");
	  Thread.sleep(5000);
	  
	  Select sc=new Select(webdriver.findElement(By.name("days")));
	  sc.selectByValue("4");
	  Thread.sleep(5000);
	  Select sc1=new Select(webdriver.findElement(By.name("months")));
	  sc1.selectByValue("3");
	  Thread.sleep(5000);
	  Select sc2=new Select(webdriver.findElement(By.name("years")));
	  sc2.selectByValue("2016");
	  Thread.sleep(5000);
	  /*
	  JavascriptExecutor jse = (JavascriptExecutor)webdriver;
	  jse.executeScript("window.scrollBy(0,250)", "");
	  */
	  //it will check the checkbox
	  
	  if ( !webdriver.findElement(By.id("uniform-newsletter")).isSelected() )
	  {
	       webdriver.findElement(By.id("uniform-newsletter")).click();
	       Thread.sleep(5000);
	  }
	  
	//this code used on checkbox is not checked by default we have to check
	  /*
	  WebElement wb1=webdriver.findElement(By.id("uniform-newsletter"));
		 boolean chk1;
		 chk1=wb1.isSelected();
		 if(chk1==true) {
			 
		 }
			 
		 else
		 {
			 wb1.click();
		 }
		 */
	  
	  //this code used on checkbox is checked by default we have to uncheck
	  
	 WebElement wb=webdriver.findElement(By.id("uniform-optin"));
	 boolean chk;
	 chk=wb.isSelected();
	 if(chk==true) {
		 wb.click();
		 Thread.sleep(15000);
	 }
	
	 else
	 {
		 
	 }
	 
	  webdriver.findElement(By.cssSelector("#firstname")).sendKeys(Helper.firsTName());
	  Thread.sleep(10000);
	  webdriver.findElement(By.cssSelector("#lastname")).sendKeys("Textlastname2");
	  Thread.sleep(10000);
	  webdriver.findElement(By.cssSelector("#company")).sendKeys("text company name");
	  Thread.sleep(10000);
	  webdriver.findElement(By.cssSelector("#address1")).sendKeys("text addresss1");
	  Thread.sleep(10000);
	  webdriver.findElement(By.cssSelector("#address2")).sendKeys("text addresss2");
	  Thread.sleep(10000);
	  webdriver.findElement(By.cssSelector("#city")).sendKeys("text city");
	  Thread.sleep(10000);
	  
	 /**
	  * This code take a random string from list of Dropdown
	  *  
	  */
	  WebElement wb9=webdriver.findElement(By.name("id_state"));
	  Select sc3=new Select(wb9);
	  List<WebElement> l= sc3.getOptions();
	  sc3.selectByIndex(Helper.getRandomStringIndex(l));
	  
	  webdriver.findElement(By.cssSelector("#postcode")).sendKeys(Helper.pinRandom());
	  
	  
	  Select sc4=new Select(webdriver.findElement(By.name("id_country")));
	  sc4.selectByValue("21");//by using value
	  //sc4.selectByIndex(arg0);//by using index
	  //sc4.selectByVisibleText(arg0);//by using visible text
	  webdriver.findElement(By.cssSelector("#phone_mobile")).sendKeys(Helper.mobileRandom());
	  Thread.sleep(15000);
	  webdriver.findElement(By.cssSelector("#alias")).clear();
	  webdriver.findElement(By.cssSelector("#alias")).sendKeys("alisaa name");
	  Thread.sleep(15000);

	  webdriver.findElement(By.cssSelector("#submitAccount")).click();
	  Thread.sleep(15000);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException  {
	  
	  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    webdriver=new ChromeDriver();
	    String url="http://automationpractice.com";
	    webdriver.get(url);
	    webdriver.manage().window().maximize();
	    Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {
	  //webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	  webdriver.quit();
  }

}
