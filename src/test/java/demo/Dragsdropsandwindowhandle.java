package demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragsdropsandwindowhandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://www.flipkart.com/");

//		WebElement moneyIcon = driver1.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//		WebElement amountBtn = driver1.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		Thread.sleep(3000);
		WebElement closeBtn = driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeBtn.click();
		Thread.sleep(1000);
		WebElement homeBtn = driver1.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));

		Actions act = new Actions(driver1);
		act.moveToElement(homeBtn).perform();
		WebElement lightningBtn = driver1.findElement(By.xpath("//a[text()='Lightings & Electricals']"));
		act.moveToElement(lightningBtn).perform();

		WebElement torchBtn = driver1.findElement(By.xpath("//a[text()='Torches']"));
		torchBtn.click();
		

		Thread.sleep(3000);
		
		WebElement firstproduct = driver1.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		firstproduct.click();
//		String parentID = driver1.getWindowHandle();
//		System.out.println(parentID);
//		driver1.switchTo().window(parentID);
		
		
		Set<String> allID=driver1.getWindowHandles();
		
		List<String> id=new LinkedList();
		id.addAll(allID);
		
		driver1.switchTo().window(id.get(1));
		
		WebElement price = driver1.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]"));
		System.out.println(price.getText());
		
		
		
		
		

		//WebElement first = driver1.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));

		
		
		//System.out.println(first.getText());
		
//List<WebElement> products=	driver1.findElements(By.xpath("//div[@class='_4rR01T']"));
//		
//		for (WebElement a:products) {
//			
//			System.out.println(a.getText());
//		}

		
		
		
		
	}

}
