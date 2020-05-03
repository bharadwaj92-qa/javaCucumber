package com.optum.icube.qc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MainMenuClick extends BasePage{
	
	
	@FindBy(xpath = ".//*[@href='/trans/mainMenu.uol']")
	private WebElement MainMenu;
	
	WebDriverWait wait= new WebDriverWait(webDriver,90000);
	public void clickMenuLink() {
		if(waitForAjaxResponse() && (waitForElementFrame(MainMenu, 3000))){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@href='/trans/mainMenu.uol']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@href='/trans/mainMenu.uol']")));
			MainMenu.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@rel='tcontent1']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@rel='tcontent1']")));
			System.out.println("MainMenu page is available");
			}
		 }

	}

