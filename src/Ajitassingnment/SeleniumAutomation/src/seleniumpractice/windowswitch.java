package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class windowswitch extends BaseClass {
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=driverinilialize();
	 switchWindow();
	 
}
public static void switchWindow() throws InterruptedException {
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	String homepageID=driver.getWindowHandle();
	//WebElement home=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	//home.click();
	driver.findElement(By.id("openwindow")).click();
	Thread.sleep(1000);
    Set <String> windowID=driver.getWindowHandles() ;
    for(String windowid:windowID) {
    	if(windowid != homepageID) 
    		driver.switchTo().window(windowid);
    }
    driver.close();
    driver.switchTo().window(homepageID);
}
}
