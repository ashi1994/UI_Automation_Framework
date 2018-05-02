package com.testng.feature;

import org.testng.annotations.Test;

public class TestGroupDemo {
	  @Test(groups={"Smoke"})
	    public void login(){
	        
	        System.out.println("Login done");
	        System.out.println("Smoke Scenario passed");
	    }
	    
	    @Test(groups={"Regression"})
	    public void register(){
	        System.out.println("Registration done");
	    }
}



/*
 * If we want to run 10 test cases from 100test case 
 * We can go for grouping of the test cases
 * Once group is done include and exclude test group as per need
*/
//testnggroup.xml