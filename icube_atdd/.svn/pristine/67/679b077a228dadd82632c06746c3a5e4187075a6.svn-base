package com.optum.icube.qc.stepdef;

import com.optum.icube.qc.page.ClinicalReviewMemerTab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FIRMemberTab {

  @Given("^User launched in FIR Member Tab$")
  public void launchedFIRMemberTab() {
     
     
  }

  @Given("^Enters the Member Contact \"([^\"]*)\" and Member Address \"([^\"]*)\" and select Legal Guardian \"([^\"]*)\"$")
  public void validateMemberTab(String memberPh, String memberAddr, String legalGuardian) {
     new ClinicalReviewMemerTab().provideMemberDetails(memberPh, memberAddr, legalGuardian);
  }

  @Given("^Enters the Guardian Name \"([^\"]*)\" and Guardian Phone \"([^\"]*)\" and Guardian Address\"([^\"]*)\"$")
  public void validateGuardianFields(String guardianName, String guardianPh, String guardianAddr) {
     new ClinicalReviewMemerTab().provideGuardianDetails(guardianName, guardianPh, guardianAddr);
  }
  
  @When("^click Next button$")
  public void click_Next_button() {
     
     new ClinicalReviewMemerTab().proceedToClickNextButton(); 
  }

  @Then("^user sees Provider Tab$")
  public void user_sees_Provider_Tab() {
     
      
  }
}
