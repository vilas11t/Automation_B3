package testNGDemo;
import org.testng.annotations.*;

public class ClassB {
	
	@BeforeSuite
	void m1() {
		System.out.println("This is before suite method Class B");
	}
	
	@AfterSuite
	void m2() {
		System.out.println("This is After suite method Class B");
	}
	
	@BeforeTest
	void m3() {
		System.out.println("This is before Test Method");
	}
	
	@AfterTest
	void m4() {
		System.out.println("This is After Test Method");
	}
	
	@BeforeClass
	void m5() {
		System.out.println("This is before classB Method");
	}
	
	@AfterClass
	void m6() {
		System.out.println("This is After classB Method");
	}
	
	
	@Test
	void m12() {
		System.out.println("This is m12 class B Method");
	}
	
	@Test
	void m13() {
		System.out.println("This is m13 class B Method");
	}

	
}
