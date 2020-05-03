package com.optum.icube.atdd.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Config {

  private static Properties config;
  
  private static ArrayList errorMessage;
  private static File errorFile;
  private static Path file ;
  private static int countScenrio;

  static {
    try {
      config = new Properties();
      String filePath = System.getProperty("propertyFilePath");
      filePath = (filePath == null) ? System.getProperty("user.dir") + "/src/test/resources/ICUBE/" : filePath;
      String propertyFiles = System.getProperty("propertyFiles");
      if (propertyFiles == null) {
        propertyFiles = "config.properties";
      }
      //String[] fileNames = StringUtils.split(System.getProperty("propertyFiles"), ",");
      String[] fileNames = {"browser","config", "icubedbconfig"};
      for (int i = fileNames.length - 1; i >= 0; i--) {
        String fileName = fileNames[i].trim();
        if (!fileName.endsWith(".properties")) {
          fileName += ".properties";
        }
        File file = new File(filePath, fileName);
        FileInputStream fileInput = new FileInputStream(file);
        config.load(fileInput);
      }
      config.putAll(System.getProperties());
      errorMessage = new ArrayList();
      errorFile = new File ("C://ATDD_PE_QA//Status_File");
      file = Paths.get(errorFile.getName());

    
            
          

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Return defaultValue if the property is not found in the supplied property file or system property
   * @param propertyName
   * @param defaultValue
   * @return
   */
  public static String getProperty(String propertyName,
                                   String defaultValue) {
    String property = config.getProperty(propertyName);
    return property = property == null ? defaultValue : defaultValue;
  }

  public static String getProperty(String propertyName) {
    return config.getProperty(propertyName);
  }

  /**
   * Return a group of properties that have the same prefix
   * @param groupPrefix
   * @return
   */
  public static Properties getPropertyGroup(String groupPrefix) {
    Properties groupProperties = new Properties();
    Properties allProperties = config;
    Set<Entry<Object, Object>> entrySet = allProperties.entrySet();
    for (Entry<Object, Object> entry : entrySet) {
      String property = (String)entry.getKey();
      if (property.startsWith(groupPrefix + ".")) {
        groupProperties.put(StringUtils.substringAfter(property, groupPrefix + "."), entry.getValue());
      }
    }
    return groupProperties;
  }
  public static void  setErrorMessage(String propertyName ) {
          errorMessage.add(propertyName);
   
  }

  public static void  setCountScenrio(int countScenrioValue ) {
   countScenrio = countScenrioValue + 1;

}
  
  public static int  getCountScenrio( ) {
    return countScenrio ;

 }
  public static void writeStatusFile (){
          
                       try {
                Files.write(file, errorMessage, Charset.forName("UTF-8"));
              System.out.println("hhhh");
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
          
          
  }
  
  public static void deleteFiles(){
          
          
          File[] filesExcel = new File(System.getProperty("user.dir")+"//target//test-classes//features//PE_Smoke//").listFiles();
                        for (File file1 : filesExcel) {
                        if (file1.isFile()) {
                                if (!file1.getName().equalsIgnoreCase("AALogin.feature")){
                                        file1.delete();
                                }
                                
                        }
                }
  }

  public static int countFiles(){
    
    
    File[] filesExcel = new File(System.getProperty("user.dir")+"//target//test-classes//features//").listFiles();
                return filesExcel.length ;
}

 

}
