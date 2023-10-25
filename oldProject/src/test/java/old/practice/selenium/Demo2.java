package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getdrip.com/forms/59166497/submissions");
		
		driver.findElement(By.id("fields_email")).sendKeys("shiva.bhaskar143@gmail.com");
		driver.findElement(By.id("fields_name")).sendKeys("shiva");
		driver.findElement(By.name("fields[programming_language]")).click();
	}

}
