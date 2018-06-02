package com.common;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.constants.*;
import com.testcase.all.*;



public class Helper extends BaseClass {
	static WebDriver driver=null;
	WebElement element=null;
	static Actions action=null;
	static JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public static int getRandomStringIndex(List<WebElement> list) {
		List<Object> texts = list.stream().map(WebElement::getText).collect(Collectors.toList());
		Random rand = new Random();
		int randomIndex = rand.nextInt(texts.size());
		return randomIndex;
		
	}
	
	/**
	 * Perform mouse over and click
	 * @param element
	 */
	public static void mouseOverClick(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	/**
	 * Click using javascript
	 * @param element
	 */
	  public static void clickByJavascript(WebElement element){
	    	if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");
	    	      js.executeScript("arguments[0].click();", element);}
	    	else
	    	     System.out.println("Unable to click element");
	    	}
	
	/**
	 * Perform mouse over and see link color is changing or not
	 * @param element
	 */
	public static void mouseOver(WebElement element) {
	    action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
	public static String getRandomStringvalue(List<WebElement> list) {
		List<String> texts = list.stream().map(WebElement::getText).collect(Collectors.toList());
		Random rand = new Random();
		int randomIndex = rand.nextInt(texts.size());
		return texts.get(randomIndex);
		
	}
	
	public static String firsTName() {
		return Contants.First_name;
	
	}
	
	public static String pinRandom() {
		Random rnd = new Random();
		int n = 10000 + rnd.nextInt(90000);
		String pin=Integer.toString(n);
		return pin;
	}
	
	public static String mobileRandom() {
		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		String mobile=Long.toString(number);
		return mobile;
	}
	/**
	 * 
	 * TODO  It will return column values in the Excel sheet
	 *
	 * @param filePath
	 * @param sheetname 
	 * @param rownumer
	 * @return
	 * @throws IOException
	 */
	
	public static String[] getAllcolumnValues(String filePath,String name,int rownum) throws IOException  {
		
  	
			//Read a file and specify thew path of file
			File f=new File(filePath);	
			
			// load file
			FileInputStream fis=new FileInputStream(f);
			
			// Load workbook
		     XSSFWorkbook wb=new XSSFWorkbook(fis);
		     
		     // Load sheet- Here we are loading first sheetonlyl
		    XSSFSheet sh1= wb.getSheet(name);
		    //XSSFSheet sh1=wb.getSheetAt(index);
		    
		    int noOfRows=sh1.getPhysicalNumberOfRows();//it return number of rows present
		    //System.out.println(noOfRows);
		    int noOfColumns = sh1.getRow(0).getPhysicalNumberOfCells();//it will return number of column present
		    //System.out.println(noOfColumns);
		    List<String> li=new ArrayList<>();
		   
		    for(int i=0;i<noOfColumns;i++) {
		    	li.add(sh1.getRow(rownum).getCell(i).getStringCellValue());
		    	
		    }
		    String[] array = li.toArray(new String[li.size()]);
		    return array;
		    
      
	}
	
	/**
	 * This function return all the values in Excel Sheet
	 * 
	 *  and Excel should not have any blank value
	 * 
	 */
	

	
	public static List<String> getAllValues(String filePath,String name) throws IOException  {
		
	  	
		//Read a file and specify thew path of file
		File f=new File(filePath);
		
		// load file
		FileInputStream fis=new FileInputStream(f);
		
		// Load workbook
	     XSSFWorkbook wb=new XSSFWorkbook(fis);
	     
	     // Load sheet- Here we are loading first sheet only
	    XSSFSheet sh1= wb.getSheet(name);
	    
	    int noOfRows=sh1.getPhysicalNumberOfRows();//it return number of rows present
	    //System.out.println(noOfRows);
	    int noOfColumns = sh1.getRow(0).getPhysicalNumberOfCells();//it will return number of column present
	    //System.out.println(noOfColumns);
	    List<String> li=new ArrayList<>();
	    
	    for(int j=0;j<noOfRows;j++) {
		    for(int i=0;i<noOfColumns;i++) {
		    	li.add(sh1.getRow(j).getCell(i).getStringCellValue());
		    }
		    }
	    return li;
  
}
	
	/**
	 * This function create a column in Excel Sheet
	 * 
	 *  
	 * 
	 */
	
	 public static void wroteColumnValue(String filePath,String arr[]) throws IOException {
		   //Read a file and specify then path of file
			File f=new File(filePath);
			
			// load file
			FileInputStream fis=new FileInputStream(f);
			
			// Load workbook
		     XSSFWorkbook wb=new XSSFWorkbook(fis);
		     
		     // Load sheet- Here we are loading first sheet only
			    XSSFSheet sh1= wb.getSheetAt(0);
			    Row row = sh1.createRow(0); 
			   
			    int len=arr.length;
			   
				for(int i=0;i<len;i++) {
			     Cell name = row.createCell(i);
			     name.setCellValue(arr[i]);
				}
			  
			    
			 // here we need to specify where you want to save file
			    
			    FileOutputStream fout=new FileOutputStream(new File("C://workspace//text.xlsx"));
			    
			 // finally write content 
			    
			    wb.write(fout);
			    
			   // close the file
			    
			    fout.close();
	 }
	 
		
	
	/**
	 * This code take screenshot 
	 * @param webdriver
	 * @param fileWithPath
	 * @throws Exception
	 */
	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }
	 
