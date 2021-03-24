package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;

		public static ArrayList<Object[]> getDataFromExcel() {
			
			ArrayList<Object[]>myData= new ArrayList<Object[]>();
				try {
					reader= new Xls_Reader(System.getProperty("C:\\Users\\MY-PC.DESKTOP-8EQSD1V\\git\\ExampleAllAutomation\\ExampleAllAutomation\\src\\test\\java\\com\\TestDate\\EcxelData.xlsx"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				for(int rowNum=2; rowNum<=reader.getRowCount("ResTestDate");rowNum++) {
					
					String firstname=reader.getCellData("ResTestDate", "firstname", rowNum);
					String lastname=reader.getCellData("ResTestDate", "lastname", rowNum);
					String address1=reader.getCellData("ResTestDate", "address1", rowNum);
					String address2=reader.getCellData("ResTestDate", "address2", rowNum);
					String city=reader.getCellData("ResTestDate", "city", rowNum);
					String state=reader.getCellData("ResTestDate", "state", rowNum);
					String zipcode=reader.getCellData("ResTestDate", "zipcode", rowNum);
					String emailadress=reader.getCellData("ResTestDate", "emailadress", rowNum);
					
					Object ob[]= {firstname, lastname, address1,address2,city,state,zipcode,emailadress};
					
					myData.add(ob);
				}
				return myData;
		}
}
