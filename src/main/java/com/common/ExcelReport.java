package com.common;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReport {
	  XSSFWorkbook workbook;
	  //define an Excel Work sheet
	  XSSFSheet sheet;
	  //define a test result data object
	  static Map<String,Object[]> testresultdata;
	  public static void writeTest(){
		  testresultdata=new LinkedHashMap<>();
		  testresultdata.put("1", new Object[]{"Test Case Name","Status"});
		  
	  }

}
