package com.testcase.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 *Can we Handle https domain in Selenium?
 *
 * @author aranjan.
 *         Created Mar 23, 2018.
 */
public class HandelHttpsDomain {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		String url="htts:\\www.google.co.in";
		FirefoxProfile fr=new FirefoxProfile();
		fr.setAcceptUntrustedCertificates(false);
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		

	}

}
