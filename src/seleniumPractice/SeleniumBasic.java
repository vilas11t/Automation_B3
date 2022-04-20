package seleniumPractice;


import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vilas\\Automation_Project_B3\\Automation_B3\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  // Webdriver -interface
		driver.get("https://www.rediff.com/");
		
		//full screen
		driver.manage().window().maximize();
		
		// to set screen dimensions
		Dimension d= new Dimension(900, 700);
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
		//to get current url
		System.out.println("Current Url: "+driver.getCurrentUrl());
		driver.getCurrentUrl();
		
		// to get html code of current page
		System.out.println(driver.getPageSource());
		
		//to get title of page
		System.out.println(driver.getTitle());
		
		
		// to get current window id
		System.out.println(driver.getWindowHandle());
		
	    // to get all open window ids
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
		// Use of navigate methods
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		
		// to close current instance of browser
		driver.close();
		
		
		
		
		
	}

}
