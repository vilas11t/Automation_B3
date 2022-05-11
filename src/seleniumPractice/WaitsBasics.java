package seleniumPractice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsBasics extends BaseClass {
	/*
	 Wait
	 1. implicit
	 2. explicit wait
	 3. fluent wait
	 
	 1. implicit
	 
	 2.  explicit wait-
	       max time
	       expected condition
	      
	  3.fluent wait
	     -max time out
	     -frequency
	     -ignoring exception or expected condition.
	  
	 */

	static public WebDriver driver;
	static public Actions action;
	public static void main(String[] args) throws InterruptedException {
		driver = driverinilialize();
		driver.manage().window().maximize();
		explicitWait();
	}
	
	static void explicitWait() {
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@title='Online Shopping']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement w=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Bags and Luggage')]")));
		w.click();
		
	}
	
	static void fulentWait() {
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@title='Online Shopping']")).click();
		
		Wait wait=new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//a[contains(text(),'Bags and Luggage')]\")));\r\n" + 
				"		w.click();")).click();
		
	}
	
	
	
}
