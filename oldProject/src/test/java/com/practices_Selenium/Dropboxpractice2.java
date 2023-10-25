package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropboxpractice2 {
	
	public static void selectValueFromDropdown(WebElement ele , String val) {
		Select se = new Select(ele);
		se.selectByVisibleText(val);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(5000);
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
		 
		String date = "23-Apr-2014";
		String datearr[]=date.split("-");
		selectValueFromDropdown(d, datearr[0]);
		selectValueFromDropdown(m, datearr[1]);
		selectValueFromDropdown(y, datearr[2]);
		
	}

}
