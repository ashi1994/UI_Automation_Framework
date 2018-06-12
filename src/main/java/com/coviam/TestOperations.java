package com.coviam;

import static org.testng.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.common.Helper;

/**
 * TODO Put here a description of what this class does.
 *
 * @author ssamaji.
 *         Created Jun 5, 2018.
 */
public class TestOperations {
	WebDriver driver=null;
	
	public TestOperations(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickTab(String tabname){
		WebElement tab=driver.findElement(By.xpath("//a[contains(text(),'%s')]".replaceAll("%s",tabname)));
		waitTillElementIsVisible(tab);
		tab.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void waitTillElementIsVisible(WebElement element){
		  new WebDriverWait(driver,1500)
		  .until(ExpectedConditions.visibilityOf(element));
	 }
	
	 public static boolean returnResults(List<Boolean> results) {
			return results.contains(false) ? false : true;
	}
	
	
	public boolean verifyNavigation(){
		List<Boolean> results=new LinkedList();
		int count=Constants.tabList.size();
		for(int i=1;i<count;i++){
			String tabName=Constants.tabList.get(i);
			String expectedTitle=Constants.title.get(i);
			clickTab(tabName);
			String actualTitle=driver.getTitle().trim();
			if(actualTitle.equals(expectedTitle))
				results.add(true);
			else
				assertTrue(false);
		}
		System.out.println("Result "+results);
		return returnResults(results);
	}
	
	public void verifyCarrerSearch(){
////		  Actions act=new Actions(driver);
////		  act.sendKeys(Keys.CONTROL).sendKeys("1");
//		String mainwindow=driver.getWindowHandle();
//		Set<String> set=driver.getWindowHandles();//We now need to get all the window handles.
//		  System.out.println("Number of windows opened" +set.size());
//		  for(String childwindow:set){
//			  //// Here we will compare if parent window is not equal to child window then we will close
//			  if(!childwindow.equals(mainwindow)){
//				  driver.switchTo().window(childwindow);
//				  System.out.println(driver.switchTo().window(childwindow).getTitle());
//				   driver.close();
//				  }
//			  }
//		// once all pop up closed now switch to parent window
//	  driver.switchTo().window(mainwindow);
		  
		  
		  Helper.sleep(4000);
		  WebElement element1=driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
		  element1.click();
		  
		element1.findElement(By.xpath("//a[@href='http://talent.coviam.com/']")).click();
////		  Actions act=new Actions(driver);
////		  act.sendKeys(Keys.CONTROL).sendKeys("2");
		String mainwindow=driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
			if(!winHandle.contains(mainwindow))
          driver.switchTo().window(winHandle);
      }
	
		WebElement el=driver.findElement(By.id("search_location"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", el);
		el.sendKeys("Bangalore");
		el.sendKeys(Keys.ENTER);
		
		
	}

}
