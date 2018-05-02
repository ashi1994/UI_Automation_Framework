package com.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementCommand {
	@Test
	public void browser(){
    WebDriver driver=new ChromeDriver();
    driver.findElement(By.xpath("//div[@name='email']"));
    driver.findElement(By.cssSelector("#value"));
    driver.findElement(By.name("ashiwani"));
    driver.findElement(By.tagName("a"));
    driver.findElement(By.id("2"));
    driver.findElement(By.partialLinkText("textlink"));
    driver.findElement(By.linkText("href"));
    driver.findElement(By.className("classname"));

}
}