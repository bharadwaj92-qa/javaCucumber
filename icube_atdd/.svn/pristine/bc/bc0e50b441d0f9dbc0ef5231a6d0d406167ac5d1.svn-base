package com.optum.icube.qc.stepdef;

import com.optum.icube.qc.page.MainMenuClick;
import com.optum.icube.qc.page.PatientList;
import com.optum.icube.qc.page.ReviewOnlinePage;
import com.optum.icube.qc.page.TMOConfPage;
import com.optum.icube.qc.page.TMOMedicationPage;
import com.optum.icube.qc.page.TMOMemberPage;
import com.optum.icube.qc.page.TMOProviderPage;
import com.optum.icube.qc.page.TMOReviewPage;
import com.optum.icube.qc.page.TMOServicePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TMOSubmission{

	@Given("^select View my Census radio button$")
	public void select_View_my_Census_radio_button() throws Throwable {
	    
		new ReviewOnlinePage().clickMyCensus();
	}

	@Given("^click on the Continue button$")
	public void click_on_the_Continue_button() throws Throwable {
	    	
	}

	@Given("^in the next page click on the MyPatient is not on the census tab$")
	public void in_the_next_page_click_on_the_MyPatient_is_not_on_the_census_tab() throws Throwable {
	   
	}

	@Given("^user is in the patient list page$")
	public void user_is_in_the_patient_list_page() throws Throwable {
	    
	}

	/*@Given("^user clicks on the Concurrent link for the member$")
	public void user_clicks_on_the_Concurrent_link_for_the_member() throws Throwable {
		new PatientList().MemberListClick();
	}*/
	
	/*@Given("^user clicks on the \"([^\"]*)\" link for the member$")
	public void user_clicks_on_the_link_for_the_member(String) throws Throwable {
	    
		new PatientList().MemberListClick();
	}*/
	
	@Given("^user clicks on the link for the \"([^\"]*)\" for member$")
	public void user_clicks_on_the_link_for_the_for_member(String MemName) throws Throwable {
	    new PatientList().MemberListClick(MemName);
	}

	@Given("^TMO form is opened with the default Member tab displaying$")
	public void tmo_form_is_opened_with_the_default_Member_tab_displaying() throws Throwable {
	    
	    
	}

	@Given("^user enters \"([^\"]*)\" for Member Contact Phone$")
	public void user_enters_for_Member_Contact_Phone(String MemberContPhone) throws Throwable {
	    
	   new TMOMemberPage().provideMbrDetails(MemberContPhone);
	}

	@Given("^user selects Legal Guardian as No$")
	public void user_selects_Legal_Guardian_as_No() throws Throwable {
	    
	//covered under above stepdef     
	}

	@Given("^user clicks on Next button$")
	public void user_clicks_on_Next_button() throws Throwable {
		
		//covered under above stepdef       
	    
	}

	@Given("^user will see Provider tab$")
	public void user_will_see_Provider_tab() throws Throwable {
	   
		new TMOProviderPage().provPage();
				
	}

	@Given("^user will see Service tab$")
	public void user_will_see_Service_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user enters \"([^\"]*)\" Additional number of days requested$")
	public void user_enters_Additional_number_of_days_requested(String AddtnlDaysReq) throws Throwable {
	   
		new TMOServicePage().provideDaysReq(AddtnlDaysReq);
	    
	}

	@Given("^user selects Involuntary status as Involuntry$")
	public void user_selects_Involuntary_status_as_Involuntry() throws Throwable {
	    //covered under above stepdef
	    
	}

	@Given("^user selects Court Ordered as No$")
	public void user_selects_Court_Ordered_as_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user selects Are there any Active Medical Conditions as No$")
	public void user_selects_Are_there_any_Active_Medical_Conditions_as_No() throws Throwable {
	    //covered under another above step def
	    
	}

	@Given("^user selects Primary precipitant/circumstances that led to this admission$")
	public void user_selects_Primary_precipitant_circumstances_that_led_to_this_admission() throws Throwable {
	    //covered under another above step def
	    
	}

	@Given("^user enters \"([^\"]*)\" for Provide additional detail about the specific event$")
	public void user_enters_for_Provide_additional_detail_about_the_specific_event(String AddtnlDetailSpecificEvent) throws Throwable {
	     
		new TMOServicePage().provideAddtnlSpecificEvent(AddtnlDetailSpecificEvent);
	    
	}

	@Given("^user selects No for Was substance use a contributing reason for admission$")
	public void user_selects_No_for_Was_substance_use_a_contributing_reason_for_admission() throws Throwable {
	    //covered under above step def
	    
	}

	@Given("^user enters \"([^\"]*)\" for CurrentUncontrolledSymptoms text field$")
	public void user_enters_for_CurrentUncontrolledSymptoms_text_field(String CurrentUncontrolledSymptoms) throws Throwable {
	    
		new TMOServicePage().providerUncontrolledSympt(CurrentUncontrolledSymptoms);
	    
	}

	@Given("^user Clicks on Next button$")
	public void user_Clicks_on_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user will see Medication tab$")
	public void user_will_see_Medication_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user selects No for Is the member on any current medications$")
	public void user_selects_No_for_Is_the_member_on_any_current_medications() throws Throwable {
	    
	    new TMOMedicationPage().provideMediDetails();
	}

	@Given("^user will see Review tab$")
	public void user_will_see_Review_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Given("^user enters \"([^\"]*)\" for SpecificActions field$")
	public void user_enters_for_SpecificActions_field(String SpecificActions) throws Throwable {
		new TMOReviewPage().provideSpecificActions(SpecificActions); 
	}

	@Given("^user enters \"([^\"]*)\" for field BarrierTODC field$")
	public void user_enters_for_field_BarrierTODC_field(String BarriersToDC) throws Throwable {
		
		new TMOReviewPage().provideBarrTODC(BarriersToDC);
	    
	}

	/*@Given("^user enters \"([^\"]*)\"$")
	public void user_enters(String SpecificActions) throws Throwable {
	    //Review tab
		
		new TMOReviewPage().provideSpecificActions(SpecificActions);
		
		
	}
*/
	@Given("^user selects the dropdown value from  Facility Planned Discharge LOC$")
	public void user_selects_the_dropdown_value_from_Facility_Planned_Discharge_LOC() throws Throwable {
	    //covered under above step def
	    
	}

	@Given("^user enters \"([^\"]*)\" for ELOS$")
	public void user_enters_for_ELOS(String ELOS) throws Throwable {
	    new TMOReviewPage().provideELOS(ELOS);
	    
	}

	@Given("^user enters \"([^\"]*)\" for Discharge Plan$")
	public void user_enters_for_Discharge_Plan(String DCPlan) throws Throwable {
	    
		new TMOReviewPage().provideDCPlan(DCPlan);
	    
	}

	@Given("^user will see the Confirmation & Attestation page$")
	public void user_will_see_the_Confirmation_Attestation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user selects Yes for Disclaimer$")
	public void user_selects_Yes_for_Disclaimer() throws Throwable {
	    
		new TMOConfPage().provideConfDetails();
	    
	}

	@Given("^user selects I Attest checkbox$")
	public void user_selects_I_Attest_checkbox() throws Throwable {
	  
		
	}
	
	@When("^user clicks on Submit button on confirmation page$")
	public void user_clicks_on_Submit_button_on_confirmation_page() throws Throwable {
		new TMOConfPage().clikSubButton();
	}
	
	@Then("^user should see the Confirmation pop-up message$")
	public void user_should_see_the_Confirmation_pop_up_message() throws Throwable {
		
		new TMOConfPage().provideConfPop();
		new MainMenuClick().clickMenuLink();
	    
	}


 
}
