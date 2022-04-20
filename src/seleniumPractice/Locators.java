package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	// Locators in selenium
	// id, name, className, Tagname, Link Text, Partial Link Text, Xpath, CSS.
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vilas\\Automation_Project_B3\\Automation_B3\\drivers\\chromedriver.exe");
		loginErrorTextTest();
	}
	
	static void loginErrorTextTest() {
		String expectedErrorTextOnLoginFail="Temporary error occured[#5001], please try again.";
		driver=new ChromeDriver();  // Webdriver -interface
		driver.get("https://www.rediff.com/");
		
		WebElement rediffmailLink=driver.findElement(By.className("mailicon"));
		rediffmailLink.click();
		
		driver.findElement(By.id("login1")).sendKeys("user1");
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.className("signinbtn")).click();
		
		String actualErrorText=driver.findElement(By.xpath("//div[@id=\"div_login_error\"]//b")).getText();
		
		if(expectedErrorTextOnLoginFail.equals(actualErrorText)) {
			System.out.println("Test case pass");
		}
		else
			System.out.println("TestCase Fails");
		
	}
}
