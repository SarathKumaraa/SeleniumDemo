package demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://www.flipkart.com/");

		driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement closeBtn = driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeBtn.click();

		WebElement electronicsBtn = driver1.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));

		Actions act = new Actions(driver1);
		act.moveToElement(electronicsBtn).perform();

		WebElement gamingBtn = driver1.findElement(By.xpath("//a[text()='Gaming']"));
		act.moveToElement(gamingBtn).perform();

		WebElement consoleBtn = driver1.findElement(By.xpath("//a[text()='Gaming Consoles']"));
		consoleBtn.click();

		WebDriverWait w = new WebDriverWait(driver1, 50);

		WebElement thirdProduct = w.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a[2]")));

		thirdProduct.click();

		Set<String> allID = driver1.getWindowHandles();

		List<String> id = new LinkedList();
		id.addAll(allID);

		driver1.switchTo().window(id.get(1));

		WebElement priceBtn = driver1.findElement(
				By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div[1]"));
		System.out.println(priceBtn.getText());

		WebElement cartBtn = driver1
				.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		cartBtn.click();

		WebElement nameBtn = driver1.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]"));
		System.out.println(nameBtn.getText());

		WebElement finalPricebtn = driver1.findElement(By
				.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/span/div/div/span"));
		System.out.println(finalPricebtn.getText());

		driver1.switchTo().window(id.get(0));

		WebElement secondProduct = w.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[2]")));

		secondProduct.click();
		
		
		

		Set<String> allIDs = driver1.getWindowHandles();

		List<String> ids = new LinkedList();
		ids.addAll(allIDs);
		System.out.println(ids.size());

		driver1.switchTo().window(ids.get(0));
		System.out.println(driver1.getTitle());
	//	driver1.findElement(By.xpath("(//button[@class='_23FHuj'])[2]")).click();

		driver1.switchTo().window(ids.get(1));
		System.out.println(driver1.getTitle());
		
		driver1.switchTo().window(ids.get(2));
		System.out.println(driver1.getTitle());
		
		
		
	}

}
