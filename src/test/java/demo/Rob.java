package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rob {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement closeBtn = driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeBtn.click();
		
		WebElement searchBox = driver1.findElement(By.className("_3704LK"));
		searchBox.click();
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement Ja = driver1.findElement(By.xpath("(//div[@class='_2kHMtA'])[15]"));
		
		JavascriptExecutor j = (JavascriptExecutor)driver1;
		j.executeScript("arguments[0].scrollIntoView(true)", Ja);
		
		WebElement Jas = driver1.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));

		j.executeScript("arguments[0].scrollIntoView(false)", Jas);
		
		Thread.sleep(2000);

		searchBox.clear();
		
		
		Thread.sleep(2000);
		
		searchBox.sendKeys("mobile");
		

//		WebElement searchButton = driver1.findElement(By.xpath("//button[@class='L0Z3Pu']"));
//		Thread.sleep(2000);
//		j.executeScript("arguments[0].click()",searchButton);
		
		
		
	}

}
