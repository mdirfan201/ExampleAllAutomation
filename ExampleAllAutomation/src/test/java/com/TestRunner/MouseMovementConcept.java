package com.TestRunner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MouseMovementConcept {
	static WebDriver driver;
	static Logger log=Logger.getLogger(MouseMovementConcept.class);
	
	@Test
	public static void MouseMovement() throws InterruptedException {
		log.info("************************Starting TestCase Started*******************************");
		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://spicejet.com");
		String title=driver.getTitle();
		System.out.println("The Currentt Page Title is=====>"+ title);
		System.out.println();
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		
		Thread.sleep(3000);
		log.info("************************************Performing SpiceClub Members******************* ");
		act.moveToElement(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String titel1=driver.getTitle();
		System.out.println("The Loging Page Title is=====>" +titel1);
		System.out.println();
		WebElement Title= driver.findElement(By.xpath("//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']"));
		Select select= new Select(Title);
		//select.selectByValue("MR");
		//select.selectByIndex(1);
		select.selectByVisibleText("MR");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName').value='Mohammed Irfan'");
		
		
		js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName').value='Ansari'");
		
		js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER').value='7718942434'");
		
		js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword').value='dubai@201'");
		
		js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm').value='dubai@201'");
		
		js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB').value='19/10/1990'");
		
		js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail').value='mdirfan201@gmail.com'");
		js.executeScript("scrollBy(0,150)");
		//js.executeScript("document.getElementById('chkSpiceClubTnC').checked=false;");
		driver.findElement(By.xpath("//input[@type='checkbox' and @id='chkSpiceClubTnC']")).click();
		
		//js.executeScript("document.getElementById('CONTROLGROUPREGISTERVIEW_ButtonSubmit').click();");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
}
	
}
