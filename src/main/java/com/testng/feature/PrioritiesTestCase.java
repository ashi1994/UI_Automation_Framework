package com.testng.feature;

import org.testng.annotations.Test;

public class PrioritiesTestCase {

  @Test(priority = 1) 
  public void testMethodA() { 
     System.out.println("Executing - testMethodA");
  } 

  @Test 
  public void testMethodB() { 
     System.out.println("Executing - testMethodB");//it will run first because default priority is 0
  }

  @Test(priority = 2) 
  public void testMethodC() { 
     System.out.println("Executing - testMethodC");
  }
}
