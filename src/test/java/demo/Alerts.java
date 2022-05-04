package demo;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(3000);

		WebElement simpleBtn = driver1.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simpleBtn.click();
		Alert a = driver1.switchTo().alert();
		a.accept();

		

		WebElement confirmBtn1 = driver1.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirmBtn1.click();

		Thread.sleep(3000);

		WebElement confirmBtn2 = driver1.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmBtn2.click();
		Alert b = driver1.switchTo().alert();
		b.dismiss();
		
		TakesScreenshot ts = (TakesScreenshot) driver1;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Automation\\SeleniumDemo\\target\\snap5.png");
		FileUtils.copyFile(src, dest);

		Thread.sleep(3000);

		WebElement promptBtn1 = driver1.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptBtn1.click();

		WebElement promptBtn2 = driver1.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptBtn2.click();
		Alert c = driver1.switchTo().alert();
		c.sendKeys("Sarath");
		c.dismiss();

	}

}
