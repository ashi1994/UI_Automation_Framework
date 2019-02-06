package com.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ZoomBrower {
    @Test
    public void googleSearchTest() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedrivermac");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println("zooming");
        // To zoom in 3 times
        for(int i=0; i<5; i++){
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        }
        // To zoom out 3 times
        for(int i=0; i<3; i++){
            driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
        }
        //To set the browser to default zoom level ie., 100%
        driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
    }



    @Test
    public void googleSearchTest1() throws AWTException, InterruptedException{

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/"+"src/test/driver/chromedrivermac");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println("zooming");

        Robot robot = new Robot();
        System.out.println("About to zoom in");
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        Thread.sleep(5000);
        System.out.println("About to zoom out");
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
    }
}
