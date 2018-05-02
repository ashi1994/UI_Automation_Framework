package com.testng.listner;

import org.testng.annotations.Test;

import org.testng.IRetryAnalyzer;
 
import org.testng.ITestResult;
 
// implement IRetryAnalyzer interface
 
public class RetryFailedTestCaseListner implements IRetryAnalyzer{
	
	// set counter to 0
 
       int minretryCount=0;
 
 
 
    // set maxcounter value this will execute our test 3 times             
 
      int maxretryCount=1;
 
 
 
    // override retry Method
 
       public boolean retry(ITestResult result) {
 
 
 
            // this will run until max count completes if test pass within this frame it will come out of for loop
 
              if(minretryCount<=maxretryCount)
 
              {
 
                   // print the test name for log purpose   
 
                     System.out.println("Following test is failing===="+result.getName());
 
 
 
                   // print the counter value    
 
                     System.out.println("Retrying the test Count is=== "+ (minretryCount+1));
 
 
 
                   // increment counter each time by 1  
 
                     minretryCount++;
 
                     return true;
 
              }
 
              return false;
 
       }
 
 
 
}
