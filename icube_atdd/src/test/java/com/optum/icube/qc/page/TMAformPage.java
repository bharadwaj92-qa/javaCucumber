package com.optum.icube.qc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TMAformPage extends BasePage {

	@FindBy(id = "AttendingMDSearchButton")
	private WebElement AttendingMD;

	@FindBy(xpath = "html/body/div[5]/div[3]/div/button[3]")
	private WebElement AtndgMDOther;

	@FindBy(id = "AttendingMDLastName")
	private WebElement AtndgMDLastName;

	@FindBy(id = "AttendingMDFirstName")
	private WebElement AtndgMDFirstName;

	@FindBy(id = "AttendingMDPhone")
	private WebElement AtndgMDPhone;

	@FindBy(id = "AttendingMDTIN")
	private WebElement AtndgMDTIN;

	@FindBy(id = "AttendingMDAddress")
	private WebElement AtndgMDAddress;

	@FindBy(id = "URName")
	private WebElement Urname;

	@FindBy(id = "URPhone")
	private WebElement Urphone;

	@FindBy(id = "rdo_mh")
	private WebElement BenfTypeMH;

	@FindBy(id = "Confirm")
	private WebElement TMASubmit;

	@FindBy(id = "saveAdmitButton")
	private WebElement SubmitTMA;

	@FindBy(id = "md_table")
	private WebElement mdTable;

	@FindBy(tagName = "button")
	private List<WebElement> buttonList;
	
	@FindBy(xpath = "html/body/div[4]/div[3]/div/button")
	private WebElement TMAConfPopOK;
	
	WebDriverWait wait= new WebDriverWait(webDriver,90000);

	public void TMASubmit(String URName, String URPhone) throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveAdmitButton")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("saveAdmitButton")));
		
		Thread.sleep(3000);
		
		if (waitForAjaxResponse() && waitForWebElement(SubmitTMA)) {

			AttendingMD.click();
			Thread.sleep(4000);
			if (waitForWebElement(mdTable)) {
				doMDSearch();
			}
			Urname.sendKeys(URName);
			Urphone.sendKeys(URPhone);
			BenfTypeMH.click();
			TMASubmit.click();
			SubmitTMA.click();
			//Thread.sleep(5000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[3]/div/button")));
			//TMAConfPopOK.click();
			
			
		}
	}

	public void doMDSearch() throws InterruptedException {
		WebElement mdTbody = mdTable.findElement(By.tagName("tbody"));
		Thread.sleep(7000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));
		if (waitForWebElement(mdTbody.findElements(By.tagName("tr")).get(0))) {
			mdTbody.findElements(By.tagName("tr")).get(0).click();
				for (WebElement webElement : buttonList) {
					if(webElement.getText().contains("OK")){
						webElement.click();
						break;
						//buttonList.get(0).findElement(By.tagName("button")).click();
					}
				}
				
		}

	}

}