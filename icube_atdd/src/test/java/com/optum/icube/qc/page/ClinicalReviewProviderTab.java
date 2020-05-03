package com.optum.icube.qc.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClinicalReviewProviderTab extends BasePage {

  @FindBy(id = "TMOFacilityPhone")
  private WebElement FacilityContactPhone;

  @FindBy(id = "AttendingMDLastName")
  private WebElement AttendingMDLastName;

  @FindBy(id = "AttendingMDFirstName")
  private WebElement AttendingMDFirstName;

  @FindBy(id = "AttendingMDPhone")
  private WebElement AttendingMDPhone;

  @FindBy(id = "AttendingMDAddress")
  private WebElement AttendingMDAddress;

  @FindBy(id = "AttendingMDTIN")
  private WebElement AttendingMDTIN;

  @FindBy(id = "urname")
  private WebElement URname;

  @FindBy(id = "TMOURPhone")
  private WebElement URPhone;

  @FindBy(id = "providerTabNextButton")
  private WebElement nextButton;

  @FindBy(xpath = ".//*[@id='AttendingMDSearchButton']")
  private WebElement MDSearchButton;

  @FindBy(className = "ui-dialog-buttonset")
  private List<WebElement> buttonList; // index 0 == OK, 1== cancel, 2 == Other

  @FindBy(xpath = "html/body/div[5]/div[3]/div/button[2]")
  private WebElement Cancel;

  @FindBy(xpath = "html/body/div[5]/div[3]/div/button[3]")
  private WebElement Other;

  @FindBy(id = "md_table")
  private WebElement mdTable;

  public void provideProviderDetails(String URnm,
                                     String URPh) {
    if (waitForAjaxResponse() && waitForWebElement(MDSearchButton)) {

      MDSearchButton.click();
      if (waitForWebElement(mdTable)) { 
        doMDSearch();
      }
    }
  }

  public void doMDSearch() {
    WebElement mdTbody = mdTable.findElement(By.tagName("tbody"));
    if (waitForWebElement(mdTbody.findElements(By.tagName("tr")).get(0))) {
      mdTbody.findElements(By.tagName("tr")).get(0).click();
      if (waitForWebElement(buttonList.get(0))) {
        buttonList.get(0).findElement(By.tagName("button")).click();
      }
    }

  }

  public void clickNextButton() {
    AttendingMDLastName.getAttribute("value");
    if (waitForWebElement(nextButton) && !AttendingMDLastName.getAttribute("value").isEmpty()) {
      nextButton.click();
    }
  }
}
