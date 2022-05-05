package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\Documents\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.rediff.com/");
driver.manage().window().maximize();
Dimension d=new Dimension(900,1000);
driver.manage().window().setSize(d);
WebElement rediffmaillink=driver.findElement(By.className("mailicon"));
rediffmaillink.click();
driver.findElement(By.id("login1")).sendKeys("vishvaskshirsagar@rediffmail.com");
driver.findElement(By.id("password")).sendKeys("Vishvas@2020");
driver.findElement(By.className("signinbtn")).click();
String expectedErrorTextOnLoginFail="Temporary error occured[#5001], please try again.";
String actualErrorText=driver.findElement(By.xpath("//div[contains(@id,'error') and contains(@class,'xyz')]//b")).getText();
System.out.println(expectedErrorTextOnLoginFail);
System.out.println(actualErrorText);
if(expectedErrorTextOnLoginFail.equals(actualErrorText))
	System.out.println("Test case pass");
else
	System.out.println("Test case fails");
	}

}
