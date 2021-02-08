package com.TestRunner;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aq.BrowserValidationHelper.BrowserValidate;

public class CRMProSingUp {

	static WebDriver driver;
	@Test
	public void CRMProTest() throws InterruptedException {
		//BrowserValidate.StartBrowser("chrome");
		//driver.get("https://classic.crmpro.com/");
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		Thread.sleep(4000);
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(1));
		   // driver.close();
		   // driver.switchTo().window(tabs2.get(0));
		driver.findElement(By.name("email")).sendKeys("mdirfan201@gmail.com");	
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("7718942434");
		driver.findElement(By.name("terms")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();		
	}
}
