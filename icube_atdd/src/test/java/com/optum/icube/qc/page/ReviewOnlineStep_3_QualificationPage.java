package com.optum.icube.qc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


/***
 * 
 * @author prao1012
 *
 */

public class ReviewOnlineStep_3_QualificationPage extends BasePage {

	// I need to get Other Elements here

	@FindBy(id = "memberAdmitted2")
	private WebElement memberAdmittedYes;

	@FindBy(id = "memberAdmitted1")
	private WebElement memberAdmittedNo;

	@FindBy(xpath = ".//*[@id='preQualificationForm']/fieldset/fieldset[1]/div[4]/img")
	private WebElement admitCalendar;

	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[1]/a")
	private WebElement calendarDatetoSelect;

	@FindBy(id = "AdmitDate")
	private WebElement admitDate;

	@FindBy(id = "pdcSearch")
	private WebElement primaryDiagnosis;

	@FindBy(id = "ui-id-5")
	private WebElement diagnosisUitag;

	@FindBy(id = "involuntary2")
	private WebElement involuntaryAdmissionYes;

	@FindBy(id = "involuntary1")
	private WebElement involuntaryAdmissionNo;

	@FindBy(id = "prgmLocCode")
	private WebElement prgmLocCode;

	@FindBy(id = "submit")
	private WebElement proceedToStep4;
	
	WebDriverWait wait= new WebDriverWait(webDriver,90000);

	public void dataUnderQualifypage(String memberAdmited, String admitDt, String diagCode, String description,
			String invAdmit, String loc) throws InterruptedException {
		
			if (waitForAjaxResponse())  {
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
			if (memberAdmited.equalsIgnoreCase("Yes")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.id("memberAdmitted2")));
				memberAdmittedYes.click();
				wait.until(ExpectedConditions.elementToBeClickable(By.id("memberAdmitted2")));
				memberAdmittedYes.click();
				memberAdmittedYes.click();
				} 
			else if (memberAdmited.equalsIgnoreCase("Yes")){
				memberAdmittedYes.click();	
				Thread.sleep(2000);
				admitDate.sendKeys(admitDt);
			}
			}
			else if (invAdmit.equalsIgnoreCase("No")) {
				memberAdmittedNo.click();
			}
			
			admitDate.sendKeys(admitDt);
			
			// selecting the autoSuggested diagnosis
			selectAutoSuggestedDiagnois(diagCode, description);
			if (invAdmit.equalsIgnoreCase("Yes")) {
				involuntaryAdmissionYes.click();
			} else if (invAdmit.equalsIgnoreCase("No")) {
				involuntaryAdmissionNo.click();
			}
			selectDropdownByDisplaytext(prgmLocCode, loc);
			memberAdmittedYes.click();
			admitDate.sendKeys(admitDt);
			involuntaryAdmissionNo.click();
			//proceedToStep4.click();
			proceedToStep4.click();
		}

	

	public void selectAutoSuggestedDiagnois(String diagCode,
			String description) {
		if (waitForElementFrame(primaryDiagnosis, 5000)) {
			primaryDiagnosis.sendKeys(diagCode);
			for (WebElement diagnosisDescription : diagnosisUitag.findElements(By.tagName("li"))) {
				if (waitForElementFrame(diagnosisDescription, 5000)) {
					if (diagnosisDescription.getText().equals(description)) {
						diagnosisDescription.findElement(By.tagName("div")).click();
						break;
					}
				}
			}
		}
	}
}
