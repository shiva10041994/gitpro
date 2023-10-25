package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tital {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/login.cfm");
		
		driver.findElement(By.name("username")).sendKeys("SuyoReddy");
		driver.findElement(By.name("password")).sendKeys("Suyo@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String expectedValue = "CRMPRO";//TURE
		//String expectedvalue1 ="CRMROONE";//FALSE
		String actualValue = driver.getTitle();
		if (expectedValue.equals(actualValue)) {
			System.out.println("is true");
		}
		else {
			System.out.println("is false");
		}
		
		
		
		
		
		
	}
}
