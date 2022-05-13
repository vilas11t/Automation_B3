package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {
	
	@Parameters({"p1","p2"})
	@Test(groups= {"sanity","regression"})
	void m1(String str1, String str2) {
		System.out.println(str1+" "+str2);
		System.out.println("This is m1 class C Method");
	}
	
	
	@Test(groups= {"sanity"})
	void m2() {
		System.out.println("This is m2 class C Method");
	}
	
	@Test(groups= {"regression"})
	void m3() {
		System.out.println("This is m3 class C Method");
	}
	
	@Test()
	void m4() {
		System.out.println("This is m4 class C Method");
	}

}
