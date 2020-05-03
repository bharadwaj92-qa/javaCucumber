package com.optum.icube.qc.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/***
 * 
 * @author prao1012
 *
 */

public class PreQualificationTemplate extends BasePage {

  // I need to get Other Elements here

  @FindBy(how = How.ID, using = "pdcSearch")
  private WebElement primaryDiagnosis;

  @FindBy(how = How.XPATH, using = "ui-id-4")
  private List<WebElement> diagnosisList;

  @FindBy(how = How.ID, using = "involuntary2")
  private WebElement involuntaryAdmission_yes;

  @FindBy(how = How.ID, using = "involuntary1")
  private WebElement involuntaryAdmission_no;

  @FindBy(how = How.ID, using = "prgmLocCode")
  private Select level_of_Care_being_requested;

  @FindBy(how = How.ID, using = "submitButton")
  private WebElement proceed_to_step_4;

}
