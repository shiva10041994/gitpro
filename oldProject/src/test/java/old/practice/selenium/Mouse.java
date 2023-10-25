package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse {
	 public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("SuyoReddy");
		driver.findElement(By.name("password")).sendKeys("Suyo@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
	}
}
