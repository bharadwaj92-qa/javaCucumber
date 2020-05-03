package com.optum.icube.qc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/****
 * 
 * @author prao1012
 *
 */

public class ReviewOnline_Step_3_Page extends BasePage {

  // I need to get Other Elements also here

  @FindBy(how = How.ID, using = "b1")
  private WebElement proceed_to_step_4;
}
