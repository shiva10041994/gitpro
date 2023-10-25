package com.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		driver.findElement(By.linkText("Buy me a coffee")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
