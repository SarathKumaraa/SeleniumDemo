package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement usernameTxtBox=  driver.findElement(By.id("email"));
		usernameTxtBox.sendKeys("Sarath");
		
		WebElement passwordBox =  driver.findElement(By.name("pass"));
		passwordBox.sendKeys("hgsafhjh354");
		
		Thread.sleep(2000);
		
//		WebElement LoginBox =	driver.findElement(By.name("login"));
//		LoginBox.click();
		
		
		
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
		
	}

}
