package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shiva.bhaskar143@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shiva8143@");
		driver.findElement(By.name("login")).click();
	}
}
