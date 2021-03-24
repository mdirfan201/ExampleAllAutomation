package com.TestRunner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLinnk {

	static WebDriver driver;
	@Test
	public static void BrokenLinkAre() throws InterruptedException, MalformedURLException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClearTipProject\\Browser-Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com");
	//Wait for 5 seconds
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mdirfan201@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dubai102");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='login']")).click();	
	Thread.sleep(5000);
	//links---//a
	//image---//img
	
	List<WebElement> linksList=driver.findElements(By.tagName("a"));
	linksList.addAll(driver.findElements(By.tagName("img")));
	System.out.println("Size of  Full links and images are====>" + linksList.size());
	
	List<WebElement> activelinks= new ArrayList<WebElement>();
	
	for(int i=0; i<linksList.size();i++) {
		
		if(linksList.get(i).getAttribute("href") !=null && (! linksList.get(i).getAttribute("href").contains("javascript"))) {
			activelinks.add(linksList.get(i));
		}
	}
	
	System.out.println("Size of active links and images are====>" + activelinks.size());
	
	for(int j=0; j<activelinks.size(); j++) {
		
		HttpURLConnection connection= (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response=connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href") + " "+ response);
	}
	
}
}