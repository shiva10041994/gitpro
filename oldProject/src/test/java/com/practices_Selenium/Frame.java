	package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Frame {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/login.cfm");
		
		driver.findElement(By.name("username")).sendKeys("SuyoReddy");
		driver.findElement(By.name("password")).sendKeys("Suyo@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		
		(driver.findElement(By.xpath("//a[text()='Contacts']"))).click();
		
		
	}
}
