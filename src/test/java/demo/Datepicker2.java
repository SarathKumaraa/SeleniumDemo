package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://www.phptravels.net/");

		Thread.sleep(1000);

		String month = "May 2022";
		String date = "20";

		WebElement datepicker = driver1.findElement(By.id("checkin"));
		datepicker.click();

		Thread.sleep(1000);
		
		
		driver1.findElement(By.xpath(""));
		

		while (true) {

			WebElement text = driver1.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]"));

			if (text.equals(month)) {

				break;
			}

			else {
				driver1.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]/i")).click();
				
			}

			Thread.sleep(2000);
			
			driver1.findElement(By.xpath("//div[2]//div[1]/table/tbody/tr/td[contains(text(),"+date+")]")).click();
			

			
		}

	}

}
