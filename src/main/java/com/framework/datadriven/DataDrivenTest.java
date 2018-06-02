package com.framework.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest {

		 WebDriver driver=null;
		 XSSFWorkbook workbook;
		 XSSFSheet sheet;
		 XSSFCell cell;
		 
		 @BeforeMethod
		 public void initilization(){
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 }
		 
		 @Test
		 public void fbLoginLogout() throws IOException{
		  //import excel sheet
		  File src=new File(System.getProperty("user.dir")+"src\\test\\resources\\facebookLoginTestData.xlsx");
		  // Load the file
		  FileInputStream fis=new FileInputStream(src);
		  //Load the workbook
		  workbook=new XSSFWorkbook(fis);
		  //Load the sheet in which data is having
		  sheet=workbook.getSheetAt(0);
		  
		  for(int i=1;i<=sheet.getLastRowNum();i++){
		   //import data for gmail
		   cell=sheet.getRow(i).getCell(0);
		   cell.setCellType(Cell.CELL_TYPE_STRING);
		   driver.findElement(By.cssSelector("#email")).clear();
		   driver.findElement(By.cssSelector("#email")).sendKeys(cell.getStringCellValue());
		   
		   //import data for password;
		   cell=sheet.getRow(i).getCell(1);
		   cell.setCellType(Cell.CELL_TYPE_STRING);
		   driver.findElement(By.cssSelector("#pass")).clear();
		   driver.findElement(By.cssSelector("#pass")).sendKeys(cell.getStringCellValue());
		   //to Click on login button
		   driver.findElement(By.cssSelector("#u_0_2")).click();
		   
		   //To write data in excel sheet
		   FileOutputStream fos=new FileOutputStream(src);
		   //Message to be written in excel
		   String message="Pass";
		   //Create cell where data need to be entered;
		   sheet.getRow(i).createCell(2).setCellValue(message);
		   //write the content
		   workbook.write(fos);
		   driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
		   driver.findElement(By.xpath("//text()[.='Log Out']/ancestor::span[1]")).click();
		   fos.close();
		  }
}
}