package com.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/login.cfm");
		
		driver.findElement(By.name("username")).sendKeys("SuyoReddy");
		driver.findElement(By.name("password")).sendKeys("Suyo@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Cases']"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='New Case']/parent::li/following-sibling::li/child::a[text()='Full Search Form']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
