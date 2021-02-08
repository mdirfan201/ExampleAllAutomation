package com.TestRunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNGFeatures {

	static WebDriver driver;
	
	@Test()
	public void login() {
		
		System.out.println("Login");
		int i=9/4;
		System.out.println("The value of i is: "+ i);
	}
	
	@Test(dependsOnMethods="login")
	public void Homepage() {
		
		System.out.println("Homepage is totally depend on login test");
	}
	
	@Test(dependsOnMethods="login")
	public void search() {
		
		System.out.println("searh");
	}
	@Test(dependsOnMethods="login")
	public void Regstrationpage() {
		
		System.out.println("Resgistration page");
		
	}
	
}
