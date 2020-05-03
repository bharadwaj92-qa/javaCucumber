package com.optum.icube.qc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PEsecurityQuestionPage extends BasePage {

  @FindBy(id = "challengeQuestionLabelId")
  private WebElement securityQuestion;

  @FindBy(className = "challengeSecurityUserAnswerInput")
  private WebElement challengeSecurityUserAnswerInput;

  @FindBy(id = "ac")
  private WebElement skipStep;

  @FindBy(id = "authQuesSubmitButton")
  private WebElement next;

  @FindBy(id = "authQuestionWrapper")
  private WebElement securityQuestions;

  public void validateSecurityQuestion() {

    String questionCheck = securityQuestion.getText();
    if (questionCheck.equalsIgnoreCase("What was your first phone number?")) {
      challengeSecurityUserAnswerInput.sendKeys("1234");
    } else if (questionCheck.equalsIgnoreCase("What is your favorite color?")) {
      challengeSecurityUserAnswerInput.sendKeys("blue");
    } else if (questionCheck.equalsIgnoreCase("What is your mother's maiden name?")) {
      challengeSecurityUserAnswerInput.sendKeys("mom");
    } else if (questionCheck.equalsIgnoreCase("What is the name of the company of your first job?")) {
      challengeSecurityUserAnswerInput.sendKeys("UHG");
    }
    next.click();
  }

}
