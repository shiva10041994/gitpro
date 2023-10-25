package old.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropboxhyrtutorial {
	public static void main(String[] args) {
		
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement sel = driver.findElement(By.id("course"));
		Select sele = new Select(sel);
		sele.selectByVisibleText("Java");
		
		
	}	
}
	
	
