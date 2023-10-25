package old.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropbox3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.id("day"));
		WebElement m = driver.findElement(By.id("month"));
		WebElement y = driver.findElement(By.id("year"));
		
		Select se = new Select(d);
		List<WebElement> listofdays = se.getOptions();
		for(int i=0;i<listofdays.size();i++) {
			String shiva = listofdays.get(i).getText();
			System.out.println(shiva);
			
			if(shiva.equals("10")) {
				listofdays.get(i).click();
				break;
			}
		}
		Select sew = new Select(m);
		List<WebElement> listofmonths = sew.getOptions();
		for(int j=0; j<listofmonths.size();j++) {
			String raju = listofmonths.get(j).getText();
			System.out.println(raju);
			
			if (raju.equals("Mar")) {
				listofmonths.get(j).click();
				break;
			}
		}
		
		Select set = new Select(y);
		List<WebElement> listofyears = set.getOptions();
		for(int k =0;k<listofyears.size();k++) {
			String kaja = listofyears.get(k).getText();
			
			if(kaja.equals("1999")) {
				listofyears.get(k).click();
				break;
			}
		}
	}
}
