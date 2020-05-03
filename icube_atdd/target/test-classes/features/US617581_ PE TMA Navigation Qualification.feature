#Author: Shiva Sankara Rao
#Email : shivasankar_pabbu@optum.com
@TMA_QUALIFICATION
Feature: PE TMA Navigation Qualification
when proceeding to Step 3 from Step 2, we should load ICUBE Qualification form instead of loading the PE qualification form.

  Background: 
    Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline
		And selects Request an initial authorization for admission radio
		And click Continue button
		And selects My patients tab
    And user select radio button with corresponding "<memberid>"
    
 @ICUBE_QUALIFICATION_MYPATIENT_TAB
  Scenario Outline:  Navigating to ICUBE Qualification page from Provider Express application.
    
    And click Proceed to Step two button 
    And user sees member information
    And user select facility address from drop down
    And click Proceed to Step three button 
    Then user see ReviewOnline - Step three of four
     
 Examples:

 |memberid |
 |316564646 |

 