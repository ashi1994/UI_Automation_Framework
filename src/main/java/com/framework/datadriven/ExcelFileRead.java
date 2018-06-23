package com.framework.datadriven;

import com.common.ExcelUtils;

public class ExcelFileRead {

	public static void main(String []args) throws Exception {
   	
		ExcelUtils.setExcelFile("C://workspace//testashiwani.xlsx","Test");
		String us1=ExcelUtils.getCellData(1,0);
		String us2=ExcelUtils.getCellData(2,0);
		String pwd1=ExcelUtils.getCellData(1,1);
		String pwd2=ExcelUtils.getCellData(2,1);
		System.out.println("user one name: "+us1);
		System.out.println("user two name: "+us2);
		System.out.println("user one password: "+pwd1);
		System.out.println("user two nameword: "+pwd2);
		ExcelUtils.iterateAllRowColumn("C://workspace//testashiwani.xlsx","Test");
		ExcelUtils.iterateRowWise("C://workspace//testashiwani.xlsx","Test",0);
		}
	
}
  