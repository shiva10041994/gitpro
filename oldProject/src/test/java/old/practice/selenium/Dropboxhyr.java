package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class Dropboxhyr {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		driver.findElement(By.xpath("//a[text()='Dropdowns']")).click();
		driver.switchTo().alert().dismiss();
		WebElement se = driver.findElement(By.id("course"));
		Select select = new Select(se);
		select.selectByVisibleText("Java");
		

	}
}
