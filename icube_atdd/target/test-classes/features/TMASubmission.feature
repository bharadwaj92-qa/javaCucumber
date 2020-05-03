#Author: Bharadwaj Nandiraju
#Email : bharadwaj_nandiraju@optum.com

Feature: TMA form submission

In order to allow a member to admit under a facility
As a Provider Express user
I want the user to allow for the TMA form submission


@TMA
Scenario Outline: Verify TMA submission
    Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline
    And selects Request an initial authorization for admission radio
    And click Continue button
    And selects Member Search tab
    And enters "<MemberId>" and First Name "<FirstName>"
    And click Proceed to Step two button
    And select a dropdown value from the Facility Address dropdown
    And click Proceed to Step three button
    And user will be in qualification page
    And navigating to FIR by giving  Member Admitted "<MemberAdmitted>" select Admit Date "<AdmitDate>" and diagnosis "<PrimaryDiag>" and select the dropdown based on "<Description>" and Involuntary admission "<InvoluntaryAdmit>" and level of care being requested "<Loc>"
    And click Proceed to Step four button
    And user will see TMA form
    And select the Attending MD details by clicking MD Search and Ennter "<URName>" and "<URPhone>" 
    And select benefit type as MH
    And click on attestation check box
    When user clicks on Submit button
    Then user should see the Confirmation number 
  
   
Examples: 
|MemberId  | FirstName | MemberAdmitted | AdmitDate  | PrimaryDiag         | Description        | InvoluntaryAdmit| Loc       | URName  |   URPhone     |
|007686605 | PAULA     |  Yes           | 11/19/2018 |F40.00-Agoraphobia   |F40.00-Agoraphobia  |  NO             |Inpatient  | Raju    |7777777777777  |












  