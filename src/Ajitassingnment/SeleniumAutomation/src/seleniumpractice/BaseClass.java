package seleniumpractice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static public WebDriver driver;

	public static WebDriver driverinilialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Documents\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver= new ChromeDriver();
      return driver;
	}

}