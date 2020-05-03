package com.optum.icube.atdd.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDataProvider {

  public static List<HashMap<String, String>> getTestData() {

    List<HashMap<String, String>> testData = new ArrayList<>();

    HashMap<String, String> testDataDetails = new HashMap<String, String>();
    testDataDetails.put("OptumId", "bnandira");
    testDataDetails.put("Password", "Bharath@32");
    testData.add(testDataDetails);

    /*
     * try{
     * 
     * FileInputStream fs = new FileInputStream("C:\\EMBI-WorkSpace\\atdd\\src\\test\\resources\\testdata\\PE_TestData.xlsx"); XSSFWorkbook workbook = new
     * XSSFWorkbook(fs); XSSFSheet sheet = workbook.getSheet("PESignIn"); Row headRow = sheet.getRow(0);
     * 
     * for (int i=1; i<sheet.getPhysicalNumberOfRows(); i++) { Row currentRow = sheet.getRow(i); HashMap<String, String> testDataDetail = new HashMap<String,
     * String>(); for(int j=0; j<currentRow.getPhysicalNumberOfCells(); j++){ Cell currentCell = currentRow.getCell(j);
     * 
     * switch (currentCell.getCellType()){ case Cell.CELL_TYPE_STRING: System.out.println(currentCell.getBooleanCellValue() +"\t");
     * testDataDetails.put(headRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue()); break; } } testData.add(testDataDetails); } fs.close();
     * }catch(Exception e){ e.printStackTrace(); }
     */
    return testData;
  }

}