	 public static String screenShotName() {
		 Random rnd = new Random();
		 String s1="C://Users//aranjan//workspace//Photo"+"_"+rnd.nextInt(100);
		 return s1.concat(".png");
	 }
	 /***
	  * This fumction return a random string
	  * @return
	  */
	 
	 public static String randomString() {
		 String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXY";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 6) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String saltStr = salt.toString();
	        return saltStr;
	 }
	 
	 public static void uploadFileByRobot(String filepath) {
		  try {
	        	//Setting clipboard with file location
			   StringSelection stringSelection = new StringSelection(filepath);
			   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	            //native key strokes for CTRL, V and ENTER keys
	            Robot robot = new Robot();
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	            robot.delay(5000);
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (Exception exp) {
	        	exp.printStackTrace();
	        }
		 
	 }
	 
		public static void open_Browser(String browserName) {
			try {
				if (browserName.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.gecko.driver",
							"C:\\workspace\\msqaautomationjars\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					
					
				} 
				else if (browserName.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\workspace\\msqaautomationjars\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					
				} 
				else if (browserName.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver",
							"C:\\workspace\\msqaautomationjars\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				}
			} catch (WebDriverException e) {
				System.out.println(e.getMessage());
			}
			
			
		}

	public static void close_browser() {
		driver.quit();
	}
	 
	public static void dragAndDrop(WebElement source,WebElement dest) {
		action=new Actions(driver);
		action.dragAndDrop(source,dest).perform();
//		Actions builder = new Actions(driver);
//		builder.clickAndHold(source);
//		builder.dragAndDrop(source,dest).build().perform();
//		Action dragAndDrop = builder.clickAndHold(source).moveToElement(dest).release(dest).build();
//		dragAndDrop.perform();
		
	}
	public static String getUniquename() {
		return "name"+System.currentTimeMillis();
		
	}
	/**
	 * This method is for Refresh the page
	 */
	
	public static void refreshPage() {
		driver.navigate().refresh();
		//driver.getCurrentUrl();
		//driver.navigate().to(driver.getCurrentUrl());
		//driver.get(driver.getCurrentUrl());
		//js.executeScript("history.go(0)");//Using javascrpit executer
	
	}
	/*
	 * How can you send text input to a focused element?
	 */
	
	public static void sendKeyOnactiveElement(String txt){
		new Actions(driver).sendKeys(txt).perform();
		//driver.switchTo().activeElement().sendKeys(txt);

		
	}
	/**
	 * This function use to send the text without using sendkeys() method
	 * @param element
	 * @param val
	 */
	
	public static void sendValueWithoutsend_key(WebElement element,String val) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('Email').value='val'");
		//document.getElementsByClassName()	Returns a NodeList containing all elements with the specified class name
		//document.getElementsByName()	Returns a NodeList containing all elements with a specified name
		//document.getElementsByTagName()
	}
	/*
	 * How would you make sure that a page is loaded using Selenium and Webdriver.
	 * selenium.waitForPageToLoad("5000");
	 * 
	 *  WebDriverWait check = new WebDriverWait(driver, 100);
     *  check.until(ExpectedConditions.anyElement(By.id(id)));
	 * 
	 */
	
	
	public static void selectAnyIndex(WebElement element){
		Select sc=new Select(element);
		sc.selectByIndex(1);
		
	}
	
	public static void sleep(long millisecond){
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch-block stub.
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 *This method validate whether the downloaded file is exist/correct or not
	 *
	 * @param downloadPath
	 * @param fileName
	 * @return boolean
	 */
	
	public static boolean fileDownloaded_Verify(String downloadPath, String fileName) {
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	  	    
	    for (int i = 0; i < dir_contents.length; i++) {
	        if (dir_contents[i].getName().equals(fileName))
	            return flag=true;
	            }

	    return flag;
	}
	/**
	 * 
	 * This method verify the extension of file that downloaded.
	 *
	 * @param dirPath
	 * @param ext
	 * @return boolean
	 */
	
	public static boolean fileDownloaded_ExtensionVerify(String dirPath, String ext){
		boolean flag=false;
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        flag = false;
	    }
	    
	    for (int i = 1; i < files.length; i++) {
	    	if(files[i].getName().contains(ext)) {
	    		flag=true;
	    	}
	    }
	    return flag;
	}
	
	/**
	 * Method to get random value from the String List.
	 * 
	 * @param values
	 *            -> List[String]
	 * @return -> Random string value from the String List.
	 */
	public static String getRandomValueFromList(List<String> values) {
		Collections.shuffle(values);
		return values.get(0);
	}
	
	/**
	 * Method to get random value from the String Array.
	 * 
	 * @param values
	 *            -> String[] values
	 * @return -> Random string value from the String Array.
	 */
	public static String getRandomValueFromArray(String[] values) {
		return getRandomValueFromList(Arrays.asList(values));
	}
	
	/**
	 * Method to switch back to default content.
	 */
	public static void switchBackToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	/**
	 * Method to switch to different tabs.
	 */

	public static void switchToDifferentTab(int index){
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(index-1));
	}
	/**
	 * 
	 * TODO This function will determine that whether Webpage is completely loaded or not.
	 * 
	 * @return boolean
	 */
	
