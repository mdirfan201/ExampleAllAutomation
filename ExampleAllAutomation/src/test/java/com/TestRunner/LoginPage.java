package com.TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	static WebDriver driver;
	public static void main(String[] args) {
			
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https:facebook.com");
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		WebElement userName=driver.findElement(By.id("email"));	
//		WebElement userPassword=driver.findElement(By.id("pass"));	
		
		Xls_Reader reader= new Xls_Reader("D:\\IRFAN---\\java program\\ExampleAutomation\\src\\test\\java\\com\\TestDate\\EcxelData.xlsx");
		String SheetName="ResTestDate";
		
		int rowCount=reader.getRowCount(SheetName);		
		
		for(int rowNum=2;rowNum<=rowCount; rowNum++) {
			String loginId=reader.getCellData(SheetName, "username", rowNum);
			String password=reader.getCellData(SheetName, "password", rowNum);
			System.out.println(loginId +" : "+ password);
			
//			userName.clear();
//			userName.sendKeys(loginId);
//			
//			userPassword.clear();
//			userPassword.sendKeys(password);
		}
	}
}
