package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Snapdeal {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.instagram.com/accounts/login/?hl=en");
		
		Thread.sleep(5000);

		WebElement Signinbox =  driver1.findElement(By.xpath("//input[@name='username']"));
		Signinbox.sendKeys("Sarath");
		
		WebElement Passbox =  driver1.findElement(By.name("password"));
		Passbox.sendKeys("12333");
		
		
		
		
		
		
		
		
}

}
