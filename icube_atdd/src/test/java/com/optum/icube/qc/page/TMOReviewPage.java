package com.optum.icube.qc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TMOReviewPage extends BasePage{

	@FindBy(id = "treatment_actions")
	  private WebElement SpecificAction;
	@FindBy(id = "dischargeLocCode")
	  private WebElement DischargeLOC;
	@FindBy(id = "elos")
	  private WebElement LengthStay;
  @FindBy(id = "Discharge_Plan")
	  private WebElement DischargePlan;
  @FindBy(id = "barriers")
	  private WebElement BarrierToDC;
	@FindBy(id = "reviewTabNextButton")
	  private WebElement reviewTabNextButton;
	
	
	
	public void provideSpecificActions(String SpecificActions) throws InterruptedException{
        /*if (waitForAjaxResponse()&&(waitForElementFrame(DischargeLOC, 3000))){
            Thread.sleep(3000);
        }*/
        Thread.sleep(3000);
		SpecificAction.sendKeys(SpecificActions);
		Thread.sleep(3000);
		selectDropdownByDisplaytext(DischargeLOC, "Inpatient");
			
	}
	public void provideELOS(String ELOS) throws InterruptedException{
		if(waitForElementFrame(LengthStay, 3000)){
            Thread.sleep(3000);
		}
		LengthStay.sendKeys(ELOS);
	}
	public void provideDCPlan(String DCPlan) throws InterruptedException{
        if(waitForElementFrame(reviewTabNextButton, 3000)){
            Thread.sleep(3000);
        }
		DischargePlan.sendKeys(DCPlan);
	}
		
		public void provideBarrTODC(String BarriersToDC) throws InterruptedException{
	        if(waitForElementFrame(reviewTabNextButton, 3000)){
	            Thread.sleep(3000);
	        }
	        BarrierToDC.sendKeys(BarriersToDC);
			reviewTabNextButton.click();
			Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
}
