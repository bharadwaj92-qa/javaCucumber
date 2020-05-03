#Author: Bharadwaj Nandiraju
#Email : bharadwaj_nandiraju@optum.com
@FIR @Regression
Feature: US675951-Navigation to the full initial review
  In order to move seamlessly from the TMA qualification to the full initial review
  As a Provider Express user
  I want the initial full review to display on the failure of the member to qualify for the TMA

  Scenario Outline: Verify TMA qualification to the full initial review
    Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline
    And selects Request an initial authorization for admission radio
    And click Continue button
    And selects Member Search tab
    And enters "<MemberId>" and First Name "<FirstName>"
    And click Proceed to Step two button
    And select a dropdown value from the Facility Address dropdown
    And click Proceed to Step three button
    And navigating to FIR by giving  Member Admitted "<MemberAdmitted>" select Admit Date "<AdmitDate>" and diagnosis "<PrimaryDiag>" and select the dropdown based on "<Description>" and Involuntary admission "<InvoluntaryAdmit>" and level of care being requested "<Loc>"
    When click Proceed to Step four button
    Then user sees FIR form
    

    Examples: 
      | MemberId  | FirstName  | MemberAdmitted |AdmitDate| PrimaryDiag | Description                         | InvoluntaryAdmit | Loc       |
      | 553753952 | MARICARMEN | Yes            |07/18/2017| F40.        | F40.00-Agoraphobia                 | yes              | Inpatient |
			#| 252751360 | SHATAVIA   | Yes            |07/18/2017| F91.1       | F91.1 Conduct d/o, Childhood-onset | yes              | Other     |
			
			
