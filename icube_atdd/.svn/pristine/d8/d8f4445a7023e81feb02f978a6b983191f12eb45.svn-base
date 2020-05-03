package com.optum.icube.atdd.util;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParsingFeatureCreation {
  
  

 public static void main (String arg[]) throws IOException{
   CreateFeatureFile () ;
 }

  

        public static void CreateFeatureFile () throws IOException {
                try {
                        
                  

                  String excelFilePath =  Config.getProperty("Excel_file_location");//"C://ATDD_PE_QA//Excel_Data";
                  String DataFilelocation = Config.getProperty("Data_file_location"); //"C://ATDD_PE_QA//FeatureFiles" 
                  String [] featureExecute = Config.getProperty("Feature_to_run").split(","); //"C://ATDD_PE_QA//FeatureFiles" 


                  File[] filesExcel = new File(excelFilePath).listFiles();
                  File excel = new File(excelFilePath);
                  for (File file1 : filesExcel) {
                          if (file1.isFile()) {
                                  excel = file1;
                          }
                  }

                  // File excel = new File(excelFilePath);
                  FileInputStream inputStream = new FileInputStream(excel);

                  Workbook workbook = new XSSFWorkbook(inputStream);
                  
                  ///
                  
                  HashMap<String, String> orderList = new HashMap<String, String>();
                  HashMap<String, String> execute = new HashMap<String, String>();
                  
                  Sheet firstSheettest =   workbook.getSheet("Driver_Sheet");
                  Iterator<Row> iteratorTest = firstSheettest.iterator();
                  
                  
                  while (iteratorTest.hasNext()) {
                    Row nextRowTest = iteratorTest.next();
                    orderList.put(nextRowTest.getCell(1).getStringCellValue().trim(),nextRowTest.getCell(0).getStringCellValue().trim());
                    execute.put(nextRowTest.getCell(1).getStringCellValue().trim(),nextRowTest.getCell(2).getStringCellValue().trim());
                          
                  }


                  File[] files = new File(DataFilelocation).listFiles();
                  //If this pathname does not denote a directory, then listFiles() returns null. 

                  String fileName = null ;

                  for (File file : files) {
                          if (file.isFile()) {
                                  fileName = file.getName();
                          }
                          
                          String fileNameText = fileName.replace(".feature", "").trim();
                          
                          if ("Yes".equalsIgnoreCase((String)execute.get( fileNameText))) {
                            
                        
                         
                          File file2 =new File(System.getProperty("user.dir")+"//target//test-classes//features//PE_Smoke//"+orderList.get(fileNameText)+fileName);


                          FileInputStream inStream = new FileInputStream(file);
                          



                          FileOutputStream outStream = null;                              


                          outStream = new FileOutputStream(file2); 


                          byte[] buffer = new byte[1024];

                          int length;
                          while ((length = inStream.read(buffer)) > 0){
                                  outStream.write(buffer, 0, length);
                          }

                          if (inStream != null)inStream.close();
                          // if (outStream != null)outStream.close();

                          System.out.println("File Copied..");

                          int rowCount=0;

                          /////
                          StringBuffer test = new StringBuffer();
                        
                          Sheet firstSheet = workbook.getSheet(fileName.replace(".feature", "").trim());
                          if (firstSheet!=null){
                          Iterator<Row> iterator = firstSheet.iterator();
                         
                                while (iterator.hasNext()) {
                                  Row nextRow = iterator.next();
                                  rowCount ++ ;
                                  Iterator<Cell> cellIterator = nextRow.cellIterator();
                                  test.append(System.getProperty("line.separator"));
                                  // test.append("/n");   
                                  if (nextRow !=null){
                                      if ( nextRow.getCell(0) !=null && (!"NO".equalsIgnoreCase(nextRow.getCell(0).getStringCellValue()) && !"".equalsIgnoreCase(nextRow.getCell(0).getStringCellValue()) )){
                                        test.append("|");
                                        while (cellIterator.hasNext()) {
                                          Cell cell = cellIterator.next();
                                          if (cell.getColumnIndex()> 0){
                                        //  test.append("|");
                                          switch (cell.getCellType()) {
                                          case Cell.CELL_TYPE_STRING:
                                                  test.append(cell.getStringCellValue()+"| ");
                                                  System.out.print(cell.getStringCellValue());
                                                  break;
                                          case Cell.CELL_TYPE_BOOLEAN:
                                                  test.append(cell.getStringCellValue()+"| ");
                                                  break;
                                          case Cell.CELL_TYPE_NUMERIC:
                                                  test.append(cell.getNumericCellValue()+"| ");
                                                  break;
                                                  
                                          }
                                          System.out.print(" - ");
                                  }}
                                  System.out.println();
                          }}}



                                PrintWriter p = new PrintWriter(outStream) ;
                                p.println(test.toString());
                                p.flush();
                                outStream.flush();
                                outStream.close();
                                
                                  //outStream..write("");
                                Config.setErrorMessage("Feature for the following Name is Created For Execution   "+fileName+"  // No of records for Testing picked from the Excel ("+rowCount+")");


                          } }
                        // workbook.close();
                        inputStream.close();    
                        
                      
                        }
                } catch (Exception e) {
                  
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }}

}

