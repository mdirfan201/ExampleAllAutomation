package com.TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropConcept {

	static WebDriver driver;
	@Test
	public static void DragDrop() {
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action= new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		
	}
}
