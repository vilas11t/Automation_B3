package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutorPractice extends BaseClass {
	/*
	 1. JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver. 
	 
	 2. JavaScriptExecutor provides two methods “executescript” & “executeAsyncScript” 
	 to run javascript on the selected window or current page.
	 
	 
	 Basic Syntax
	 JavascriptExecutor js = (JavascriptExecutor) driver;  
     js.executeScript(Script,Arguments);
     
     Script – This is the JavaScript that needs to execute.
     Arguments – It is the arguments to the script. It’s optional.
	 
	 The script can return values. Data types returned are

    Boolean
	Long
	String
	List
	WebElement.
	
	
	Some common Operations Using JS
	
	1. Click on webelement
	  js.executeScript("arguments[0].click();", button);
	  
	2. To send text on webelement
      js.executeScript("document.getElementById('some id').value='someValue';");
      
    3.to scroll down to the bottom of a webpage.
      js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
      
    4.Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
        
    5. To generate Alert
       js.executeScript("alert('enter correct login credentials to continue');");
       
    6. This will scroll the page till the element is found- vertically / Horizontally		
        js.executeScript("arguments[0].scrollIntoView();", Element);
	 */
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void main(String[] args) {
		driver=driverinilialize();
		driver.manage().window().maximize();
		js=(JavascriptExecutor) driver;
		//clickByJS();
		scrollByJS();
	}
	
	static void clickByJS() {
		driver.get("https://www.browserstack.com/");
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("(//a[@title='Sign In'])[1]")));
		js.executeScript("document.getElementById('user_email_login').value='username'");
	}
	
	static void scrollByJS() {
		 driver.get("https://www.browserstack.com/");
		// js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		 js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//a[text()='Contact Us']")));
	}
	


}
