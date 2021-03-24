package com.TestRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class makeMyTripLogingPage {

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
			driver.get("https://www.makemytrip.com/");
			log.info("Entering and opening application URL ");
			log.warn("Hey tis is just awarning message");
			log.fatal("This is just fatel error message");
			log.debug("This is Debug message");
}


		@Test()
		public void MakeMyTrip() throws InterruptedException{
			DateTimeFormatter dft= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			LocalDateTime now=LocalDateTime.now();
			System.out.println("The Current Time with date is...:"+ dft.format(now));
			
		
			String title= driver.getTitle();
			
			System.out.println("The title of current page is: " +title);
			//Thread.sleep(4000);
			String Text=driver.findElement(By.xpath("//li[@data-cy='account']")).getText();
			System.out.println("Text is ====> " + Text);	
			driver.findElement(By.xpath("//li[@data-cy='account']")).click();
			System.out.println("Clicking for Loging Btn");
			Thread.sleep(4000);
			
			 String MainWindow=driver.getWindowHandle();		
       		
		        // To handle all new opened window.				
		        Set<String> s1=driver.getWindowHandles();		
		        Iterator<String> i1=s1.iterator();		
		        		
		        while(i1.hasNext())			
		        {		
		            String ChildWindow=i1.next();		
		            		
		            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		            {    		
		                  // Switching to Child window
		                    driver.switchTo().window(ChildWindow);
		                    System.out.println(driver.findElement(By.xpath("//li[@class='active']")).getText());
		                    driver.findElement(By.xpath("//input[@type='text' and @id='username']")).sendKeys("mdirfan201@gmail.com");             			
		                    
		                    //driver.findElement(By.name("btnLogin")).click();			
		                                 
					// Closing the Child Window.
		                        driver.close();		
		            }		
		        }		
		        // Switching to Parent window i.e Main Window.
		            driver.switchTo().window(MainWindow);
			
			
			
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//input[@type='text' and @id='username']")).sendKeys("mdirfan201@gmail.com");

			Set<String> handle=driver.getWindowHandles();
			Iterator<String> it= handle.iterator();
			
			String child=it.next();
			
			driver.switchTo().window(child);
			String title1= driver.getTitle();
			System.out.println("The title of current page is: " +title1);
			 Actions act= new Actions(driver); 
			 act.moveToElement(driver.findElement(By.xpath("//input[@type='text' and @id='username']"))).sendKeys("mdirfan201@gmail.com").build().perform();
			// driver.findElement(By.xpath("//input[@type='text' and @id='username']")).sendKeys("mdirfan201@gmail.com");

}
}