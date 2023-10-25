package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropbox2 {
	public static void dropboxpractice(WebElement ele, String val) {
		Select se = new Select(ele);
		se.selectByVisibleText(val);
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
		
		String dob="4-Mar-1945";
		String dobarr[] = dob.split("-");
		
		dropboxpractice(d, dobarr[0]);
		dropboxpractice(m, dobarr[1]);
		dropboxpractice(y, dobarr[2]);
		
		
	}
}
