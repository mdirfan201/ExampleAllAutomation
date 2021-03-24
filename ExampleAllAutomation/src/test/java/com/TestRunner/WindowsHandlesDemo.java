package com.TestRunner;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowsHandlesDemo {

	static WebDriver driver;
	@Test
	public static void WindowsHandles() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		System.out.println("parents Windows title is===>" +driver.getTitle());
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent window ID is===>" +parentHandle);
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text' and @autocomplete='off']"))).sendKeys("mdirfan201@gmail.com").build().perform();
}
}