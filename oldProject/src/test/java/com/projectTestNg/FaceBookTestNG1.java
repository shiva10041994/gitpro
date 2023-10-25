package com.projectTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookTestNG1 {
	
	WebDriver driver;
	@BeforeMethod
	public void BrowserSetup() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
	}
	@Test
	public void login() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Broken Links']"))).perform();
		driver.findElement(By.xpath("//a[text()='Link1']")).click();
		Thread.sleep(10000);
			}
	@Test(priority =2)
	public void Removeads() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Broken Links']"))).perform();
		driver.findElement(By.xpath("//a[text()='Link1']")).click();
		driver.switchTo().frame("aswift_5");
		driver.switchTo().frame("ad_iframe");
		driver.findElement(By.id("dismiss-button")).click();
		Thread.sleep(10000);
	}
	@Test(priority =1)
	public void newone() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		driver.findElement(By.xpath("//a[text()='Dropdowns']")).click();
		driver.switchTo().frame("aswift_5");
		driver.switchTo().frame("ad_iframe");
		driver.findElement(By.id("dismiss-button")).click();
		WebElement ele = driver.findElement(By.id("course"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Java");
		Thread.sleep(10000);
		
	}
	@AfterMethod
	public void logout() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
