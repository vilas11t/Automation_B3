package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableEx2 extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=driverinilialize();
		tableAddition();
	}
static void tableAddition() {
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	List<WebElement>Amount=driver.findElements(By.xpath("//table[@id=\"product\"]//tbody//tr//td[4]"));
	int sum=0;
	for(WebElement w:Amount) {
	int a=Integer.parseInt(w.getText());
	sum=sum+a;
	}
	System.out.println(sum)	;	
}
}
