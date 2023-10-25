package com.projectTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasicTestNG {
	//precondition annotation
    @BeforeSuite
    public void Setup() {
    	System.out.println("Before suite");
    }
	@BeforeClass
	public void Test() {
		System.out.println("Before class ");
	}
	@BeforeTest
	public void lunchBrowser() {
		System.out.println("before test");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("before method");
	}
	@org.testng.annotations.Test
	public void GoogleTest() {
		System.out.println("test");
	}
	@AfterMethod
	public void DeleteAllCoockies() {
		System.out.println("after method");
	}
	
	@AfterTest
	public void Report() {
		System.out.println("after test");
	}
	@AfterClass
	public void logout() {
		System.out.println("after class");
	}
	@AfterSuite
	public void ClosingBrowser() {
		System.out.println("after suite");
	}
	
}
