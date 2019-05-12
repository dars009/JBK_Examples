package com.Testng_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LogginTestCaseDemo {
 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("in method beforeSuite()");
  }
  
  @BeforeTest
  public void beforeTest() {
	  	System.out.println("in method beforeTest()");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("in method beforeClass()");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in method beforeMethod()");
  }
    
  @Test(priority=1)
  public void m1() {
	  System.out.println("in method m1()");
  }
  
  @Test(priority=2)
  public void m2() {
	  System.out.println("in method m2()");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("in method afterMethod()");
  }


  @AfterClass
  public void afterClass() {
	  System.out.println("in method afterClass()");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("in method afterTest()");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("in method afterSuite()");
  }


  

  

}
