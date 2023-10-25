package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropboxpractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
	
		
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select se = new Select(d);
		se.selectByVisibleText("10");
		Thread.sleep(3000);
		Select see = new Select(m);
		see.selectByVisibleText("Apr");
		Thread.sleep(3000);
		Select seee = new Select(y);
		seee.selectByVisibleText("1994");
		
	}
}
