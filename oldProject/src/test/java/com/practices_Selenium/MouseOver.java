package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://classic.crmpro.com/login.cfm");

		driver.findElement(By.name("username")).sendKeys("SuyoReddy");
		driver.findElement(By.name("password")).sendKeys("Suyo@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Deals']"))).perform();
		driver.findElement(
				By.xpath("//a[text()='New Deal']/parent::li/following-sibling::li/child::a[text()='Products']"))
				.click();

	}

}
