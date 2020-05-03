package com.optum.icube.atdd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	static String path = "C:\\Users\\bnandira\\Documents\\TestDataLocation\\PracticeData.xlsx";

	public static void getTestData() throws IOException {

		System.out.println("Data Processing From File" + path);
		FileInputStream summaryFile = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(summaryFile);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			if (row.getRowNum() == 0) {
				continue; // TO skip the header parts
			}
			int rowNum = row.getRowNum();
			// System.out.println("Row Number:" +rowNum);
			TestForm tf = new TestForm();
			// For each row, iterate through all the columns
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				// Check the cell type and format accordingly

				if (cell.getColumnIndex() == 0) {
					tf.setUserName(cell.getStringCellValue());
				}else if (cell.getColumnIndex() == 1) {
					tf.setPassword(cell.getStringCellValue());
				}
				/*switch (cell.getCellType()) {

				case Cell.CELL_TYPE_STRING:
					if (cell.getColumnIndex() == 3) {
						tf.setu(cell.getStringCellValue());
						summaryMap.put(rowNum, summaryData);
					}
					if (cell.getColumnIndex() == 10) {
						summaryData.setSummaryPlan(cell.getStringCellValue());
						summaryMap.put(rowNum, summaryData);
					}
					if (cell.getColumnIndex() == 43) {
						summaryData.setSummaryStates(cell.getStringCellValue());
						summaryMap.put(rowNum, summaryData);
					}
					break;

				}*/
			}
		}
		/*for (BenifitSummaryMetadata data : summaryMap.values()) {
			System.out.println(data);
			summaryList.add(data);

		}*/
		summaryFile.close();
	}
}