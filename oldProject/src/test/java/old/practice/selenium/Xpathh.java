package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Xpathh {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("cbd@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div/child::input[@type='password']")).sendKeys("shiva");
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input[@type='password']")).sendKeys("raju");
		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='Austria']/preceding-sibling::td/child::input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[text()='3000']/preceding-sibling::td/child::input[@type='checkbox']")).click();
	}
}
