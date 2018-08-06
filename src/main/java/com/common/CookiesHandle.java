package com.common;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookiesHandle {
	public WebDriver driver=null;
	
	// fetch gets all the cookies
	public Set<Cookie> getAllCookiesExample() {
	        return driver.manage().getCookies();
	}
	
	//fetchs a specified cookie
	public Cookie getCookieNamedExample(String name) {
	        return driver.manage().getCookieNamed(name);
	}
	
	// fetch the value of a specified cookie
	public String getValueOfCookieNamedExample(String name) {
	        return driver.manage().getCookieNamed(name).getValue();
	}
	
	// set or create a cookie
	public void addCookieExample(String name, String value, String domain, String path, Date expiry) {
	        driver.manage().addCookie(
	        new Cookie(name, value, domain, path, expiry));
	}
	
	//This method adds set of cookies for a domain
	public void addCookiesToBrowserExample(Set<Cookie> cookies, String domain) {
	        for (Cookie c : cookies) {
	            if (c != null) {
	                if (c.getDomain().contains(domain)){
	                    String name=null;
						String value=null;
						String path=null;
						Date expiry=null;
						driver.manage().addCookie(
	                    new Cookie(name, value, domain, path, expiry));
	                }
	            }
	        }
	        driver.navigate().refresh();
	}
	
	//This method deletes a specific cookie
	public void deleteCookieNamedExample(String name) {
	        driver.manage().deleteCookieNamed(name);
	        }
	
	//This method deletes all cookies
	public void deleteAllCookiesExample() {
	        driver.manage().deleteAllCookies();
	        }

}

//http://javaseleniumworld.com/cookies/
