package com.optum.icube.qc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/****
 * 
 * @author prao1012
 *
 */
public class ReviewOnlineStep_1_Page extends BasePage {

  // Member ID Search Tab Elements

  @FindBy(xpath = ".//*[@rel='tcontent1']")
  private WebElement MemberSearch;
  
  @FindBy(name = "memberId")
  private WebElement MemID;

  @FindBy(name = "groupNumber")
  private WebElement groupNumber;

  @FindBy(xpath = ".//*[@id='admitMemberIdSearchFormBean']/table[1]/tbody/tr[5]/td[2]/input")
  private WebElement fstName;

  @FindBy(name = "dobMonth")
  private WebElement dobMonth;

  @FindBy(name = "dobDay")
  private WebElement dobDay;

  @FindBy(name = "dobYear")
  private WebElement dobYear;

  @FindBy(xpath = ".//*[@id='admitMemberIdSearchFormBean']/table[2]/tbody/tr[2]/td/input[1]")
  private WebElement proceed_to_step_2;

  @FindBy(id = "selectedPatient")
  private WebElement patientRadio;
  WebDriverWait wait= new WebDriverWait(webDriver,90000);
  public void selectTabByLink() throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@rel='tcontent1']")));
	  Thread.sleep(10000);
		 MemberSearch.click();
  }

  public void searchMemberByNameAndId(String MemberId,
                                      String FirstName) {
	 
		 
		 
		 MemID.sendKeys(MemberId);
      fstName.sendKeys(FirstName);
  }

  public void proceedToStep2() {
      proceed_to_step_2.click();
  }

  public void selectMemberFromMypatientTab(String memberId) {
    // WebElement patientRadio =
    // WebDriverFactory.getWebDriver().findElement(By.xpath(".//*[@id='selectedPatient']"));
    // if (waitForElementFrame(patientRadio, 500000) && patientRadio !=
    // null) {
    patientRadio.click();
    // }
    // if (waitForElementFrame(proceed_to_step_2, 500000) &&
    // proceed_to_step_2 != null) {
    proceed_to_step_2.click();
    // }
    /*
     * WebElement patientListTable = WebDriverFactory.getWebDriver().findElement(By.id("patientList")); if (waitForElementFrame(patientListTable, 500000) &&
     * patientListTable != null) { List<WebElement> patientTrList = patientListTable.findElements(By.tagName("tr"));
     * 
     * for (WebElement patientTr : patientTrList) { List<WebElement> patientTdList = patientTr.findElements(By.tagName("td")); for (WebElement webElement :
     * patientTdList) { if(webElement.getText().endsWith(memberId)){ patientTr.findElement(By.tagName("input")).click(); } }
     * 
     * } }
     */
  }

}
