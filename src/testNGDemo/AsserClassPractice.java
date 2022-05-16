package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumPractice.BaseClass;

public class AsserClassPractice extends BaseClass {

	public static WebDriver driver;

	@BeforeClass
	void beforeClass() {
		driver = driverinilialize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(dataProvider="loginData")
	void loginErrormessageVerification(String userName, String password) {
		String expectederrorMessage="Wrong username and password combination.";
		driver.get("https://www.rediffmail.com");
		driver.findElement(By.xpath("//*[@class='mailicon']")).click();
		driver.findElement(By.id("login1")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		String str=driver.findElement(By.id("password")).getText();
		Assert.assertTrue(str.equals(""), "password fied not clrear after clicking singin button");
		String actualerrorMessage=driver.findElement(By.xpath("//div[@id='div_login_error']//b")).getText();
		Assert.assertEquals(actualerrorMessage, expectederrorMessage, "Actual and expected error text does not matches");
	}
	
	
	
	
	@DataProvider
	Object[][] loginData() {
		return new Object[][] {{"username1","password1"}, {"rahul554321","Password2"},
			{"username1","Pass@123"},{"rahul554321","Pass@123"}};
	}
	
	
	@AfterClass
	void afterClass() {
		driver.close();
	}
	
	
	

}
