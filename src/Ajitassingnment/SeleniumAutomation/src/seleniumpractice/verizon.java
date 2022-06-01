package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verizon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Documents\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.verizon.com/");
	   WebElement Business= driver.findElement(By.id("gnav20-eyebrow-link-Business"));
	   Business.click();
	   WebElement Business1= driver.findElement(By.xpath("//*[contains(@class,'gnav20-account-link')]"));
	   Business1.click();
	   s.selectByValue("option1");

	}

}
