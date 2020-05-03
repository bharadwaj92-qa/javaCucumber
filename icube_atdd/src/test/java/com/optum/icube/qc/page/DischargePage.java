package com.optum.icube.qc.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DischargePage extends BasePage {

	@FindBy(id = "AttendingMDSearchButton")
	private WebElement AttendingMD;
	
	@FindBy(xpath = "//button[1]")
	private WebElement AttendingMDOK;
	
	

	@FindBy(xpath = "html/body/div[5]/div[3]/div/button[3]")
	private WebElement atndgMDOther;

	@FindBy(id = "AttendingMDLastName")
	private WebElement atndgMDLastName;

	@FindBy(id = "AttendingMDFirstName")
	private WebElement atndgMDFirstName;

	@FindBy(id = "AttendingMDPhone")
	private WebElement atndgMDPhone;

	@FindBy(id = "AttendingMDTIN")
	private WebElement atndgMDTIN;

	@FindBy(id = "AttendingMDAddress")
	private WebElement atndgMDAddress;

	@FindBy(id = "PrimaryDiagnosisSearch")
	private WebElement primaryDiagnosis;

	@FindBy(id = "AdmitDate")
	private WebElement admitDate;

	@FindBy(name = "qcDischargeMBean.dischargeDate")
	private WebElement dischargeDate;

	@FindBy(id = "DaysSessionsUsed")
	private WebElement daysSessionsUsed;

	@FindBy(id = "DischargeDisposition")
	private WebElement dischargeDisposition;

	@FindBy(id = "rdo_apptScheduled_no")
	private WebElement apptScheduledNO;

	@FindBy(id = "Confirm")
	private WebElement attestationCheckBox;

	@FindBy(id = "saveDischargeButton")
	private WebElement dcSubmitButton;

	@FindBy(id = "md_table")
	private WebElement mdTable;

	@FindBy(tagName = "button")
	private List<WebElement> buttonList;

	@FindBy(id = "ui-id-5")
	private WebElement diagnosisUitag;
	
	@FindBy(className ="ui-dialog-buttonset")
	private List<WebElement> buttonList1;

	WebDriverWait wait= new WebDriverWait(webDriver,90000);

	
		

	public void MDSearch() throws InterruptedException {
		
		
		Thread.sleep(3000);

		if (waitForAjaxResponse() && waitForWebElement(dcSubmitButton)) {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("AttendingMDSearchButton")));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("AttendingMDSearchButton")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveDischargeButton")));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("saveDischargeButton")));
			AttendingMD.click();
			//AttendingMD.click();
			Thread.sleep(3000);
			
			
			/*if (waitForWebElement(mdTable)) {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("md_table")));
				wait.until(ExpectedConditions.elementToBeClickable(By.id("md_table")));
				Thread.sleep(3000);
				LetMDSearch();
				
				 * WebElement mdTbody =
				 * mdTable.findElement(By.tagName("tbody")); if
				 * (waitForWebElement(mdTbody.findElements(By.tagName("tr")).get
				 * (0))) {
				 * mdTbody.findElements(By.tagName("tr")).get(0).click(); if
				 * (waitForWebElement(buttonList.get(0))) {
				 * buttonList.get(0).findElement(By.tagName("button")).click();
				 * } }
				 
			}

			// primaryDiagnosis.sendKeys(PrimaryDiag);
			// dischargeDate.sendKeys(Dischargedate);
			// daysSessionsUsed.sendKeys(Unit);
			// dischargeDisposition.sendKeys(Dischargecode);
			// dcSubmitButton.click();
*/
		}

	}

	public void LetMDSearch() {
		try {
			//Thread.sleep(5000);
			if (waitForAjaxResponse()) {
				Thread.sleep(2000);
				
				WebElement mdTbody = mdTable.findElement(By.tagName("tbody"));
				
				if (waitForWebElement(mdTbody.findElements(By.tagName("tr")).get(0))) {
					//Thread.sleep(4000);
					mdTbody.findElements(By.tagName("tr")).get(0).click();
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-dialog-buttonset")));
					//wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-dialog-buttonset")));
					Thread.sleep(3000);
					
					if (waitForWebElement(buttonList.get(0))) {
						System.out.println("OK is clicked1");
						for (WebElement webElement : buttonList) {
							
							if (webElement.getText().contains("OK")) {
								System.out.println("OK is clicked2");
								webElement.click();
								webElement.click();
								break;
								// buttonList.get(0).findElement(By.tagName("button")).click();

							}

						}
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void selectAutoSuggestedDiagnois(String primaryDiag, String description) throws InterruptedException {
		Thread.sleep(3000);
		if (waitForElementFrame(primaryDiagnosis, 3000)) {
			primaryDiagnosis.sendKeys(primaryDiag);
			for (WebElement diagnosisDescription : diagnosisUitag.findElements(By.tagName("li"))) {
				if (waitForElementFrame(diagnosisDescription, 3000)) {
					Thread.sleep(2000);
					if (diagnosisDescription.getText().equals(description)) {
						diagnosisDescription.findElement(By.tagName("div")).click();
						break;
					}
				}
			}
		}
	}

	
	public void dateofdischarge(String dischargedate) throws InterruptedException  {
		if (waitForAjaxResponse() && (waitForElementFrame(dcSubmitButton, 3000))) {
			Thread.sleep(2000);
			dischargeDate.sendKeys(dischargedate);
		}
	}

	public void unitused(String units) throws InterruptedException  {
		if (waitForAjaxResponse() && (waitForElementFrame(dcSubmitButton, 3000))) {
		Thread.sleep(2000);
		}
		daysSessionsUsed.sendKeys(units);
	}

	public void appointment()  {
		if (waitForAjaxResponse() && (waitForElementFrame(dcSubmitButton, 3000))) {
			//Thread.sleep(3000);
		}
		apptScheduledNO.click();
	}

	public void attestation()  {
		if (waitForAjaxResponse() && (waitForElementFrame(dcSubmitButton, 3000))) {
			//Thread.sleep(3000);
		}
		attestationCheckBox.click();
	}

	public void dischargeSubmit() throws InterruptedException  {
		if (waitForAjaxResponse() && (waitForElementFrame(dcSubmitButton, 3000))) {
			Thread.sleep(2000);
		}
		dcSubmitButton.click();
	}

	public void dcdpcode(String dischargecode)  {
		if (waitForAjaxResponse() && (waitForElementFrame(dcSubmitButton, 3000))) {
			//Thread.sleep(3000);
		}
		selectDropdownByDisplaytext(dischargeDisposition, dischargecode);
	}
}
