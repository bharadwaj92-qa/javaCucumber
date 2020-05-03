package com.optum.icube.qc.stepdef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.slf4j.LoggerFactory;

import com.optum.icube.atdd.util.Config;
import com.optum.icube.atdd.util.ExcelParsingFeatureCreation;
import com.optum.icube.atdd.util.WebDriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;




/***
 * 
 * @author prao1012
 *
 *
 */



public class AtddHook {
  
    
  @Before
  /***
   * 
   * @param scenario
   *  We are attaching the screenshot in test report if test-case failed
   */
  
  public void prepareRemoteDriver(Scenario scenario) throws IOException{
   
    Config.setCountScenrio(1);
   
  

     WebDriverFactory.senerioName = scenario.getName();
         
   
  }

  
  @After
  /***
   * 
   * @param scenario
   *          We are attaching the screenshot in test report if test-case failed
   */
 
  
  public void attachTheScreenShot(Scenario scenario) {
  
   
    if (scenario.isFailed()) {
      
     
      WebDriver webDriver = WebDriverFactory.getWebDriver();
      try {
        scenario.write("Current Page URL is" + webDriver.getCurrentUrl());
        byte[] screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES);
       
        Config.setErrorMessage(" Scenerio Name :"+scenario.getName()+"  Below is the screen shot for the same ");
        scenario.embed(screenshot, "image/jpeg");
        
      } catch (WebDriverException we) {
        LoggerFactory.getLogger(this.getClass()).error("Unable to attach screenshot", we);
        throw new RuntimeException(we);
      }
    }
    
    else {
      
      WebDriver webDriver = WebDriverFactory.getWebDriver();
      try {
        scenario.write("Current Page URL is" + webDriver.getCurrentUrl());
        byte[] screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES);
       
        Config.setErrorMessage(" Scenerio Name :"+scenario.getName()+" Passed  ");
        scenario.embed(screenshot, "image/jpeg");
       
        
        
      } catch (WebDriverException we) {
        LoggerFactory.getLogger(this.getClass()).error("Unable to attach screenshot", we);
        throw new RuntimeException(we);
      }

      
    }
    
    if (Config.getCountScenrio() == Config.countFiles() )
      
    {
      Config.writeStatusFile();
      Config.deleteFiles();
      
    }
   
    
  }

}