	public static boolean verifyWebpageisLoaded(){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	boolean flag=false;
	if(js.executeScript("return document.readyState").toString().equals("complete"))
	   return true;
	else
	   return flag;
	}
	
	/**
	 * TODO Wait For Page Load In Selenium (Java script to find the page load completely)
	 * 
	 * @param driver
	 */
	
//	public static void waitForPageToLoad(WebDriver driver) {
//		 new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
//		 System.out.println("Page Loaded Completely");
//		 }
	
	public static void waitForPageToLoad(long timeOutInSeconds) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		try {
			System.out.println("Waiting for page to load...");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(expectation);
		} catch (Throwable error) {
			System.out.println("Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
			Assert.assertFalse(true, "Timeout waiting for Page Load Request to complete.");

		}
	}
	
	/**
	 * 
	 * TODO This test case will verify whether the given webelement image is broken or not on base on its natural width
	 *
	 * @param image
	 */
	public static void isImageBroken(WebElement image){
	      if (image.getAttribute("naturalWidth").equals("0"))
	      {
	          System.out.println(image.getAttribute("outerHTML") + " is broken.");
	      }
	}
	/**
	 * 
	 * TODO This test case will verify whether the given webelement image is broken or not on base on its natural width
	 * return true or false
	 * @param image
	 */
	public static boolean isImageBrokend(WebElement image){
	    return !((image.getAttribute("naturalWidth").equals("0")));
	 }
	
	
	/**
	 * get the random number with in a range as specified by the values of min
	 * and max
	 * 
	 * @param max
	 * @param min
	 * @return Random integer
	 */
	// Min + (int)(Math.random() * ((Max - Min) + 1)) random number in range
	public static int getRandNumberInRange(int max, int min) {
		 Random num = new Random();
		 int randomNum = min+num.nextInt((max-min)+1);
		//int randomNum = min + (int) (Math.random() * ((max - min) + 1));
		return randomNum;
	}
	
	/**
	 * Method to skip TestCase
	 * 
	 * @param skipMessage
	 *            -> Skip Message.
	 */
	public static void skipTestCase(String skipMessage) {
		throw new SkipException(skipMessage);
	}
	/**
	 * Vertical(Y-axis) scroll - down by 150  pixels
	 * for scrolling till the bottom of the page we can use the code like
	 */
	 public static void scrollByJavaScript(){
	    	//Vertical(Y-axis) scroll - down by 150  pixels
	    	  js.executeScript("window.scrollBy(0,150)");
	    	// for scrolling till the bottom of the page we can use the code like
	    	 // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");  
	    }
	/**
	 * Method to check the presence of Alert (isAlertPresent) using WebDriver
	 
	 */
	
	public static boolean isAlertPresent() {
		 
		  boolean presentFlag = false;
		 
		  try {
		 
		   // Check the presence of alert
		   Alert alert = driver.switchTo().alert();
		   // Alert present; set the flag
		   presentFlag = true;
		   // if present consume the alert
		   alert.accept();
		 
		  } catch (NoAlertPresentException ex) {
		   // Alert not present
		   ex.printStackTrace();
		  }
		 
		  return presentFlag;
		 
		 }
	/*
	 * There is a scenario whenever “Assert.assertEquals()” 
	 * function fails automatically it has to take screenshot. How can you achieve this ?
	 */
	   public void takescreenShotWhenFunctionFailed(WebDriver driver){
	      EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
          File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
          try {
			FileUtils.copyFile(srcFile, new File("c://workspace"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          }
	   
	   /**
	    * Description: RETRIEVING CELL VALUE OF SPECIFIC COLUMN OF SPECIFIC ROW
	    * @param row
	    * @param col
	    * @param driver
	    * @return String Cell value
	    */
	   
	   public static String getColValue(int row, int col, WebDriver driver)
	   {
	      WebElement colValue= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+row+"]/td["+col+"]"));
	      return colValue.getText();
	   }		
	   
	   /**
	    * Description: RETRIEVING Header VALUE OF Table
	    * @param driver
	    * @return Headers value
	    */
	   
	   public static void getHeadersValue(WebDriver driver)
	   {
	      List<WebElement> headers= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
	      for(WebElement wb:headers)
	    	  System.out.println(wb.getText());
	   }

	/**
	 * Description: It will click on element when it is visible
	 * 
	 */

		public void clickWhenReady(By locator, int timeout) {
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
		}
		
	
}	
	

