package com.TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGInvocationCount {

	static WebDriver driver;
	@Test(invocationCount=5)
	public void sum() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:facebook.com/");
		String FacebookTitle=driver.getTitle();
		System.out.println("The Face																														Book Title is==="+ FacebookTitle	);
		driver.quit();
	}
}
