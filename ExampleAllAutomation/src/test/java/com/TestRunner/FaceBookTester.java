package com.TestRunner;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookTester {
	
	static WebDriver driver;
	@Test
	public void LoginFaceBook() throws InterruptedException {
		System.out.println(getCrenditalMap());
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:facebook.com/");
		
		
		String AdminID= getCrenditalMap().get("Admin");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(getUserName("Customer"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(getUserName("Customer"));
		//Thread.sleep(3000);
		//driver.findElement(By.name("login")).click();
		
	}

	public static HashMap<String,String> getCrenditalMap() {
		
		HashMap<String, String> usermap =new HashMap();
		usermap.put("Admin", "mdirfan201@gmail.com:dubai201");
		usermap.put("Customer", "hamadn23@gmail.com:mumbra102");
		usermap.put("Customer1", "hammad26@gmail.com:mumbra102");
		usermap.put("Admin2", "farheen02@gmail.com:mumbra102");
		return usermap;
	}

	public static String getUserName(String role) {
		String crendital= getCrenditalMap().get(role); 
		return crendital.split(":")[0];
			
	}
	
	
	public static String getPassword(String role) {
		String crendital= getCrenditalMap().get(role); 
		return crendital.split(":")[1];
			
	}
}
