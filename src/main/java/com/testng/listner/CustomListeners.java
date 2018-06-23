package com.testng.listner;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.common.ExcelUtils;
 
public class CustomListeners implements ITestListener,ISuiteListener{
 
	static int passcount=0;
	static int failcount=0;
	// This belongs to ISuiteListener and will execute, once the Suite is finished
	public void onFinish(ISuite arg0) {
		System.out.println("Ending Test Suite "+arg0.getName());		
	}
 
	// This belongs to ISuiteListener and will execute before the Suite start
	public void onStart(ISuite arg0) {
		System.out.println("Starting Test Suite "+arg0.getName());		
	}
 
	// This belongs to ITestListener and will execute after starting of Test set/batch
	public void onFinish(ITestContext arg0) {
		System.out.println("Finish Test execution "+arg0.getName());	
		Reporter.log("pass:" + passcount,true);
		Reporter.log("fail:" + failcount,true);
		
	}
 
	// This belongs to ITestListener and will execute before starting of Test set/batch
	public void onStart(ITestContext arg0) {
		System.out.println("Starts Test execution "+arg0.getName());		
	}
 
	//Not so important..ignore this as of now
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub		
	}
 
 
	// This belongs to ITestListener and will execute when a test is skipped
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Skipped test "+arg0.getName());	
		
	}
 
	// This belongs to ITestListener and will execute before the main test start i.e. @Test
	public void onTestStart(ITestResult arg0) {
		System.out.println("Starts Main Test execution "+arg0.getName());
		
	}
 
	// This belongs to ITestListener and will execute when a test is passed
	public void onTestSuccess(ITestResult arg0) {
		
		
	}
 
	// This belongs to ITestListener and will execute when a test is failed
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Failed test "+arg0.getName());
		failcount++;
		
	}
 
}
