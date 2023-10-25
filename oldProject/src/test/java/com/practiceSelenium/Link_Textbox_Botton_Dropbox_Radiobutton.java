package com.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Textbox_Botton_Dropbox_Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		//textBox
		driver.findElement(By.id("firstName")).sendKeys("shiva");
		Thread.sleep(5000);
		driver.findElement(By.id("lastName")).sendKeys("raju");
		Thread.sleep(5000);
		//radioButton
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("malerb")).click();
		Thread.sleep(5000);
		//checkBox
		
		WebElement english =driver.findElement(By.id("englishchbx"));
		english.click();
		Thread.sleep(5000);
		if(english.isSelected()) {
			english.click();
		}
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("latinchbx")).click();
		Thread.sleep(5000);
		//button
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(5000);
		driver.findElement(By.id("clearbtn")).click();
		Thread.sleep(5000);
		//linkText
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
	}
}
