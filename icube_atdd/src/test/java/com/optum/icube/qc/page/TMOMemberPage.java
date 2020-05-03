package com.optum.icube.qc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TMOMemberPage extends BasePage{

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
	  
	  @FindBy(id = "memberTabSaveDraftButton")   
	  private WebElement MemSaveDraftButton;
	  
	  @FindBy(id = "memberTabNextButton")
	  private WebElement memberTabNextButton;
	  
	  @FindBy(xpath = "html/body/div[7]/div[3]/div/button")
	  private WebElement tmoDraftOKbutton;
	  
	  
	
	  public void provideMbrDetails(String memberPh) throws InterruptedException{
		  if (waitForAjaxResponse()&&(waitForElementFrame(memberTabNextButton, 3000))){
              Thread.sleep(6000);

	  memberContactPh.sendKeys(memberPh);
	  legalGuardianNo.click();
	  memberTabNextButton.click();
	  Thread.sleep(3000);
	  
		  } 
	  
  }
	  public void doSaveDraft(){
		  
		  MemSaveDraftButton.click();
		  tmoDraftOKbutton.click();
		  memberTabNextButton.click();
		  
	  }
	  
}

	  
	  
	  

