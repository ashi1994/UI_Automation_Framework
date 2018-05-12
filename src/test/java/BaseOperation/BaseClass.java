/*
 * Base class in the main class which will take care of Browser setup,
 * loading configuration file and other reusable methods like screenshot,
 * handling sync issues and many more.
 * Reuse code,Save time and efforts.
 */

package BaseOperation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseClass {
	public WebDriver driver;
	public static WebElement element=null;
	public static Actions action=null;
	public static ExtentReports reports=null;
	ExtentTest logger=null;

  @BeforeClass
  public void applicationStart() {
	  Reporter.log("=====Browser Session Started=====", true);
	    
	    try {
	    	//FileReader reader=new FileReader(); We can use both FileReader and FileInputStream for both loading the file
	    	FileInputStream reader=new FileInputStream(System.getProperty("user.dir")+"/"+"src/test/resources/app.properties");
	 	    Properties pr=new Properties(); 
			pr.load(reader);
			String Path=System.getProperty("user.dir")+pr.getProperty("path");  
		    String Url=pr.getProperty("url").trim();
		    String DriverName=pr.getProperty("driver").trim();
		    int wait=Integer.parseInt(pr.getProperty("implicitwait"));
		    //System.setProperty(DriverName,Path);
		    if((DriverName).equals("chrome")){
		    	System.setProperty("webdriver.chrome.driver",Path);
//		    	ChromeOptions options = new ChromeOptions();
//		    	options.addArguments("incognito");
//		    	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		    	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		    	driver=new ChromeDriver(capabilities);
			   driver = new ChromeDriver();
			   driver.manage().window().maximize();
			  // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);handle the page loading if you are not sure how much time that page takes to load?
			   driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
			   driver.get(Url);}
		    else if((DriverName).equals("mozila")){
		    	System.setProperty("webdriver.gecko.driver",Path);
		       driver = new FirefoxDriver();
		       driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
			   driver.get(Url);}
		    else if((DriverName).equals("ie")){
		    	System.setProperty("webdriver.ie.driver",Path);
			   driver = new InternetExplorerDriver();
		       driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
		       driver.get(Url);}
	        else if((DriverName).equals("htmlunit")){
	    	driver=new HtmlUnitDriver();
	    	driver.get(Url);}
		    System.out.println("Website title is: "+driver.getTitle());
		    
	    }
	  
	      catch (IOException e) {
			// TODO Auto-generated catch-block stub.
			e.printStackTrace();
		}  
	 
	

Reporter.log("=====Application Started======================", true);
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  driver=null;
	  Reporter.log("=====Browser Session End Successfully=====", true);
  }
  
//  @AfterMethod
//  public void takeShreeshot(ITestResult result){
//	 if(ITestResult.FAILURE==result.getStatus()){
//			try{
//				// To create reference of TakesScreenshot
//				TakesScreenshot screenshot=(TakesScreenshot)driver;
//				// Call method to capture screenshot
//				File src=screenshot.getScreenshotAs(OutputType.FILE);
//				// Copy files to specific location 
//				// result.getName() will return name of test case so that screenshot name will be same as test case name
//				FileUtils.copyFile(src, new File("C://workspace//" +result.getName()+".png"));
//				System.out.println("Successfully captured a screenshot");
//			}
//			catch (Exception e){
//				System.out.println("Exception while taking screenshot "+e.getMessage());
//			}
//  }
//	 
//	 
//  }
  
  @AfterMethod
  public void writeResult(ITestResult result)
  {
      try
      {
          if(result.getStatus() == ITestResult.SUCCESS)
          {

              Reporter.log("Test case executed successfully",true);
          }
          else if(result.getStatus() == ITestResult.FAILURE)
        	  
          {
        	  Reporter.log("Test Case Fail,name is "+result.getName() ,true);
        		try{
    				// To create reference of TakesScreenshot
    				TakesScreenshot screenshot=(TakesScreenshot)driver;
    				// Call method to capture screenshot
    				File src=screenshot.getScreenshotAs(OutputType.FILE);
    				// Copy files to specific location 
    				// result.getName() will return name of test case so that screenshot name will be same as test case name
    				//File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    				FileUtils.copyFile(src, new File("C://workspace//Screenshots//" +result.getName()+".png"));
    				System.out.println("Successfully captured a screenshot and Save in C:\\workspace\\Screenshots and name is "+result.getName()+".png");
    			}
    			catch (Exception e){
    				System.out.println("Exception while taking screenshot "+e.getMessage());
    			}

          }
          else if(result.getStatus() == ITestResult.SKIP)
          {
              System.out.println("Log Message::@AfterMethod: Method-"+result.getName()+"- has Skipped");

          }
      }
      catch(Exception e)
      {
          System.out.println("\nLog Message::@AfterMethod: Exception caught");
          e.printStackTrace();
      }

  }
  @BeforeSuite
  public void setUpExtentReport(){
	  reports=new ExtentReports(System.getProperty("user.dir")+System.currentTimeMillis()+".html",true);
	  reports.loadConfig(new File(System.getProperty("user.dir")+"/"+"src/test/resources/extent-config.xml"));
  }
  @AfterSuite
  public void closeExtentReport(){
	  reports.endTest(logger);
	  reports.flush();
	  reports.close();
  }

  
  
}