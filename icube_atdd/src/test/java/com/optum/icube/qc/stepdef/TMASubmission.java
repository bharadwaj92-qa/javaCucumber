package com.optum.icube.qc.stepdef;

import com.optum.icube.qc.page.MainMenuClick;
import com.optum.icube.qc.page.TMAformPage;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TMASubmission {

	@Given("^user will be in qualification page$")
	public void user_will_be_in_qualification_page() throws Throwable {
	    
	}


	@Given("^user will see TMA form$")
	public void user_will_see_TMA_form() throws Throwable {
	    
	}

    @Given("^select benefit type as MH$")
	public void select_BenefitType() throws Throwable {
	   
	     
    }


	@Given("^click on attestation check box$")
	public void click_on_attestation_check_box() throws Throwable {
	    
	}

	@When("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
	   
	}

	@Then("^user should see the Confirmation number$")
	public void user_should_see_the_Confirmation_number() throws Throwable {
		new MainMenuClick().clickMenuLink();
	}	
}
