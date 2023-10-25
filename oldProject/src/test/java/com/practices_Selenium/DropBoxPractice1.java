package com.practices_Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxPractice1 {
	
	public static void dropboxvalue(WebElement ele, String val) {
		
		Select se = new Select(ele);
		se.selectByValue(val);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(5000);
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
		
		dropboxvalue(d,"10");
		
		dropboxvalue(m, "7");
		dropboxvalue(y, "1999");
	}

}
