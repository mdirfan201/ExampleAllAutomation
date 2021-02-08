package com.TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	static WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:google.com/");
	
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitle() {
		String title= driver.getTitle();
		System.out.println("The title of current page is: " +title);
	}
	
	@Test(priority=3,groups="LogoTest")
	public void googleLogoTest() {
		boolean logo=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
	}
	
	@Test(priority=2,groups="LinkTest")
	public void googlemailTest() {
		boolean m=driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("Tets1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("Tets2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("Tets3");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();//
	}
	
	
}
