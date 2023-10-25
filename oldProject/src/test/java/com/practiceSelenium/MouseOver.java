package com.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='YouTube Courses']"))).perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='English']"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Apache PDFBox']/parent::li/following-sibling::li/child::a[text()='Core Java']")).click();
				
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
