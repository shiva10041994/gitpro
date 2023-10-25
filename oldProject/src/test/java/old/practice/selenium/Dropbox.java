package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
	
		Select es = new Select(d);
		es.selectByVisibleText("10");
		Thread.sleep(5000);
		Select es1 = new Select(m);
		es1.selectByVisibleText("Apr");
		Thread.sleep(3000);
		Select es2 = new Select(y);
		es2.selectByVisibleText("1994");
		Thread.sleep(3000);
		driver.quit();
		
	}
}
