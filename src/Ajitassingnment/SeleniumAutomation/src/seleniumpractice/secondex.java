package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Documents\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.Verizon.com/");
	    Dimension d=new Dimension(900,1000);
	    System.out.println(driver.getTitle());
	    driver.manage().window().setSize(d);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getWindowHandle());
	    driver.navigate().to("https://www.google.com");
	    driver.navigate().back();
	    
	}

}
