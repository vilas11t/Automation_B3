package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePractice extends BaseClass{

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=driverinilialize();
		tableAddColumnValues();
		tableAddRightColumnValues();

	}
	
	static void tableAddColumnValues() {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> prices=driver.findElements(By.xpath("//table[@name=\"courses\"]//tbody//tr//td[3]"));
		
		int sum=0;
		
		for(WebElement w:prices) {
			int a=Integer.parseInt(w.getText());
			sum=sum+a;
		}
		
		System.out.println("Total price:="+sum);
		driver.close();

	}
		
		static void tableAddRightColumnValues() {
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			List<WebElement> amount=driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]//tbody//tr//td[4]"));
			
			int sum=0;
			
			for(WebElement w:amount) {
				int a=Integer.parseInt(w.getText());
				sum=sum+a;
			}
			
			System.out.println("Total Right Table Amount:="+sum);
			
			driver.close();
		
	}
	
}
