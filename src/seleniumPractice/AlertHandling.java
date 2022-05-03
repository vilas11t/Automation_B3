package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandling extends BaseClass {
	
	/* 3 types of alerts
	 1. simple alert
	 2.confirmation alert 
	 3. prompt alert
	 
	 methods
	 driver.switchTo.alert();
	  .accept
	  .dissmiss
	  .sendkeys(text)
	  .gettext();
	 */
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=driverinilialize();
		simpleAlert();
		ConfirmationeAlert();
		
	}
	
	static public void simpleAlert() throws InterruptedException {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();
	}
	
	static public void ConfirmationeAlert() throws InterruptedException {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(500);
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().dismiss();
	}
	
	

}
