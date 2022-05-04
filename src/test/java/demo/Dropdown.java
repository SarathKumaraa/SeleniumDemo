package demo;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://demo.guru99.com/test/newtours/register.php");

		Thread.sleep(3000);
		
		
		WebElement dd= driver1.findElement(By.name("country"));
		
		Select dd1 = new Select (dd);
		boolean b = dd1.isMultiple();
		System.out.println(b);
		
		
		
//		dd1.selectByValue("BANGLADESH");
		
//		List<WebElement> dr=  dd1.getOptions();
//		
//		for (WebElement a:dr) {
//			System.out.println(a.getText());
//		}

//		for(int i=0;i<dr.size();i++) {
//			
//			System.out.println(dr.get(i).getText());
//		}
		
	}
	

}
