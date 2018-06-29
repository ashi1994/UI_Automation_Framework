package com.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.constants.Contants;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;

/**
 * This method is to set the File path and to open the Excel file, 
 * Pass Excel Path and Sheetname as Arguments to this method
 * @param Path
 * @param SheetName
 * @throws Exception
 */
public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

		FileInputStream ExcelFile = new FileInputStream(Path);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		

		} catch (Exception e){

			throw (e);

		}

}


/**
 * This method is to read the test data from the Excel cell,in this we are passing parameters as Row num and Col num
 * @param RowNum
 * @param ColNum
 * @return cell data
 * @throws Exception
 */

public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			//String CellData = Cell.getStringCellValue();
			String CellData=ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

			return CellData;

			}
	   catch (Exception e){

			return"";

			}

}

//This method is to write in the Excel cell, Row num and Col num are the parameters

public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

		try{

			Row  = ExcelWSheet.getRow(RowNum);

		    Cell = Row.getCell(ColNum);

		if (Cell == null) {

			Cell = Row.createCell(ColNum);

			Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(Contants.Path_TestData + Contants.File_TestData);

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			}catch(Exception e){

				throw (e);

		}

	}
/**
 * it will give all active row cell value
 * @param Path
 * @param SheetName
 */

public static void iterateAllRowColumn(String Path,String SheetName){
	FileInputStream ExcelFile;
	try {
		ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	DataFormatter dataFormatter = new DataFormatter();
	// Access the required test data sheet
	ExcelWSheet = ExcelWBook.getSheet(SheetName);
	for (org.apache.poi.ss.usermodel.Row row: ExcelWSheet) {
        for(org.apache.poi.ss.usermodel.Cell cell: row) {
            String cellValue = dataFormatter.formatCellValue(cell).trim();
            System.out.print(cellValue+" ");
        }
        System.out.println();
    }
}	
/**
 * It will give all cell value of specified row.
 * @param Path
 * @param SheetName
 */
	public static void iterateRowWise(String Path,String SheetName,int rowNum){
		FileInputStream ExcelFile;
		try {
			ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DataFormatter dataFormatter = new DataFormatter();
		// Access the required test data sheet
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
             XSSFRow row=ExcelWSheet.getRow(rowNum);
	        for(org.apache.poi.ss.usermodel.Cell cell: row) {
	            String cellValue = dataFormatter.formatCellValue(cell).trim();
	            System.out.print(cellValue+" ");
	    }
	
	

}

}