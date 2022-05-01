package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends BaseClass{
	static public WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = driverinilialize();
		googleSearchTest("wallpaper");
	}
	
	public static void googleSearchTest(String searchText) throws InterruptedException {
		driver.get("https://www.google.com/");
		WebElement googleSerch=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		googleSerch.click();
		googleSerch.sendKeys(searchText);
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		//action.sendKeys(Keys.ENTER).build().perform();
		List<WebElement> searchsuggestions=driver.findElements(By.xpath("//ul[@class='G43f7e']//li//span/b"));
		for(WebElement w:searchsuggestions) {
			System.out.println(searchText+" "+w.getText());
		}
	}
	
}
