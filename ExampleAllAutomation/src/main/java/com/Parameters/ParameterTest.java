package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	static WebDriver driver;
	
	
	//TestNG Framework- Selenium Tutorial Part-1
	@Test
	@Parameters({"browser","url", "emailID"})
	public void YahooLoginTest(String browser,String url,String emailID) {
		System.out.println("Now Browser is opening");
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
			driver= new FirefoxDriver();	
		}
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailID);
		
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		
	}

}
