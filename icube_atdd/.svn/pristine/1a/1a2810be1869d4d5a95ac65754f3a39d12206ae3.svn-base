#Author: Mohammad A Abbasi
#Email : mohammad_a_abbasi@optum.com

Feature: Member discharge from portal

In order to allow a patient to discharge from facility

  Scenario Outline: Verify TMA Discharge
    #Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline
    And select View my Census radio button
    And click on the Continue button
    And in the next page click on the MyPatient is not on the census tab
    And user is in the patient list page
    And select the Discharge hyperlink of "<MemName>" for member
    And User sees the Discharge form
    And user click on mdsearch button
    And user select the MD from the dialog box
    And user enter the primary diagnosis code as "<primaryDiag>" and  "<description>"
    And user enter the Discharge Date as "<dischargedate>"
    And user enter Days/Session used as "<units>"
    And user select Discharge Disposition code as "<dischargecode>"
    And user click on attestation check box
    And User select No in Schedule followup
    When user click on submit button
    Then user should see the 'Quick Cert Confirmation' page
    
 Examples:   
 
 | primaryDiag        | description   				| dischargedate  | units | dischargecode |MemName			   |
 | F40.00-Agoraphobia | F40.00-Agoraphobia    | 11/15/2017     | 1     |  Foster Care  | SPURIO_SOPHIA |                                    
  