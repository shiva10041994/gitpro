package com.projectTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Google {
	WebDriver driver ;
	@BeforeMethod
	public void stepup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test(priority = 1)
	public void title() {
		String title = driver.getTitle();
		System.out.println("google title name is :"+title);
	}
	@Test(priority = 2)
	public void logo() {
		Boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println("google is displayed "+ b);
	}
	@AfterMethod
	public void closing() {
		driver.close();
	}
	
}
