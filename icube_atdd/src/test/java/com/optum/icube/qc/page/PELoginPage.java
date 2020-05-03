package com.optum.icube.qc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/****
 * 
 * @author prao1012 This is HTML DOM page for Provider Express Login Page
 */
public class PELoginPage extends BasePage {

  @FindBy(id = "userNameId_input")
  private WebElement optum_ID_or_email;

  @FindBy(id = "passwdId_input")
  private WebElement password;
  
  @FindBy(id = "loginTypeId")
  private WebElement SigInWith;

  @FindBy(id = "SignIn")
  private WebElement signIn;
  

  public void doLogin(String userId,
                      String pwd) {
	
	  selectDropdownByDisplaytext(SigInWith, "Optum ID");
    /*optum_ID_or_email.sendKeys(userId);
    LOG.trace("Optum Id is entered in OptumId or Email Address Text box");
    password.sendKeys(pwd);
    LOG.trace("Password is entered in Password Field");
    signIn.click();
    LOG.trace("Provider Express SignIn action is performed Successfully");
    */
	  if (waitForAjaxResponse()&&(waitForElementFrame(optum_ID_or_email, 3000))){
	  optum_ID_or_email.sendKeys(userId);
	  password.sendKeys(pwd);
	  signIn.click();
	  
	  /*WebDriverWait wait = new WebDriverWait(webDriver, 60);
    wait.until(expectedURLs("action=securityQuestion", "admitRequest.uol"));

    if (webDriver.getCurrentUrl().contains("action=securityQuestion")) {
      new PEsecurityQuestionPage().validateSecurityQuestion();
    }*/

	  }
  }
}
