package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWork {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.findElement(By.id("name")).sendKeys("test1");
		Thread.sleep(5000);
		driver.switchTo().frame("frm1");

		Select options = new Select(driver.findElement(By.id("course")));
		options.selectByVisibleText("Java");
		
		Select opt = new Select(driver.findElement(By.id("course")));
		opt.selectByVisibleText("Python");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("text2");
//		Select pte = new Select(driver.findElement(By.id("selectnav1")));
//		pte.selectByVisibleText("- Java");
		
		driver.switchTo().frame("frm3");
		Select shiva = new Select(driver.findElement(By.id("selectnav1")));
		shiva.selectByVisibleText("- Dot Net");
	}
}
