package com.TestRunner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {

	@BeforeSuite
	public void setupBrowser() {
		System.out.println("Setup system Broswser");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch browser");
	}
	
	
	@BeforeClass
	public void Login() {
		System.out.println("Login to application");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("Setup URL");
	}
	
	@Test
	public void getGoogleTitle() {
		System.out.println("Get Google Title page");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout top the application");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the Chrome-Browser");
	}
	@AfterTest
	public void deleteAllCookies() {
	System.out.println("please the---deleteAllCookies");
	}
	
	
	
	
}
