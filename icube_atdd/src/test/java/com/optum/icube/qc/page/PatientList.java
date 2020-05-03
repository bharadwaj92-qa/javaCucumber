package com.optum.icube.qc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatientList extends BasePage{

	/*@FindBy(xpath = ".//*[@href='tmo?qcId=618']")
	  private WebElement concLink;*/
	
	@FindBy(xpath = ".//*[@href= 'discharge?qcId=592']")
	  private WebElement dischargeLink;
	
	public void MemberListClick(String MemName) throws InterruptedException{
		Thread.sleep(10000);
		webDriver.findElement(By.xpath("//th[@id='"+MemName+"']/following-sibling::td[3]//li[1]//span[2]")).click();
		//((JavascriptExecutor)webDriver).executeScript("document.getElementByXpath('.//*[@href='tmo?qcId=604']').click()");
		//concLink.click();
		
	}
	
	
	public void DischargeHyperlink(String MemName) throws InterruptedException {
		
		Thread.sleep(10000);
		webDriver.findElement(By.xpath("//th[@id='"+MemName+"']/following-sibling::td[3]//li[2]//span[2]")).click();
		//dischargeLink.click();
	}
	
}

