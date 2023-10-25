package com.practices_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathh {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("abssdd@gamil.com");
		driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div/child::input[@type='password']")).sendKeys("shivaraju");
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input[@type='password']")).sendKeys("rajushiva");
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Mexico']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='7000']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[text()='Click']/parent::td/preceding-sibling::td[text()='Helen Bennett']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/following-sibling::tr/child::td/child::input[@type='checkbox']")).click();
		
		
		
		
		
	}
}
