package testNGDemo;

import org.testng.annotations.*;

public class DataProviderPractice {
	
	 
	
	@Test(dataProvider="loginData")
	void login(int userName, String password) {
		System.out.println(userName +" "+password);
	}
	
	@DataProvider(name="loginData")
	Object[][] loginTestData() {
	return new Object[][] {{1,"password1"}, {2,"Password2"},
		{3,"Password3"},{4,"Password4"}};
		
	}
	  
}
