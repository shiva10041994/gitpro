package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Github {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(4000);
		driver.findElement(By.id("login_field")).sendKeys("gansnraju074@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Shiva8143@");
		Thread.sleep(5000);
		driver.findElement(By.name("commit")).click();
		
		
	}

}
