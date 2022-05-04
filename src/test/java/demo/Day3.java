package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumDemo\\Driver\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
//		driver1.get("https://www.amazon.in/");
//
//		WebElement searchbox = driver1.findElement(By.id("twotabsearchtextbox"));
//
//		searchbox.sendKeys("iphone");
//
//		WebElement searchicon = driver1.findElement(By.id("nav-search-submit-button"));
//
//		searchicon.click();

//		driver1.get("https://demoqa.com/automation-practice-form");
//
//		WebElement firstnamebox = driver1.findElement(By.id("firstName"));
//		firstnamebox.sendKeys("Sarath");
//
//		WebElement lastnamenamebox = driver1.findElement(By.id("lastName"));
//		lastnamenamebox.sendKeys("Kumar");
//		
//		WebElement emailbox = driver1.findElement(By.id("userEmail"));
//		emailbox.sendKeys("saratmano1994@gmail.com");
//
////		WebElement genderbox = driver1.findElement(By.xpath("//input[@value='Male']"));
////		genderbox.click();
//		
//		WebElement phoneNumberBox = driver1.findElement(By.id("userNumber"));
//		phoneNumberBox.sendKeys("9940105519");
//		
	
		driver1.get("http://greenstech.in/selenium-course-content.html");

//		WebElement plusicon = driver1.findElement(By.xpath("(//i[@class='fas fa-plus'])[1]"));
//		plusicon.click();
//		
//		WebElement CTSInterviewIcon = driver1.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
//		CTSInterviewIcon.click();
//		
//		System.out.println(CTSInterviewIcon.getAttribute("href")); 
//		
//		System.out.println(CTSInterviewIcon.getText()); 
		
		
		WebElement coursesBtn = driver1.findElement(By.className("header-browse-greens"));
		
		Actions act=new Actions(driver1);
		act.moveToElement(coursesBtn).perform();
		
		WebElement oracleIcon = driver1.findElement(By.xpath("//div[@title='Oracle']"));
		
		
		Actions act1=new Actions(driver1);
		act.moveToElement(oracleIcon).perform();
		
		
	
		 

	}

}
