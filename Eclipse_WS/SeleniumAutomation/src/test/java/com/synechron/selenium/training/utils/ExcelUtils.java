package com.synechron.selenium.training.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public static Workbook wb = null;
	public static Sheet sheet  = null;
	public static final String DATA_FILE = "data\\TestData.xls";
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		File f = new File("data\\TestData.xls");
//		FileInputStream fis = new FileInputStream(f);
//		Workbook wb = WorkbookFactory.create(fis);
//		int sheetCount = wb.getNumberOfSheets();
//		System.out.println("Totaln umber of sheets " + sheetCount);
//		for (int i = 0; i < sheetCount; i++)
//		{
//			System.out.println(wb.getSheetName(i));
//		}
//		Sheet sheet = wb.getSheet("Sheet3");
//		int rowCout = sheet.getLastRowNum() + 1;
//		System.out.println("total rows : " + rowCout );
//		Row row;
//		Cell cell;
//		for (int i = 0; i < rowCout; i++) {
//			row = sheet.getRow(i);
//			cell = row.getCell(0);
//			System.out.println(cell.toString());
//		}
//	}
	
	public static Workbook getWorkbook() {
		try {
			File f = new File(DATA_FILE);
			FileInputStream fis = new FileInputStream(f);
			wb = WorkbookFactory.create(fis);
		}catch(Exception ex) {
			System.out.println("Error while creating wb obje");
		}
		
		return wb;
		
	}
	
	public static Sheet getSheet(String sheetname) {
		
		wb = getWorkbook();
		sheet = wb.getSheet(sheetname);
		
		return sheet;
	}
	
	public static int rowcount(String sheetname)
	{
		sheet = getSheet(sheetname);
		int rowCount = sheet.getLastRowNum() + 1;
		return rowCount;
	}
	
	
	public static String getValue(String sheetname, int rownum, int colnum)
	{
		sheet = getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		String value = null;
		value = row.getCell(colnum).toString();
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
