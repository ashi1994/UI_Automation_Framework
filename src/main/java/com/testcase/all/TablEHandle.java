package com.testcase.all;

import org.testng.annotations.Test;

import com.common.Helper;

import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TablEHandle {
	public static WebDriver driver;
  @Test
  public void f() {
	  
	//To locate table
	  WebElement wb=driver.findElement(By.xpath("//table[@id='customers']/tbody"));
	  
	 	  
	// To locate rows of table
	  List<WebElement> rows=wb.findElements(By.tagName("tr"));
	 // List<WebElement> rows=wb.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
	  
	//To calculate no of rows In table.
	  int rows_count = rows.size(); 
	  System.out.println("Number of Rows "+rows.size());
	  
//	  for(int j=0;j<rows_count;j++)
//		  System.out.print(rows.get(j).getText()+" ");
//	  
	  //To calculate no. of columns in table
	  List<WebElement> columns=wb.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	  System.out.println("Numnber of columns "+columns.size());
	  
	  
//	  List<WebElement> columnMax=wb.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
//	  for(WebElement w1:columnMax){
//		  List<Integer> li=new ArrayList<>();
//		  li.add(Integer.parseInt(w1.getText()));
//		System.out.println(Collections.max(li));
//	  }
	  
	  //To Print Columns values
	  for(int i=0;i<columns.size();i++){
		  System.out.println(columns.get(i).getText());
	  }
  
	//Loop will execute till the last row of table.
	  for (int row=0; row<rows_count; row++){
		//To locate columns(cells) of that specific row.
		   List<WebElement> Columns_row = rows.get(row).findElements(By.tagName("td"));
		   
		 //To calculate no of columns(cells) In that specific row.
		   int columns_count = Columns_row.size();
		   System.out.println("Number of cells In Row "+row+" are "+columns_count);
		   
		   //Loop will execute till the last cell of that specific row.
		   for (int column=0; column<columns_count; column++){
		    //To retrieve text from that specific cell.
		    String celtext = Columns_row.get(column).getText();
		    
		    System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celtext);
		    
	  }
		   System.out.println("--------------------------------------------------");
	  }
	  
	  System.out.println(Helper.getColValue(3, 2, driver));
	  Helper.getHeadersValue(driver);
  }	  
  @BeforeMethod
  public void beforeMethod() {
	  String exePath = "C:\\workspace\\msqaautomationjars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath);
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    String url="https://www.w3schools.com/html/html_tables.asp";
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
  

}


//http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/
