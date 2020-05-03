package com.optum.icube.qc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.optum.icube.atdd.util.WebDriverFactory;

/***
 * 
 * @author prao1012 This is HTML DOM page for Provider Express Main Header after
 *         login
 *
 */

public class PEMainMenu extends BasePage {
	
	//@FindBy(xpath = ".//*[@id='menu3']/img[2]")
	  @FindBy(id = "menu3")
	  private WebElement Auths;

	  //@FindBy(id = ".//*[@id='authRequest']/div[2]")
	  @FindBy(id = "authRequest")
	  private WebElement ReviewOnline;

	/*
	 * We need to pass the MENU link text to this method
	 */
	public void clickMenuLink(String menuLink) {

			waitForElementFrame(By.linkText(menuLink), 30000);
			WebElement element = webDriver.findElement(By.linkText(menuLink));
			element.click();
	}
	public void clickReviewOnline(){
		
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getWebDriver(), 200);
	    try {
	      wait.until(ExpectedConditions.visibilityOf(Auths));
	      Auths.click();
	      wait.until(ExpectedConditions.visibilityOf(ReviewOnline));
		  ReviewOnline.click();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
		

		
		/*Auths.click();
		//ReviewOnline.click();
		

	        Actions action = new Actions(webDriver);
	        action.moveToElement(Auths).build().perform();

	        ReviewOnline.click();*/

		
	
	}		

}
