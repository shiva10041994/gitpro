package com.projectTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasicOfTestNG {
	
	//precondition annotation
    @BeforeSuite
    public void Setup() {
    	System.out.println("Setup of the properties");
    }
	@BeforeClass
	public void Test() {
		System.out.println("lunch the browser ");
	}
	@BeforeTest
	public void lunchBrowser() {
		System.out.println("entering the url of application");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter into login page");
	}
	@org.testng.annotations.Test
	public void GoogleTest() {
		System.out.println("Google title test");
	}
	@AfterMethod
	public void DeleteAllCoockies() {
		System.out.println("Delete all coockies");
	}
	
	@AfterTest
	public void Report() {
		System.out.println("report generation");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout the application");
	}
	@AfterSuite
	public void ClosingBrowser() {
		System.out.println("close the browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
