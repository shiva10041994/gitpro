package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input")).click();
	}

}
//label[test()='Male']/following-sibling::input