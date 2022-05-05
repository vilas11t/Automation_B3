package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassBasics extends BaseClass {
	/*
	 Action Class
	   To handle keyboard and mouse events
	   
	   Actions-Class
	   Action-Interface
	
	    Mouse Actions in Selenium:

		doubleClick(): Performs double click on the element
		clickAndHold(): Performs long click on the mouse without releasing it
		dragAndDrop(): Drags the element from one point and drops to another
		moveToElement(): Shifts the mouse pointer to the center of the element
		contextClick(): Performs right-click on the mouse
		Click();
		
		
		Keyboard Actions in Selenium:

		sendKeys(): Sends a series of keys to the element
		keyUp(): Performs key release
		keyDown(): Performs keypress without release
		*/
	
	  public static WebDriver driver;
	  public static Actions action;
	  
	  public static void main(String[] args) throws InterruptedException {
		driver=driverinilialize();
		driver.manage().window().maximize();
	    action=new Actions(driver);
	   // actionClassMethods();
	    dragAndDrop();
		
	}
	  
	  
	 static void actionClassMethods() throws InterruptedException {
		 // move to element
		 driver.get("https://www.rediff.com/");
		 WebElement mailicon=driver.findElement(By.className("mailicon"));
		int xOffset= mailicon.getLocation().getX();
		int yOffset= mailicon.getLocation().getY();
	    action.moveToElement(mailicon).click().build().perform();
	    Thread.sleep(500);
	  
	    //to type in capitral letters
	    WebElement userName=driver.findElement(By.id("login1"));
	    action.moveToElement(userName).click().keyDown(Keys.SHIFT).sendKeys("abc").keyUp(Keys.SHIFT).build().perform();
	    
	    //rightclick- contextclick
	    WebElement forgetPasswordLink=driver.findElement(By.xpath("//u[contains(text(),'Forgot Password?')]"));
	    action.moveToElement(forgetPasswordLink).contextClick(forgetPasswordLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	 }
	 
	 static void dragAndDrop() {
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		 WebElement iframer1=driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe"));
		 
		 driver.switchTo().frame(iframer1);
		 
		 WebElement source=driver.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
		 WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		 
		 action.dragAndDrop(source, target).build().perform();
		 
		 
	 }
}
