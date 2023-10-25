package com.projectTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookTestNG {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test(priority = 3)
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("shiva.bhaskar143@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shiva8143@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		Thread.sleep(30000);
	}
	@Test(priority = 1)
	public void logout() {
		driver.findElement(By.id("email")).sendKeys("shiva.bhaskar143@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shiva8143@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Groups']")).click();
	}
	@Test(priority =2)
	public void click() {
		driver.findElement(By.id("email")).sendKeys("shiva.bhaskar143@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shiva8143@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Marketplace']")).click();
	}
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
