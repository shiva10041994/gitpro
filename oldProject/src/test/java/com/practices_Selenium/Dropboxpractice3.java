package com.practices_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropboxpractice3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
		Select se = new Select(d);
		List<WebElement> listofdays = se.getOptions();
		for(int i=0;i<listofdays.size();i++) {
			String shiva = listofdays.get(i).getText();
			
			if(shiva.equals("10")) {
				listofdays.get(i).click();
				break;
			}
		}
		Select set = new Select(m);
		List<WebElement> listofmonths = set.getOptions();
		for(int k=0;k<listofmonths.size();k++) {
			String raju = listofmonths.get(k).getText();
			
			if(raju.equals("Apr")) {
				listofmonths.get(k).click();
				break;
			}
		}
		
		Select tes = new Select(y);
		List<WebElement> listofyears = tes.getOptions();
		for(int j=0; j<listofyears.size();j++) {
			String kaja = listofyears.get(j).getText();
			 
			if (kaja.equals("1994")) {
				listofyears.get(j).click();
				break;
			}
		}
		
	}	
	
	

}
