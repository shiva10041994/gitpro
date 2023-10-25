package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyr {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign in into account")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		WebElement sel = driver.findElement(By.id("BlogArchive1_ArchiveMenu"));
		Thread.sleep(4000);
		Select sele = new Select(sel);
		sele.selectByVisibleText("December (5)");
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='2']")).click();
		
		
	}
}
