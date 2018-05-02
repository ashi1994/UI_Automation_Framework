package com.testcase.all;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class SkipTestCase {
	
	@Test(enabled=false,description="This is first technique to skip the test")
	public void show() {
		System.out.println("i am skipped");
		Reporter.log("i am skipped");
	}
	
	@Test(description="This is second technique to skip the test")
	public void testCaseSkipException(){
			System.out.println("Im in skip exception");
			throw new SkipException("Skipping this exception");
	}

}


//We can use  “exclude” parameter in testng.xml for skip the test-case
//enabled=false
//throw new SkipExceptiom("Skipped"s)