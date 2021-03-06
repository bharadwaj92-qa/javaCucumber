package com.optum.icube.qc.stepdef;

import com.optum.icube.atdd.util.Constants;
import com.optum.icube.qc.page.PEMainMenu;
import com.optum.icube.qc.page.ReviewOnlinePage;
import com.optum.icube.qc.page.ReviewOnlineStep_1_Page;
import com.optum.icube.qc.page.ReviewOnlineStep_2_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NavigationPEQualificatio {

  @Given("^Selects ReviewOnline$")
  public void selectMenuLink() {

    //new PEMainMenu().clickMenuLink(Constants.REVIEWONLINE);
	  
	  new PEMainMenu().clickReviewOnline();
  }

  @Given("^selects Request an initial authorization for admission radio$")
  public void selectAuthAdmitionRadio() {
    new ReviewOnlinePage().gotoReviewOnlineStepOne();
  }

  @Given("^click Continue button$")
  public void goToNextPage() {
    // this step is executed in the previous stepdef logic.
  }

  @Given("^selects My patients tab$")
  public void selectTabByName() {
    // default tab no need to select this tab.
  }

  @Given("^user select radio button with corresponding \"([^\"]*)\"$")
  public void selectPatientByMemberId(String memberId) {
    new ReviewOnlineStep_1_Page().selectMemberFromMypatientTab(memberId);
  }

  @Given("^user sees member information$")
  public void getPatientinformation() {
  }

  @Given("^click Proceed to Step three button$")
  public void preceedToStep3() {
    new ReviewOnlineStep_2_Page().procedToStep3();
  }

  @Given("^user select facility address from drop down$")
  public void selectFacilityAddr() {
    new ReviewOnlineStep_2_Page().selectTheFacilityAddressFromDropDown("1700 Luther Ln,Park Ridge,IL  60068");
  }

  @Then("^user see ReviewOnline - Step three of four$")
  public void user_see_ReviewOnline_Step_three_of_four() {
  }

}
