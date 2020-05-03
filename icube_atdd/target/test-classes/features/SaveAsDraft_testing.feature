#Author: Bharadwaj Nandiraju
#Email : bharadwaj_nandiraju@optum.com

Feature: Regression automation testing
  In order to re-access the users previosuly entered information
  As a Provider Express user
  I want to implement save as draft functionality in TMO

  Scenario Outline: Verify that save as draft can be done multiple times in TMO
    Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline
    And select View my Census radio button
		And click on the Continue button
		And in the next page click on the MyPatient is not on the census tab
		And user is in the patient list page
		And user clicks on the link for the "<MemName>" for member
		And TMO form is opened with the default Member tab displaying
		And user enters "<MemberContPhone>" for Member Contact Phone
		And user selects Legal Guardian as No
		When user clicks on save as draft button in Member tab
		Then user will see the successfully saved message popup 
		And click on OK button
		And click on Next button in the Member tab
		
		Examples: 
      | MemName    | MemberContPhone |
      | PEASE_ERIC | 7777777777777   |  
		
	Scenario Outline: Verify that save as draft can be done multiple times in TMO
    Given User is in the Provider tab
    And user edits the "<FacContPhone>" 
    When user clicks on save as draft button in Provider tab
		Then user will see the successfully saved message popup 
		And click on OK button
		And click on Next button in the Provider tab
		
		Examples: 
      |FacContPhone     |
      | 777777777777722 | 
		
	Scenario Outline: Verify that save as draft can be done multiple times in TMO
    Given User is in the Service tab
    And user enters "<AddtnlDaysReq>" under Additional number of days requested in Service tab
    And user selects Involuntary status as Involuntry
    When user clicks on save as draft button in Service tab
		Then user will see the successfully saved message popup 
		And click on OK button
		And click on Next button in the Service tab
		
		Examples: 
     | AddtnlDaysReq |
     |     22        |  
		
		Scenario: Verify that save as draft can be done multiple times in TMO
    Given User is in the Medication tab
    And user selects No radio for Is the member on any current medications
    When user clicks on save as draft button in Medication tab
		Then user will see the successfully saved message popup 
		
		
		 


