#Author: Jatin Sharma
#Email : jatin_sharma@optum.com

Feature: TMO form submission

In order to allow the patient for the extended stay
As a Provider Express user
I want the user to allow for the TMO form submission

@TMO

Scenario Outline: Verify TMO submission

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
And user clicks on Next button
And user will see Provider tab
And user clicks on Next button
And user will see Service tab
And user enters "<AddtnlDaysReq>" Additional number of days requested 
And user selects Involuntary status as Involuntry
And user selects Court Ordered as No
And user selects Are there any Active Medical Conditions as No
And user selects Primary precipitant/circumstances that led to this admission 
And user enters "<addtnlDetailSpecificEvent>" for Provide additional detail about the specific event
And user selects No for Was substance use a contributing reason for admission
And user enters "<CurrentUncontrolledSymptoms>" for CurrentUncontrolledSymptoms text field
And user Clicks on Next button
And user will see Medication tab
And user selects No for Is the member on any current medications
And user clicks on Next button
And user will see Review tab
And user enters "<SpecificActions>" for SpecificActions field
And user selects the dropdown value from  Facility Planned Discharge LOC
And user enters "<ELOS>" for ELOS
And user enters "<DCPlan>" for Discharge Plan
And user enters "<BarriersToDC>" for field BarrierTODC field
#42.for now covered under method 'provideDCPlan'
And user clicks on Next button
And user will see the Confirmation & Attestation page
And user selects Yes for Disclaimer
And user selects I Attest checkbox
When user clicks on Submit button on confirmation page
Then user should see the Confirmation pop-up message

Examples:
|Include|MemberContPhone|AddtnlDaysReq|AddtnlDetailSpecificEvent|CurrentUncontrolledSymptoms|SpecificActions|ELOS	|DCPlan		|BarriersToDC		|	MemName					|
|Yes		 |777777777777		 |1						 |testing									 |testing										 |testing				 |6			|testing	|testing				|	MADRIGAL_SOCORRO|