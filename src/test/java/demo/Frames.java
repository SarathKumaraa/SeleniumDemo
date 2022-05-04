package demo;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		Thread.sleep(3000);

//	HDFC	driver1.switchTo().frame("login_page");

		driver1.switchTo().frame("TuringSession");
		
		
		

		WebElement fr = driver1.findElement(By.id("//input[@id='fldLoginUserId']"));
		fr.sendKeys("Sarath");

//		HDFC	WebElement fr = driver1.findElement(By.xpath("//input[@class='form-control text-muted']"));
//		HDFC	fr.sendKeys("Sarath");

//		HDFC	WebElement con = driver1.findElement(By.xpath("(//div[@class='inputfield ibvt loginData'])[2]"));
//		HDFC		con.click();

	}
}
