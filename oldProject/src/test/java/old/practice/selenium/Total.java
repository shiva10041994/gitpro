package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Total {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		Actions action  = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		driver.findElement(By.xpath("//a[text()='Window Handles']")).click();
		//driver.switchTo().frame("google_esf");
		Thread.sleep(3000);
		driver.switchTo().frame("aswift_5");
		Thread.sleep(3000);
		driver.switchTo().frame("ad_iframe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("newWindowBtn")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
