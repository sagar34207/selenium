package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class suite {
  @Test
  public void TestNg() {
	  System.out.println("test1");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass4");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest5");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest6");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite7");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite8");
  }

}
