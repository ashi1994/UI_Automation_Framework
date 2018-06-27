package com.testcase.all;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testng.listner.RetryFailedTestCaseListner;

public class Fail_Pass_Test_Case {
	
  @Test(description="This test case will pass")
	  public void test1(){
			System.out.println("Test 1 pass");
			Assert.assertTrue(true);
       }
  @Test(description="This test case will fail")
      public void test2(){
		System.out.println("Test 2 fail");
		Assert.assertTrue(false);
      }
}
//  //By Implementing TestNG IRetryAnalyzer listner.
//  @Test(retryAnalyzer=RetryFailedTestCaseListner.class)
//	  public void failtest(){
//			System.out.println("Test 2 fail");
//			Assert.assertEquals("You are done","You done","Not matching");
//  }
//  }


/*                           HOW TO EXECUTE FAILED TEST CASE
 * Case 1: Execute failed test cases using TestNG in Selenium – By using “testng-failed.xml”
   After the first run of an automated test run. Right click on Project – Click on Refresh
   A folder will be generated named “test-output” folder. Inside “test-output” folder, you could find “testng-failed.xml”
   Run “testng-failed.xml” to execute the failed test cases again.
 
   Case 2: Execute failed test cases using TestNG in Selenium – By Implementing TestNG IRetryAnalyzer listner.
 * 
 */
