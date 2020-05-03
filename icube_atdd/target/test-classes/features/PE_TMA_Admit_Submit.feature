#Author: Chandan Kumar Mohakul
#Email : chandankumar_mohakul@optum.com
@TMA_QUALIFICATION
Feature: PE - Navigation to the full initial review
  In order to move seamlessly from the TMA qualification to the full initial review
  As a Provider Express user
  I want the initial full review to display on the failure of the member to qualify for the TMA

  Background: 
    Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline

  Scenario Outline: Verify TMA qualification to the full initial review
    And selects Request an initial authorization for admission radio
    And click Continue button
    And selects Member Search tab
    And enters "<MemberId>" for the Member ID
    And enters "<FirstName>" for the First Name
    And click Proceed to Step two button 
    And click Proceed to Step three button 
    And enters the primary diagnosis "<PrimaryDiag>"
    And provide the "<Discription>" to select the autosuggested list
    And select Involuntary admission "<InvoluntarySub>"
    And select the level of care being requested "<Loc>"
 		And click Proceed to Step four button
 		And sees Initial Admit Form
    And click mdsearch button
    And select one radio button of "<provoderName>" in popup 
    And click  "<button>"  in popup Windiow
    And enters "<urName>" for ur Name field
    And enters "<urphone>" for ur phone field
    And select benefit type
    And select MemberAdmitted
    And enters "<Admitdate>"for Admit date field 
    And select attestation check box
    When click submit button
    Then form will submit 
 		
    Examples: 
      | MemberId  | FirstName  | PrimaryDiag| Discription												 | InvoluntarySub | Loc       |   provoderName            | button |urName   | urphone                  | Admitdate  |
      | 546479636 | MARTIN     | F41.       | F41.8-Other specified anxiety d/o  | no             | Inpatient |   Salgado, Carlos         | ok     |CM       | 1111111111111            | 06/21/2017 |
