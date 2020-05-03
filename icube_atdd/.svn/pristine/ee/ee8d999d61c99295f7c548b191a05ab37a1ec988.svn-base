package com.optum.icube.qc.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * 
 * @author prao1012
 *
 */

public class ReviewOnlineStep_2_Page extends BasePage {
	WebDriverWait wait= new WebDriverWait(webDriver,90000);

  @FindBy(name = "submitBt")
  private WebElement proceedToStep3;

  @FindBy(id = "practiceAddress")
  private WebElement facilityAddress;

  public void selectTheFacilityAddressFromDropDown(String facilityName) {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitBt")));
	  wait.until(ExpectedConditions.elementToBeClickable(By.name("submitBt")));
    if (waitForElementFrame(facilityAddress, 3000)) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitBt")));
    	wait.until(ExpectedConditions.elementToBeClickable(By.name("submitBt")));

      Select dropDown = new Select(facilityAddress);
      List<WebElement> options = dropDown.getOptions();
      for (WebElement option : options) {
        if (!option.getText().equals("Please Select")) {
          option.click();
          break;
        }
      }
    }
  }

  public void procedToStep3() {
	  
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submitBt")));
  	wait.until(ExpectedConditions.elementToBeClickable(By.name("submitBt")));
    if (waitForElementFrame(proceedToStep3, 30000)) {
    
      proceedToStep3.click();
    }
  }

}
