package com.DataDriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader;

public class DateDrivenTest {
	static WebDriver driver;
	@Test
	public void readDatefromExcel() {
	
		Xls_Reader reader= new Xls_Reader("D:\\IRFAN---\\java program\\ExampleAutomation\\src\\test\\java\\com\\TestDate\\EcxelData.xlsx");
		String ExcelDate=reader.getCellData("ResTestDate", "FirstName", 2);
		
		System.out.println(ExcelDate);
		
		int rowCount=reader.getRowCount("ResTestDate");
		int ColCunt=reader.getColumnCount("ResTestDate");
		System.out.println("Total number rows: "+ rowCount);
		System.out.println("Total number Colunms: "+ColCunt);
		//reader.addColumn("ResTestDate", "Mobile Number");
		//reader.removeColumn("ResTestDate", 0);
		//System.out.println(reader.setCellData("ResTestDate", "FirstName", 4, "Mohammed Hammad"));
		//System.out.println(reader.setCellData("ResTestDate", "LastName", 4, "Ansari"));
		//System.out.println(reader.addSheet("InfoTestData"));
		reader.addColumn("InfoTestData", "Test");
		reader.removeColumn("InfoTestData", 0);
		//System.out.println(getCrenditalMap());
//		System.setProperty("webdriver.chrome.driver", "D:\\IRFAN---\\java program\\ClassicCRMPRO\\Browser-Driver\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		
		
	}

}
