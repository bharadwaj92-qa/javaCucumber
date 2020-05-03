package com.optum.icube.qc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClinicalReviewMemerTab extends BasePage {

  @FindBy(id = "mbrContactPhone")
  private WebElement memberContactPh;

  @FindBy(id = "mbrContactAddr")
  private WebElement memberContactAddress;

  @FindBy(id = "rdo_LglGrdnNo")
  private WebElement legalGuardianNo;

  @FindBy(id = "rdo_LglGrdnYes")
  private WebElement legalGuardianYes;

  @FindBy(id = "guardianName")
  private WebElement guardianName;

  @FindBy(id = "guardianPhone")
  private WebElement guardianPhone;

  @FindBy(id = "guardianAddr")
  private WebElement guardianAddress;

  @FindBy(id = "memberTabNextButton")
  private WebElement memberTabNextButton;
  
  @FindBy(xpath = ".//*[@id='member']/div/fieldset/legend")
  private WebElement memberTabTitle;

  public void provideMemberDetails(String memberPh,
                                   String memberAddr,
                                   String legalGuardian) {
    if (waitForAjaxResponse() && waitForWebElement(memberContactPh) && waitForWebElement(memberContactAddress) && waitForWebElement(legalGuardianYes)) {
      this.memberContactPh.sendKeys(memberPh);
      this.memberContactAddress.sendKeys(memberAddr);
      if (legalGuardian.equalsIgnoreCase("Yes")) {
        this.legalGuardianYes.click();
      } else if (legalGuardian.equalsIgnoreCase("No")) {
        this.legalGuardianNo.click();
      }
    }
  }

  public void provideGuardianDetails(String guardianNm,
                                     String guardianPh,
                                     String guardianAddr) {
    if (this.legalGuardianYes.isSelected() && waitForAjaxResponse()) {
      this.guardianName.sendKeys(guardianNm);
      this.guardianPhone.sendKeys(guardianPh);
      this.guardianAddress.sendKeys(guardianAddr);
    }
  }

  public void proceedToClickNextButton() {
    this.memberTabNextButton.click();
  }
  
  public boolean isFIRForm(String memberTitle){
	  boolean isFIRForm = false;
	  if(memberTitle.endsWith(memberTabTitle.getText())){
		  isFIRForm = true;
	  }
	  return isFIRForm;
  }

}
