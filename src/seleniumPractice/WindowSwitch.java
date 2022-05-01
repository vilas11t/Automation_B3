package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowSwitch extends BaseClass{

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=driverinilialize();
		switchWnidow();
	}
	
	static public void switchWnidow() throws InterruptedException{
		String expectedTitle="QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy";
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String homePageId=driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(1000);
		
		Set<String> windoIds=driver.getWindowHandles();
		
		for(String windowid:windoIds) {
			if(windowid!=homePageId)
				driver.switchTo().window(windowid);
		}
		
		String actualTitle=driver.getTitle();
		
		System.out.println("Actual title="+actualTitle);
		System.out.println("expected title="+expectedTitle);
		
		//driver.quit(); // closes all open windows
		
		driver.close(); // child window
		driver.switchTo().window(homePageId);
		driver.close(); // parent window
		
	}
	
}
