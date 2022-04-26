package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	// Locators in selenium
	// id, name, className, Tagname, Link Text, Partial Link Text, Xpath, CSS.

	/*
	  xpath
	    - absolute xpath
	    - relative xpath
	    
	    absolute xpath-  html/body/div[2]/div/div[2]/a[1]
	    
	    -relative xpath -
	        //tag name[@attribute='value of attribute']
	         
	         ref website:- https://www.rediff.com/
	         
	          contans:- //*[contains(text(),'TOP STORIES')]
	                   //*[contains(@title,'Lightning fast free')]
	                    * 
	           ref website:- https://www.google.com/
	         
	          or:- 
	          //*[@class='gLFyf gsfi' or @name='q' or title='search'] 
	          
	         and 
	         (//*[@value='Google Search' and @aria-label='Google Search'])[2]   - indexing used to locate second element
	         //a[@class='gb_d' and text()='Gmail']
	           
	          
	          // parent to child 
	             //a[@aria-label='Google apps']//*[@class='gb_Ve']//*
	              
	           //Starts With
	            //*[starts-with(@id,'topdiv')]
	            
	            // axes
	            //div[@class='secstorybox topboxheight corona topstories']//child::div[2]//h2[1]/following-sibling::h2[1]/parent::div/ancestor::div[1]
	             
	 */
	
	
	
	
	static WebDriver driver;
	public static void main(String[] args) {
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
