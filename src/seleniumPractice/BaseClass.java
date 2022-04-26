package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static public WebDriver driver;
	
	public static WebDriver driverinilialize() {
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	  driver=new ChromeDriver();  // Webdriver -interface
	  return driver;
	}

}
