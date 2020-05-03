package com.optum.icube.qc.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TMOConfPage extends BasePage{

	@FindBy(id = "understandRequestYes")
	private WebElement Disclaimer_yes;
	
	@FindBy(id = "btn_attest")
	private WebElement AttestCheckbox;
	
	
	@FindBy(id = "confirmationSubmitButton")
	private WebElement confPageSubmitButton;
	
	@FindBy(xpath=".//*[@id='qcCrId']")
	private WebElement tmoConfNum; 
	
	@FindBy(xpath="html/body/div[7]/div[3]/div/button")
	private WebElement tmoConfPopOk;
	
	public void provideConfDetails() throws InterruptedException{
        if (waitForAjaxResponse()&&(waitForElementFrame(confPageSubmitButton, 3000))){
            Thread.sleep(3000);
        }
        Thread.sleep(3000);
		Disclaimer_yes.click();
		AttestCheckbox.click();
		
		
		
	}
	
public void clikSubButton() throws InterruptedException{
		
		if (waitForAjaxResponse()&&(waitForElementFrame(confPageSubmitButton, 3000))){
            Thread.sleep(3000);
        }
			confPageSubmitButton.click();
			System.out.println("Submit Button clicked");
			
		}

	public void provideConfPop() throws InterruptedException{
		
		
		Thread.sleep(10000);
        /*Alert alt= webDriver.switchTo().alert();
        String val= alt.getText();
         System.out.println("the value is" + val);*/
			String val= tmoConfNum.getText();
            System.out.println("TMO is submitted successfully" + val);
            tmoConfPopOk.click();
           
          
        }
}
	
