#Author: Shiva Sankara Rao
#Email : shivasankar_pabbu@optum.com
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
 		
    Examples: 
      | MemberId  | FirstName | PrimaryDiag| Discription												| InvoluntarySub | Loc       |
      | 562631476 | Kiara     | F41.       | F41.8-Other specified anxiety d/o  | yes            | Inpatient |
