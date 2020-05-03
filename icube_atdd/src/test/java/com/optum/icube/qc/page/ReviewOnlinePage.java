package com.optum.icube.qc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/***
 * 
 * @author prao1012 This is the Html DOM page of review online.
 */
public class ReviewOnlinePage extends BasePage {
	
	WebDriverWait wait= new WebDriverWait(webDriver,90000);

  @FindBy(xpath = ".//*[@id='myadmitOption'][@value='1']")
  private WebElement authAdmissionRadio;

  @FindBy(xpath = ".//*[@id='myadmitOption'][@value='2']")
  private WebElement view_my_Census;

  @FindBy(id = "submitBtnId")
  private WebElement continueButton;
  
  @FindBy(xpath= ".//*[@href='admitRequest.uol?patientNotOnCensusList']")
  private WebElement MyPatientIsNotOnCensus;
  
  public String patientListURL="https://ohpe-ua.optum.com/qc/admissions?prprId=FAC000003200&pradId=FAC000003200&pradType=001&pradEffDate=1993-06-18%2000:00:00.0&tkt=NNIz4XbsKpxsT5o4v0P4JT4bJKj8svevUDaWaf6NfVVDlRjMUzHhxXIsuqShqvvAw76rcKJTFzCzjGBDNVwGA4P_BhWeCZdJvxiUMcYM7TyvqLHBV6BNNTvo3DSgwm5gD5R6kLBESgyXAqxto19OZ0N8yIX5mxqihnZ5hdnDIS4Tvq6dYL6usVYjyOQjuq8Kqc0PtFbl5ElYPx3hBbKVF8cxepkSqb5DUXPO2bw6I4wOfZBPxgi_V269WzszvMmAAN3MymDDFTBCRr0D1plX3gqJIP0CLlSWAd0_gDDC3A5GMjB63EVSJvkxW_n5kvZaLiBSF63csR8bTbQ9wsyhS7DNWNuvtnrbUgHiTYAo_Jt1vbInLbxVcNz5Prxpcqvb5lt4Zgl5TFiTZxjVI3WR-Ax1ztB3Is8hzfQMa9A_8GG7j6V_NfGmXRjDGdXNuY9vaMExkGYB7I688C5-b0j_ekscRb_I79kAgJe7MHeQS1Mc5i166GUecQdH1QRZ1WpJMSUb--HHmSPlEpByIRsRAimIBEvKGsQpqcsGSJO7FhujmmdF_uXozj21DHzIsuqVJLIzY9a_Am1cW6YhGTPakw";
 
  public void gotoReviewOnlineStepOne() {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myadmitOption'][@value='1']")));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='myadmitOption'][@value='1']")));
    if (waitForAjaxResponse() && waitForElementFrame(authAdmissionRadio, 3000)) {
      authAdmissionRadio.click();
      LOG.trace("Selected Request an initial authorization for admission Radio ");
      continueButton.click();
      LOG.trace("Click the continue buttion to navigate the next page");
    }
  }
 public void clickMyCensus() throws InterruptedException{
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myadmitOption'][@value='2']")));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='myadmitOption'][@value='2']")));
	 Thread.sleep(3000);
	 if (waitForAjaxResponse() && waitForElementFrame(authAdmissionRadio, 3000)) {	
		 view_my_Census.click();
	 	continueButton.click();
	 }
	 //if (waitForAjaxResponse() && waitForElementFrame(authAdmissionRadio, 3000)){}
	 //Thread.sleep(7000);
	// webDriver.navigate().to(patientListURL);
	 //System.out.println("sleep start");
	 //Thread.currentThread().sleep(10000);
	 //System.out.println("sleep end");
	 
	 while (!MyPatientIsNotOnCensus.isDisplayed());
	 
	 while (!MyPatientIsNotOnCensus.isEnabled());
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@href='admitRequest.uol?patientNotOnCensusList']")));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@href='admitRequest.uol?patientNotOnCensusList']")));
	 MyPatientIsNotOnCensus.click();
	 //System.out.println("clicked");
	 
 }
 }
  
