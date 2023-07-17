package week4.day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void testcase() {
	  System.out.println("testcase @Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod @Test");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("afterMethod @Test");
  }

  @BeforeClass
  public void beforeClass() 
  
  { System.out.println("BeforeClass @Test");
  }

  @AfterClass
  public void afterClass() 
  
  { System.out.println("AfterClass @Test");
  }

  @BeforeTest
  public void beforeTest() 
  { System.out.println("BeforeTest @Test");
  }

  @AfterTest
  public void afterTest() 
  { System.out.println("AfterTest @Test");
  }

  @BeforeSuite
  public void beforeSuite() 
  { System.out.println("BeforeSuite @Test");
  }

  @AfterSuite
  public void afterSuite()
  { System.out.println("AfterSuite @Test");
  }

}
