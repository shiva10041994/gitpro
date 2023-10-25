package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-6gpygo r-cn9azx']/child::div[text()='SpiceMax']"))).perform();
		
		
		
		
	}
}
