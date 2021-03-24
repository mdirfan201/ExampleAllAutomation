package com.TestRunner;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomateDropDown_GoogleSearch {

	
static WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https:google.com/");
		String title=driver.getTitle();
		System.out.println("Currnet Google PageTitle is: "+title);
		
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(10);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='presentation']//li/descendant::div[@class='sbl1']"));
		System.out.println("Total number of suggestions is:::===>"+ list.size());
}
}
