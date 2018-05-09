package com.common;

import org.testng.annotations.DataProvider;
 
public class CustomDataProvider {
	
	@DataProvider(name="LoginDataProvider")
	public static Object[][] getData() throws Exception{
		
		Object[][] data = new Object[2][2];
		
		//1..If we have to take from user
//		data[0][0] = "shekhar@Gmail.com";
//		data[0][1] = "abc@123";
//		
//		data[1][0] = "1234@Gmail.com";
//		data[1][1] = "xyz@123";
		
		//2..If we have to read from external file
		ExcelUtils.setExcelFile(System.getProperty("user.dir")+"/"+"src/test/resources/testashiwani.xlsx","Test");
		
		data[0][0]=ExcelUtils.getCellData(1,0);
		data[0][1]=ExcelUtils.getCellData(1,1);
		data[1][0]=ExcelUtils.getCellData(2,0);
		data[1][1]=ExcelUtils.getCellData(2,1);
		
		return data;		
}
}