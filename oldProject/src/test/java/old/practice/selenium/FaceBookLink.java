package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLink {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("shiva.bhaskar143@gmail.com");
//		Thread.sleep(6000);
//		driver.findElement(By.id("pass")).sendKeys("Shiva8143@");
//		Thread.sleep(6000);
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(6000);
//	//	driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//a[@id='u_0_0_DQ']")).click();
	}

}
