package com.framework.datadriven;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassFromtestng_xmlFile {

	@Test(priority=0)
    @Parameters({ "browser" })
	public void testCaseOne(String browser) {
		System.out.println("browser passed as :- " + browser);
	}
		
	
	@Test(priority=1)
	@Parameters({ "username", "password" })
	public void testCaseTwo(String username, String password) {
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + password);
	}
}
