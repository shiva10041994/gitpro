package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		//driver.switchTo().frame()
		driver.findElement(By.xpath("//a[text()='XPath Practice']")).click();
		driver.switchTo().frame("aswift_5");
		driver.switchTo().frame("ad_iframe");
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.name("name")).sendKeys("shiva");
		
	}
}
