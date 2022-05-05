package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;





public class firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Documents\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver= new ChromeDriver();
    driver.get("https://www.rediff.com/");
    /*driver.manage().window().maximize();
    Dimension d=new Dimension(900,1000);
    driver.manage().window().setSize(d);
    System.out.println(driver.manage().window().getSize());
    System.out.print(driver.getTitle());
    System.out.print(driver.getWindowHandle());
    driver.navigate().to("https://www.google.com");
    driver.get("https://www.rediff.com"));*/
    //WebElement rediffmailLink=driver.findElement(By.className("getahead"));
	//rediffmailLink.click();
    byclik("GET AHEAD");
	String str=driver.getTitle();
	if(str.contains("Red"))
		System.out.print("This reddifmail website");
	else
		System.out.print("Something wrong");
	}
	public static void byclik(String classname)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Documents\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		WebElement rediffmailLink=driver.findElement(By.className(classname));
		rediffmailLink.click();
		
	
	}

}
