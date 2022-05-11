package testNGDemo;
import org.testng.annotations.*;

public class ClassA {
	/*
	 TestNG:- 
	 
	 What is testNG-
	 TestNG.xml
	 TestNG Annotations
	 Controlling testCase Execution from testNG.xml
	 include exclude mechanism
	 Grouping
	 Data provider
	 parameter passing
	 parallel execution
	 reporting.
	 
	 
	 Annotations
	 @test
	 @BeforeSuite
     @AfterSuite
     @BeforeTest
	 @AfterTest
	 @BeforeGroups
	 @AfterGroups
	 @BeforeClass
	 @AfterClass
	 @BeforeMethod
	 @AfterMethod
	 
	 */
	
	@BeforeSuite
	void m1() {
		System.out.println("This is before suite method Class A");
	}
	
	@AfterSuite
	void m2() {
		System.out.println("This is After suite method Class A");
	}
	
	@BeforeTest
	void m3() {
		System.out.println("This is before Test Method");
	}
	
	@AfterTest
	void m4() {
		System.out.println("This is After Test Method");
	}
	
	
	@BeforeMethod
	void m5() {
		System.out.println("This is before method in ClassA");
		
	}
	@AfterMethod
	void m6() {
		System.out.println("This is After method in ClassA");
		
	}
	
	@Test()
	void test1() {
		System.out.println("This is testmethod-1 from ClassA");
	}
	
	@Test()
	void test2() {
		System.out.println("This is testmethod-2 from Class A");
	}
	
	@Test()
	void test3() {
		System.out.println("This is testmethod-3 from Class A");
	}
	
	
	

}
