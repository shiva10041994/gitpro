package com.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticalLink {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		driver.findElement(By.partialLinkText("View More")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
