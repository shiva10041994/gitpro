package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Dropbox1 {
	
	public static void textvisible(WebElement ele, String val) {
		Select se =new Select(ele);
		se.selectByValue(val);
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.id("day"));
		WebElement m=driver.findElement(By.id("month"));
		WebElement y =driver.findElement(By.id("year"));
		
		textvisible(d, "2");
		Thread.sleep(3000);
		textvisible(m, "4");
		Thread.sleep(3000);
		textvisible(y, "1994");
		
	}
}
