package com.optum.icube.qc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TMOServicePage extends BasePage {

	@FindBy(id = "addlUnits")
	  private WebElement NoOfDaysReq;
  @FindBy(id = "involuntary2")
	  private WebElement Involuntary;
  @FindBy(id = "involuntary1")
	  private WebElement Voluntary;
	@FindBy(id = "courtOrdered1")
	  private WebElement YesCourtOrdered;
  @FindBy(id = "courtOrdered2")
	  private WebElement NoCourtOrdered;
  @FindBy(id = "pdcSearch")
	  private WebElement primaryDiagnosis;
	@FindBy(id = "ad1Search")
	  private WebElement AddnlDiag1;
	@FindBy(id = "ad2Search")
	  private WebElement AddnlDiag2;
	@FindBy(id = "activeMedCondYes")
	  private WebElement YesActvMediCond;
  @FindBy(id = "activeMedCondNo")
	  private WebElement NoActvMediCond;
  @FindBy(id = "medDiagnoses")
	  private WebElement DescMediDiag;
  @FindBy(id = "medsMedicalCond")
	  private WebElement DescMediForMediConds;
  @FindBy(id = "primPrecipReasonCode")
	  private WebElement PrimPrecipReasonCd;
  @FindBy(id = "primPrecipOthReason")
	  private WebElement PrimPrecipOtherReasonCd;
  @FindBy(id = "addlDetailForAdmit")
	  private WebElement ProvAddlDetailForAdmit;
  @FindBy(id = "subContributeForAdmit1")
	  private WebElement SubContributeForAdmit;
	@FindBy(id = "subContributeForAdmit2")
	  private WebElement SubNotContributeForAdmit;
	@FindBy(id = "detailSymptTreatment")
	  private WebElement CurrentUncontrolSymptoms;
	
	
	
	@FindBy(id = "serviceTabNextButton")
	  private WebElement serviceTabNextButton;
	@FindBy(id = "serviceTabSaveDraftButton")
	  private WebElement ServiceSaveDraftButton;
	  @FindBy(xpath = "html/body/div[7]/div[3]/div/button")
	  private WebElement tmoDraftOKbutton;
	
	
	 public void provideDaysReq(String AddtnlDaysReq) throws InterruptedException{
         if (waitForAjaxResponse()&&(waitForElementFrame(NoOfDaysReq, 3000))){
             Thread.sleep(6000);

         }
		 NoOfDaysReq.sendKeys(AddtnlDaysReq);
		 Involuntary.click();
		 NoCourtOrdered.click();
		 NoActvMediCond.click(); 
		 selectDropdownByDisplaytext(PrimPrecipReasonCd, "Inflicted harm/injury to self as suicide attempt");
	 }
	 
	 public void provideAddtnlSpecificEvent(String AddtnlDetailSpecificEvent) throws InterruptedException{
		 if(waitForElementFrame(ProvAddlDetailForAdmit, 3000)){
             Thread.sleep(5000);
		 }
		 ProvAddlDetailForAdmit.sendKeys(AddtnlDetailSpecificEvent);
		 SubNotContributeForAdmit.click();
	 }
	 public void providerUncontrolledSympt(String CurrentUncontrolledSymptoms) throws InterruptedException{
		 if(waitForElementFrame(CurrentUncontrolSymptoms, 3000)){
             Thread.sleep(3000);
		 }
		 CurrentUncontrolSymptoms.sendKeys(CurrentUncontrolledSymptoms);
		 serviceTabNextButton.click();
		 Thread.sleep(3000);
	 }
	
	 public void doSaveDraft() throws InterruptedException{
		 Thread.sleep(3000);
		  ServiceSaveDraftButton.click();
		  if (waitForElementFrame(tmoDraftOKbutton, 5000)) {
			  tmoDraftOKbutton.click();
		  }
		  serviceTabNextButton.click();
		  
	  }
	 
	 public void provAddtldays(String AddtnlDaysReq){
		 
		 NoOfDaysReq.sendKeys(AddtnlDaysReq);
	 }
}

