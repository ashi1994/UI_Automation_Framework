package com.commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

public class FindElementCommand {
	@Test
	public void browser(){
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//in last case it will wait for all (ex. if id wrong it will wait for 5 then other..
    driver.findElement(By.xpath("//div[@name='email']"));
    driver.findElement(By.cssSelector("#value"));
    driver.findElement(By.name("ashiwani"));
    driver.findElement(By.tagName("a"));
    driver.findElement(By.id("2"));
    driver.findElement(By.partialLinkText("textlink"));
    driver.findElement(By.linkText("href"));
    driver.findElement(By.className("classname"));
    driver.findElement(new ByAll(By.id("id"),By.className("className"),By.tagName("tagname")));//it will take any working locter whatevr working
    

}
}