package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@maxlength=75]")).sendKeys("shiva.bhaskar143@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shiva8143@");
		driver.findElement(By.xpath("//button[@type='submit']/parent::div")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//div[@id='splash-screen']/child::span")).click();
		
		driver.findElement(By.xpath("//span[@dir='auto']/following-sibling::div")).click();
		
	}
	
//no result
}
