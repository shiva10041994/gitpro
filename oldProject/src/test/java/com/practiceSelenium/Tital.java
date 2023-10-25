package com.practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tital {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		String expectedvalue = "H Y R Tutorials - H Y R Tutorials";
		String actualvalue = driver.getTitle();
		System.out.println(actualvalue);
//		if (expectedvalue.equals(actualvalue)) {
//			System.out.println("is ture");
//		}
//		else {
//			System.out.println("is false");
//		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
