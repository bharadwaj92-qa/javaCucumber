package com.optum.icube.qc.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TMOProviderPage extends BasePage{

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
	  private WebElement providerTabNextButton;
	  
	  @FindBy(id = "providerTabSaveDraftButton")
	  private WebElement ProvSaveDraftButton;

	  @FindBy(xpath = ".//*[@id='AttendingMDSearchButton']")
	  private WebElement MDSearchButton;

	  @FindBy(className = "ui-dialog-buttonset")
	  private List buttonList; // index 0 == OK, 1== cancel, 2 == Other

	  @FindBy(xpath = "html/body/div[5]/div[3]/div/button[2]")
	  private WebElement Cancel;

	  @FindBy(xpath = "html/body/div[5]/div[3]/div/button[3]")
	  private WebElement Other;

	  @FindBy(id = "md_table")
	  private WebElement mdTable;
	  
	  @FindBy(xpath = "html/body/div[7]/div[3]/div/button")
	  private WebElement tmoDraftOKbutton;
	  
	  
	  
	  public void provPage() throws InterruptedException{
          if (waitForAjaxResponse()&&(waitForElementFrame(providerTabNextButton, 3000))){
              Thread.sleep(5000);

		providerTabNextButton.click();
          }
	  }
		
	  public void givFacContPhone(String FacContPhone){
		  
		  FacilityContactPhone.sendKeys(FacContPhone);
		  
	  }
      public void doSaveDraft() throws InterruptedException {
		  
		  ProvSaveDraftButton.click();
		  Thread.sleep(5000);
		  tmoDraftOKbutton.click();
		  providerTabNextButton.click();
		  
	  }
}
