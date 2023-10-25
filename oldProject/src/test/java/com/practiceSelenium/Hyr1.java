package com.practiceSelenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyr1 {

	public static void main(String[] args) {
//		
////		public static void highlight(WebDriver driver, WebElement element) {
////			JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
////			jsexecutor.executeScript(arguments[0].setAttribute('style', 'border:2px solid red : backgroundyellow'));
////			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).sendKeys("shiva");
		driver.findElement(By.name("password")).sendKeys("hello");
		driver.findElement(By.className("auth-form-header p-0")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("//input[@type='submit']")).click();

	}
}
