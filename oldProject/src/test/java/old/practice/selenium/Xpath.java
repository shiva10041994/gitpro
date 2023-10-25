package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("shiva");
		driver.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("raju");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("gansnraju074@gmail.com");
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input[@type='password']")).sendKeys("shiva8143");
		//driver.findElement(By.xpath("//button[text()='Register']")).click();
		//driver.findElement(By.xpath("//button[text()='Clear']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Reset']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='refreshbtn']")).click();
		
	}
}
