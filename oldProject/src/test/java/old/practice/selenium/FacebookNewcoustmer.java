package old.practice.selenium;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNewcoustmer {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shiva.bhaskar143@gmail.com");
//		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("Shiva8143@");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("shiva");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("giduthuri");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9985894862");
		Thread.sleep(5000);
		driver.findElement(By.id("password_step_input")).sendKeys("hello hai");
		Thread.sleep(5000);
		Select se = new Select(driver.findElement(By.id("day")));
		se.selectByVisibleText("10");
		Thread.sleep(5000);
		Select se1 = new Select(driver.findElement(By.id("month")));
		se1.selectByValue("4");
		Thread.sleep(5000);
		Select se2 = new Select(driver.findElement(By.id("year")));
		se2.selectByValue("1994");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='u_1q_4_oS']")).click();
	}

}