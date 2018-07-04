package com.testcase.all;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.common.Helper;

 
public class BrokenLinks {
 public static void main(String[] args) throws InterruptedException {
 //Instantiating ChromeDriver
 	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedriver.exe");
 WebDriver driver = new ChromeDriver();

 driver.manage().window().maximize();

 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 driver.get("https://www.softwaretestingmaterial.com");

 Thread.sleep(5000);
 //Used tagName method to collect the list of items with tagName "a"
 //findElements - to find all the elements with in the current page. It returns a list of all webelements or an empty list if nothing matches
 List<WebElement> links = driver.findElements(By.tagName("a")); 
 //To print the total number of links
 System.out.println("Total links are "+links.size()); 

 for(int i=0; i<links.size(); i++) {
 WebElement element = links.get(i);
 //By using "href" attribute, we could get the url of the requried link
 String url=element.getAttribute("href");
 Helper.verifyBrokenLink(url);
//System.out.println(Helper.getResponseCode(url));
 }
 }
}

/*
 * Above code fetches all the links of a given website (i.e., SoftwareTestingMaterial.com) using WebDriver
 * commands and reads the status of each href link with the help of HttpURLConnection class.
 * 200 – Valid Link
 * 404 – Link not found
 * 403 - Forbidden
 * 400 – Bad request
 * 401 – Unauthorized
 * 500 – Internal Error
 */

