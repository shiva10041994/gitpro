package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Thread.sleep(5000);
		
		driver.navigate().to("https://elementalselenium.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shiva");
	}
}
