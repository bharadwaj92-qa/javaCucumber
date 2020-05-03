package com.optum.icube.atdd.util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class PracticeReading {

	static String path = "C:\\Users\\bnandira\\Documents\\TestDataLocation\\PracticeData.xlsx";


	public static void getTestData() throws IOException{
		System.out.println("Data Processing From File" + path);
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int lastRow = sheet.getLastRowNum();
		System.out.println("Row Number:" +lastRow);
		
		
		
	}
	
	

}
