package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9985894862");
		//driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		// driver.switchTo().alert().accept();
		Thread.sleep(3000);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.id("//img[@class='_396cs4']//parent::div//parent::div[@class='_1mkliO']//parent::a//parent::div//parent::div[@class='_37M3Pb']"))).perform();

	}

	}


