package seleniumpractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton extends BaseClass  {
	public static WebDriver driver;
	 static Select s;
	public static void main(String[] args) throws InterruptedException {
		driver=driver=driverinilialize();
       //radioclick("radio2");
      // selectcheckbox("option1",true);
       selectclass();     	
}	
	public static void radioclick(String radiobutton) throws InterruptedException {
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
   driver.findElement(By.xpath("//input[@value='" + radiobutton + "']")).click();
    Thread.sleep(1000);
}
   public static void selectcheckbox(String checkbox ,boolean isselect) {
    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
   WebElement Wecheck= driver.findElement(By.xpath("//input[@value='"+ checkbox + "']"));
    Wecheck.click();
    if(isselect) {
    	if(!Wecheck.isSelected());
    	Wecheck.click();
    }
    else{
    	
    if(Wecheck.isSelected());
    Wecheck.click();
    }
    }
   static void selectclass() {
	   driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	   s=new Select(driver.findElement(By.id("dropdown-class-example")));
	   s.selectByIndex(2);
	   List<WebElement> options = s.getOptions();
    for(WebElement w:options) {
    	System.out.println(w.getText());
    }
		
		 
   }
    }
