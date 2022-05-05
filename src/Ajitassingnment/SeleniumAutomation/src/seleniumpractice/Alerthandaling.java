package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerthandaling extends BaseClass {
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
	driver=driverinilialize();	
	simpleAlert();
	 conformationAlert();
}
    public static void simpleAlert() throws InterruptedException {
    	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    	driver.findElement(By.id("alertbtn")).click();
    	Thread.sleep(1000);
    	String alerttext=driver.switchTo().alert().getText();
    	driver.switchTo().alert().accept();
    	System.out.println("AlertText: " + alerttext  );
    }
    static public void conformationAlert() throws InterruptedException {
    	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    	driver.findElement(By.id("confirmbtn")).click();
    	Thread.sleep(1000);
    	String alearttext=driver.switchTo().alert().getText();
    	System.out.println(alearttext);
    	driver.switchTo().alert().dismiss();
    }
}
