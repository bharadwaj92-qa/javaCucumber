package com.optum.icube.qc.stepdef;

import com.optum.icube.qc.page.DischargePage;
import com.optum.icube.qc.page.PatientList;
import com.optum.icube.qc.page.TMAformPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TMADischarge {
	
	@Given("^select the Discharge hyperlink of \"([^\"]*)\" for member$")
	public void select_the_Discharge_hyperlink_of_for_member(String MemName) throws InterruptedException  {
	    
		new PatientList().DischargeHyperlink(MemName);	
		
	}

	@Given("^User sees the Discharge form$")
	public void user_sees_the_Discharge_form() {
		System.out.println("You are on the Discharge form");
	
	}

	@Given("^user click on mdsearch button$")
	public void user_click_on_mdsearch_button() throws InterruptedException {
		
	new DischargePage().MDSearch();	
		
		new TMAformPage().doMDSearch();
	
	System.out.println("MD is selected");
	
	}

	@Given("^user select the MD from the dialog box$")
	public void user_select_the_MD_from_the_dialog_box() {
	
	}

	@Given("^user enter the primary diagnosis code as \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void user_enter_the_primary_diagnosis_code_as_and(String primaryDiag, String description) throws InterruptedException  {

		new DischargePage().selectAutoSuggestedDiagnois(primaryDiag, description);
	    
	}

	@Given("^user enter the Discharge Date as \"([^\"]*)\"$")
	public void user_enter_the_Discharge_Date_as(String dischargedate) throws InterruptedException  {
		
		new DischargePage().dateofdischarge(dischargedate);
	
	}

	@Given("^user enter Days/Session used as \"([^\"]*)\"$")
	public void user_enter_Days_Session_used_as(String units) throws InterruptedException  {
		
		new DischargePage().unitused(units);
	
	}

	@Given("^user select Discharge Disposition code as \"([^\"]*)\"$")
	public void user_select_Discharge_Disposition_code_as(String dischargecode)  {
		
		new DischargePage().dcdpcode(dischargecode);;
	
	}
	
	@Given("^User select No in Schedule followup$")
	public void user_select_No_in_Schedule_followup() throws Throwable {
	 
		new DischargePage().appointment();
		
	}

	
	@Given("^user click on attestation check box$")
	public void user_click_on_attestation_check_box()  {
		
		new DischargePage().attestation();
	
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws InterruptedException  {
		
		new DischargePage().dischargeSubmit();
	
	}

	@Then("^user should see the 'Quick Cert Confirmation' page$")
	public void user_should_see_the_Quick_Cert_Confirmation_page() {
	
		System.out.println("Discharge Submitted Successfully");
		
	}

	

}
