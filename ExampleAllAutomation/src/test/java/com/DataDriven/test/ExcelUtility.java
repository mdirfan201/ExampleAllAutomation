package com.DataDriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader reader= new Xls_Reader("C:\\Users\\MY-PC.DESKTOP-8EQSD1V\\git\\ExampleAllAutomation\\ExampleAllAutomation\\src\\test\\java\\com\\TestDate\\EcxelData.xlsx");
		String SheetName="ResTestDate";
		
		int rowCount=reader.getRowCount(SheetName);
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			String loginId=reader.getCellData(SheetName, "username", rowNum);
			String password=reader.getCellData(SheetName, "password", rowNum);
			System.out.println(loginId +" : "+ password);	
		}
		String Data=reader.getCellData(SheetName, 0, 2);
		System.out.println(Data);
	}

}
