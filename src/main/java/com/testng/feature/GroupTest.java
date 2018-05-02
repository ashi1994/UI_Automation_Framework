package com.testng.feature;

import org.testng.annotations.Test;

public class GroupTest{
  @Test(groups={"Run"})
  public void f() {
	  System.out.println("test case 1");
  }
  @Test(groups={"Run"})
  public void f1() {
	  System.out.println("test case 2");
  }
  @Test(groups={"NotRun"})
  public void f2() {
	  System.out.println("test case 3");
  }
  
  @Test(groups={"NotRun"})
  public void f3() {
	  
	  System.out.println("test case 4");
  }
}
