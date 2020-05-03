#Author: Shiva Sankara Rao
#Email : shivasankar_pabbu@optum.com
@TMA_QUALIFICATION
Feature: 

  Background: 
    Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline
		And selects Request an initial authorization for admission radio
		And click Continue button
    And selects Member Search tab
   	
		
  Scenario Outline: Verify member detail on the full initial review
    And enters "<MemberId>" for the Member ID
    And enters "<FirstName>" for the First Name
    And click Proceed to Step two button 
    And click Proceed to Step three button 
    And enters the primary diagnosis "<PrimaryDiag>"
    And provide the "<Discription>" to select the autosuggested list
    And select Involuntary admission "<InvoluntarySub>"
    And select the level of care being requested "<Loc>"
   	When click Proceed to Step four button 
    Then user see FIR form
    

		
    Examples: 
      | MemberId  | FirstName | PrimaryDiag| Discription												| InvoluntarySub | Loc       |
      | 562631476 | Kiara     | F41.       | F41.8-Other specified anxiety d/o  | yes            | Inpatient |

  Scenario Outline: Verify member detail on the TMA review
    And enters "<MemberId>" for the Member ID
    And enters "<FirstName>" for the First Name
    And click Proceed to Step two button 
    And click Proceed to Step three button 
    And enters the primary diagnosis "<PrimaryDiag>"
    And provide the "<Discription>" to select the autosuggested list
    And select Involuntary admission "<InvoluntarySub>"
    And select the level of care being requested "<Loc>"
   	When click Proceed to Step four button 
    Then user see TMA form
    

		
    Examples: 
      | MemberId  | FirstName | PrimaryDiag| Discription												| InvoluntarySub | Loc       |
      | 562631476 | Kiara     | F41.       | F41.8-Other specified anxiety d/o  | yes            | Inpatient |
      