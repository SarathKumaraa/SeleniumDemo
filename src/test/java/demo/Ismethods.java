package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ismethods {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://www.facebook.com/");

		Thread.sleep(1000); 
		
//		driver1.findElement(By.xpath("//a[text() ='Create New Account']")).click();
//		Thread.sleep(2000);
//		
//		WebElement radioBtn= driver1.findElement(By.xpath("(//input[@type='radio'])[2]"));
//		System.out.println(radioBtn.isSelected());
//		radioBtn.click();
//		System.out.println(radioBtn.isSelected());
		
		
//		WebElement fbLogo = driver1.findElement(By.xpath("//img[@alt='Facebook']"));
//		
//		boolean displayed = fbLogo.isDisplayed();
//		System.out.println(displayed);
		
		
		boolean enabled = driver1.findElement(By.xpath("//a[text() ='Create New Account']")).isEnabled();
		System.out.println(enabled);
		
	}
	
	

}
