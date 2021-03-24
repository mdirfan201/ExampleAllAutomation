package com.TestRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	

public class GoogleTitleTest {

static WebDriver driver;
Logger log= Logger.getLogger(GoogleTitleTest.class);
	
	@BeforeMethod()
	public void setup(){
		
		log.info("************************Starting TestCase Started*******************************");
		//logger.info("This is information masg");
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		log.info("Launching Chrome Browser");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//logger.info("Opening Url now");
		driver.get("https:google.com/");
		log.info("Entering and opening application URL ");
		log.warn("Hey tis is just awarning message");
		log.fatal("This is just fatel error message");
		log.debug("This is Debug message");
	}
	
	@Test()
	public void googleTitle(){
		log.info("********************Checking Current Date And Time*****************************");
		DateTimeFormatter dft= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		System.out.println("The Current Time with date is...:"+ dft.format(now));
		log.info("********************Printing Current Date And Time******************************");
		
		
		
		log.info("********************Starting TestCase******************************");
		log.info("********************googleTitle******************************");
		String title= driver.getTitle();
		
		System.out.println("The title of current page is: " +title);
		log.info("Loging page title is--> "+ title);
		Assert.assertEquals("Google", title,"Title is failed");
		
		log.info("********************TestCase Ended******************************");
		log.info("********************googleTitle******************************");
	}
	
	
	@Test()
	public void googleLogoTest() {
		log.info("********************Starting TestCase******************************");
		log.info("********************googleLogoTest******************************");
		boolean logo=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(logo);
		log.info("******************** TestCase Ended******************************");
		log.info("********************googleLogoTest******************************");
	}
	
	@Test()
	public void googlemailTest() {
		boolean m=driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(m);
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("****************************Browser Got Closed***********************");
	}
}
