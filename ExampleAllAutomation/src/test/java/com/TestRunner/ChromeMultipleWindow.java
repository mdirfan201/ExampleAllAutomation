package com.TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeMultipleWindow {
	static WebDriver driver;
	@Test
	public void testChromTab() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		String title=driver.getTitle();
		System.out.println("Currnet  PageTitle is: "+title);

		String parent= 	driver.getWindowHandle();
		WebElement Hotels=driver.findElement(By.xpath(""));
}
}
