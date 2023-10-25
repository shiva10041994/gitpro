package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='XPath Practice']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().frame(driver.findElement(By.xpath("//span[text()='Close']")).click());
		
		//driver.findElement(By.xpath("//body[@class='index']")).click();
		
		driver.findElement(By.id("dismiss-button")).click();
		
		
		
		
	}
}
