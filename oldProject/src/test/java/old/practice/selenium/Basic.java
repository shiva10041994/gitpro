package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys("shiva");
		Thread.sleep(5000);
		driver.findElement(By.id("lastName")).sendKeys("raju");
		Thread.sleep(5000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("malerb")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("shiva.soc94@gmail.com");
	
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("shivaraju8143");
		
		Thread.sleep(5000);
		//driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("clearbtn")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("navigateHome")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
