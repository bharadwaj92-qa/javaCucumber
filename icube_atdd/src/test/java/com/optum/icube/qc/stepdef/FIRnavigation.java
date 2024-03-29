package com.optum.icube.qc.stepdef;

import com.optum.icube.qc.page.ReviewOnlineStep_1_Page;
import com.optum.icube.qc.page.ReviewOnlineStep_2_Page;
import com.optum.icube.qc.page.ReviewOnlineStep_3_QualificationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FIRnavigation {

  private static final String wait = null;
  

@Given("^selects Member Search tab$")
  public void selectMemberSearchTab() throws InterruptedException {
    new ReviewOnlineStep_1_Page().selectTabByLink();
  }

  @Given("^enters \"([^\"]*)\" and First Name \"([^\"]*)\"$")
  public void searchByMemberIdAndFName(String MemberId,String FirstName) {
    new ReviewOnlineStep_1_Page().searchMemberByNameAndId(MemberId, FirstName);
  }

  @Given("^click Proceed to Step two button$")
  public void proceedToStep2() {
    new ReviewOnlineStep_1_Page().proceedToStep2();
  }

  @Given("^select a dropdown value from the Facility Address dropdown$")
  public void selectFacilityAddress() {
	  new ReviewOnlineStep_2_Page().selectTheFacilityAddressFromDropDown("3800 Frederick Ave,Baltimore,MD  21229");
  }

  @Given("^navigating to FIR by giving  Member Admitted \"([^\"]*)\" select Admit Date \"([^\"]*)\" and diagnosis \"([^\"]*)\" and select the dropdown based on \"([^\"]*)\" and Involuntary admission \"([^\"]*)\" and level of care being requested \"([^\"]*)\"$")
  public void dataUnderQualifypage(String memberAdmited, 
                              String admitDate,
                              String diagCode,
                              String description,
                              String invAdmit,
                              String loc) {
    
	  try {
    	
		new ReviewOnlineStep_3_QualificationPage().dataUnderQualifypage(memberAdmited, admitDate, diagCode, description, invAdmit, loc);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
  }

  @When("^click Proceed to Step four button$")
  public void proceedToStep4() {

  }

  @Then("^user sees FIR form$")
  public void gotoFIRform() {
    
  }
}
