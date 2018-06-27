/**
 * Asserts helps us to verify the conditions of the test and decide whether test has failed or passed.
 *  A test is considered successful ONLY if it is completed without throwing any exception.
 */
package com.testcase.all;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.commands.WebelementCommand;

public class AssertionExample {
	String actual="google";
	String expected="Google";
	boolean flag=false;
  @Test
  public void f() {
	  //Assert.assertEquals(actual, expected);//it fail the test case with error "java.lang.AssertionError: expected [Google] but found [google]"
	  //Assert.assertEquals(actual, expected,"Match not found");//it will fail the test case with error "Match not found expected [Google] but found [google]"
	  //Assert.assertNotEquals(actual, expected);
	  //Assert.assertTrue(flag);//it will throw the exception when it found false condition-"expected [true] but found [false]"
	 Assert.assertFalse(flag);//it will throw the exception when it found true condition-"expected [false] but found [true]"
	 
	 
	 
	  /*  WebElement GmailUsername = driver.findElement(By.xpath("//*[@id='Emai"));  //wrong Xpath
	      Assert.assertTrue(GmailUsername.isDisplayed());
           System.out.println("It will not reach this statement");
	  */
  }
	 @Test
	 public void softassertion() {
		 SoftAssert sc=new SoftAssert();
		 String name="ashiwani";
		 assertEquals("Ashiwani",name);
		 System.out.println("i am after the when the condition is failed");
		 assertEquals("a","a");
		 sc.assertAll();//Use this method in the last of code it will allow to execute the rest code after where condition fail(Soft assertion)
		 
	 }
	
  
}

//https://www.softwaretestingmaterial.com/soft-assert/