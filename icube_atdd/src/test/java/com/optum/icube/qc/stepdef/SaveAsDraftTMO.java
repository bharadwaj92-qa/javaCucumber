package com.optum.icube.qc.stepdef;

import com.optum.icube.qc.page.TMOMedicationPage;
import com.optum.icube.qc.page.TMOMemberPage;
import com.optum.icube.qc.page.TMOProviderPage;
import com.optum.icube.qc.page.TMOServicePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SaveAsDraftTMO {

	
	@When("^user clicks on save as draft button in Member tab$")
	public void user_clicks_on_save_as_draft_button_in_Member_tab()  {
	    
	    new TMOMemberPage().doSaveDraft();
	    
	}

	@Then("^user will see the successfully saved message popup$")
	public void user_will_see_the_successfully_saved_message_popup()  {
	    
	    
	}

	@Then("^click on OK button$")
	public void click_on_OK_button()  {
	    
	    
	}

	@Then("^click on Next button in the Member tab$")
	public void click_on_Next_button_in_the_Member_tab()  {
	    
	    
	}

	@Given("^User is in the Provider tab$")
	public void user_is_in_the_Provider_tab()  {
	    
	    
	}

	@Given("^user edits the \"([^\"]*)\"$")
	public void user_edits_the(String FacContPhone)  {
	    
		new TMOProviderPage().givFacContPhone(FacContPhone);
	    
	}

	@When("^user clicks on save as draft button in Provider tab$")
	public void user_clicks_on_save_as_draft_button_in_Provider_tab() throws InterruptedException  {
	    
		new TMOProviderPage().doSaveDraft();
	}

	@Then("^click on Next button in the Provider tab$")
	public void click_on_Next_button_in_the_Provider_tab()  {
	    
	    
	}

	@Given("^User is in the Service tab$")
	public void user_is_in_the_Service_tab()  {
	    
	    
	}
	@Given("^user enters \"([^\"]*)\" under Additional number of days requested in Service tab$")
	public void user_enters_under_Additional_number_of_days_requested_in_Service_tab(String AddtnlDaysReq) throws Throwable {
	    
	   new TMOServicePage().provAddtldays(AddtnlDaysReq);
	}

	@When("^user clicks on save as draft button in Service tab$")
	public void user_clicks_on_save_as_draft_button_in_Service_tab() throws InterruptedException  {
	    
	    new TMOServicePage().doSaveDraft();
	}

	@Then("^click on Next button in the Service tab$")
	public void click_on_Next_button_in_the_Service_tab()  {
	    
	    
	}

	@Given("^User is in the Medication tab$")
	public void user_is_in_the_Medication_tab()  {
	    
	    
	}
	@Given("^user selects No radio for Is the member on any current medications$")
	public void user_selects_No_radio_for_Is_the_member_on_any_current_medications() throws Throwable {
	    
	    new TMOMedicationPage().selectNoMedi();
	    
	}

	@When("^user clicks on save as draft button in Medication tab$")
	public void user_clicks_on_save_as_draft_button_in_Medication_tab() throws InterruptedException  {
	    
		new TMOMedicationPage().doSaveDraft();
	    
	}

	
}
