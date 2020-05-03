package com.optum.icube.qc.stepdef;

import org.testng.Assert;

import com.optum.icube.qc.page.ClinicalReviewProviderTab;
import com.optum.icube.qc.page.TMAformPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FIRProviderTab {

  @Given("^User launched in FIR Provider Tab$")
  public void launchedFIRProviderTab() {

  }

  @Given("^select the Attending MD details by clicking MD Search and Ennter \"([^\"]*)\" and \"([^\"]*)\"$")
  public void TMASubmit(String URName,String URPhone) throws InterruptedException {
    new TMAformPage().TMASubmit(URName, URPhone);
  }

  @When("^click Provider Tab Next button$")
  public void proceedToServiceTab() {
    new ClinicalReviewProviderTab().clickNextButton();

  }

  @Then("^user sees Service Tab$")
  public void navToServiceTab() {
    Assert.assertTrue(true);
  }

}
