package com.commands;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandle {
	
	WebDriver driver=new ChromeDriver();
	public void cookiesHandle(){
		//To return all the cookies of the current domain
		Set<Cookie> cookiesForCurrentURL = driver.manage().getCookies();
		for (Cookie cookie : cookiesForCurrentURL)
		    System.out.println(" Cookie Name - " + cookie.getName() + " Cookie Value - "  + cookie.getValue());
		
		//Add Cookies in Selenium--
		Cookie cookie = new Cookie("cookieName", "cookieValue");
		driver.manage().addCookie(cookie);
		

		//Delete a particular Cookie by name
		driver.manage().deleteCookieNamed("cookieName");

		//Delete a particular Cookie
		driver.manage().deleteCookie(cookie);

		//Delete all the Cookies
		driver.manage().deleteAllCookies();
		
		
	}

}
