package assignmentone;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumPrac {

	
		// TODO Auto-generated method stub
		static WebDriver driver;
		static int c;
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DNLONDHE\\Desktop\\javafullcourse\\Automation_B3\\drivers\\chromedriver.exe");
	
			driver=new ChromeDriver();  // Webdriver -interface
			driver.get("https://www.google.com/");
			gmail();
			switchToImage();
			signin();
			feelLucky();
			
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q'")).sendKeys("wallpaper");
				
			//	driver.findElement(By.className("RNmpXc")).click();
			
			//	driver.close();*/
				

}
		static void gmail()
		{
			
			
			WebElement googleLink=driver.findElement(By.xpath("//a[@class='gb_d' and @data-pid='23']"));
			googleLink.click();
			String url1=driver.getCurrentUrl();
			if(url1.contentEquals("https://www.google.com/intl/en-GB/gmail/about/"))
			{System.out.println("1st test case passed");
			driver.get("https://www.google.com/");
			}
			else
				System.out.println("1st test case failed");
			}
		static void switchToImage()
		{
			
			
			WebElement googleLink=driver.findElement(By.xpath("//a[@class='gb_d' and @data-pid='2']"));
			googleLink.click();
			String url2=driver.getCurrentUrl();
			if(url2.contentEquals("https://www.google.co.in/imghp?hl=en&ogbl"))
			{System.out.println("2nd test case passed");
			driver.get("https://www.google.com/");
			}
			else
				System.out.println("2nd test case failed");
			} 
		static void signin()
		{
			
			
			WebElement googleLink=driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_9d gb_9c']"));
			googleLink.click();
			String url3=driver.getCurrentUrl();
			if(url3.startsWith("https://accounts.google.com/signin/"))
			
					{System.out.println("3rd test case passed");
			driver.get("https://www.google.com/");
			}
			else
				System.out.println("3rd test case failed");
			} 
		static void feelLucky()
		{
			
			
			//WebElement googleLink=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div/div[3]/center/input[2]"));
		WebElement googleLink=driver.findElement(By.xpath("//*[contains(@class,'RNmpXC')]"));
			googleLink.click();
			String url4=driver.getCurrentUrl();
			if(url4.startsWith("https://www.google.com/doodles"))
			
					{System.out.println("4th test case passed");
			driver.get("https://www.google.com/");
			}
			else
				System.out.println("4th test case failed");
			} 
}