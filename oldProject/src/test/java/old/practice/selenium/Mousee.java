package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousee {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@class='parent']/a[text()='Tutorials']"))).perform();
		driver.findElement(By.xpath("//a[text()='Dot Net']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		action.moveToElement(driver.findElement(By.xpath("//li[@class='parent']/a[text()='Tutorials']"))).perform();
		driver.findElement(By.xpath("//li/child::a[text()='SQL']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		
	}

}
