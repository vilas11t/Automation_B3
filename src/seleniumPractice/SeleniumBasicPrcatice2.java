package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasicPrcatice2 extends BaseClass {

	static WebDriver driver;
	static Select s;

	public static void main(String[] args) {
		driver = driverinilialize();
		selectradioButton("radio1");
		selectcheckBox("option1",false);
		selectClassPractice();
	}

	static void selectradioButton(String radioButton) {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='" + radioButton + "']")).click();
	}

	static void selectcheckBox(String checkBox, boolean isselect) {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement weCheckBox = driver.findElement(By.xpath("//input[@value='" + checkBox + "']"));
		weCheckBox.click();

		if (isselect) {
			if (!weCheckBox.isSelected())
				weCheckBox.click();
		} else {
			if (weCheckBox.isSelected())
				weCheckBox.click();
		}

	}

	static void selectClassPractice() {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		s = new Select(driver.findElement(By.id("dropdown-class-example")));

		s.selectByIndex(1);
		s.selectByValue("option1");

		List<WebElement> options = s.getOptions();

		for (WebElement w : options) {
			System.out.println(w.getText());
		}

	}

}
