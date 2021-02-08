package com.aq.BrowserValidationHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserValidate {

	static WebDriver driver;
	public static WebDriver StartBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.out.println("Now Browser is opening");
			System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			
		}else if(BrowserName.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
			System.out.println("Now FireFox Browser is opening");
			
		}else if(BrowserName.equalsIgnoreCase("IE")) {
			driver= new InternetExplorerDriver();
		}
		
		
		return driver;	
		
	}
}
