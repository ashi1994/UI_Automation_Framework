package com.testng.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public abstract class Count_Fail_Pass implements ITestListener {
	
		static int passcount=0;
		static int failcount=0;
		@Override
		public void onTestSuccess(ITestResult result) {
		  passcount++;
		 }
		@Override
		public void onTestFailure(ITestResult result) {
		  failcount++;
		 }
		
		@Override
	    public void onFinish(ITestContext context) {
		Reporter.log("pass:" + passcount,true);
		Reporter.log("fail:" + failcount,true);
		}
	    
}
	


