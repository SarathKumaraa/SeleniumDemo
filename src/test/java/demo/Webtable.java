package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://www.w3schools.com/python/python_operators.asp");

		Thread.sleep(3000);

		WebElement table = driver1.findElement(By.xpath("(//table[@class='ws-table-all notranslate'])[1]"));
		List<WebElement> tableheading = table.findElements(By.tagName("th"));
//		for (WebElement a : tableheading) {
//			System.out.println(a.getText());
//
//		}

		List<WebElement> tableData = table.findElements(By.tagName("td"));
	

//		for (WebElement a : tableData) {
//			System.out.println(a.getText());

//		}

//		List<WebElement> tableBody = table.findElements(By.tagName("tbody"));
//
//		for (WebElement a : tableBody) {
//			System.out.println(a.getText());
//
//	}
		}}

	
	
