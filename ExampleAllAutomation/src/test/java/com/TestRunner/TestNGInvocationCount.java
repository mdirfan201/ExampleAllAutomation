package com.TestRunner;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNGInvocationCount {

	static WebDriver driver;
	@Test()
	public void sum() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:youtube.com/");
		Thread.sleep(4000);
		String YoutubeTitle=driver.getTitle();
		System.out.println("The Youtube Title is==="+ YoutubeTitle	);
		Actions actionObject = new Actions(driver);
		actionObject.sendKeys(Keys.F5).perform();
		System.out.println("FaceBook is Refreshed");
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.cleartrip.com");
		String ClearTripTitle=driver.getTitle();
		System.out.println("The Google Title is==="+ ClearTripTitle);
		//driver.quit();
	}
}
