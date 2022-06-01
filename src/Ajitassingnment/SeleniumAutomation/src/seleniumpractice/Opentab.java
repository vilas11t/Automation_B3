package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Opentab extends BaseClass{
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=driverinilialize();
	switchopentab();
}
public static void switchopentab() throws InterruptedException {
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("opentab")).click();
	Thread.sleep(1000);
}
}
                                                                        