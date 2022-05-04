package demo;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://www.flipkart.com/");

		Thread.sleep(3000);

		WebElement closeBtn = driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeBtn.click();

		WebElement n = driver1.findElement(By.xpath("//div[text()='Mobiles']"));
		n.click();
		Thread.sleep(5000);

		driver1.navigate().back();
		Thread.sleep(5000);

		driver1.navigate().refresh();
		Thread.sleep(5000);

		driver1.navigate().forward();
		Thread.sleep(5000);

		driver1.navigate().to("https://www.naukri.com/");

	}

}
