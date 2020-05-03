#Author: Mohammad A Abbasi
#Email : Mohammad_a_abbasi@optum.com
@Membertab
Feature: US675965_Internal  Member Tab for FIR

  Scenario Outline: Verify member detail on the full initial review
    Given navigating to FIR by giving  Member Admitted "<MemberAdmitted>" select Admit Date "<AdmitDate>" and diagnosis "<PrimaryDiag>" and select the dropdown based on "<Description>" and Involuntary admission "<InvoluntaryAdmit>" and level of care being requested "<Loc>"
    When click Proceed to Step four button
    Then user sees FIR form
  	And user sees "Member Information" heading
    And user sees "Member Contact Phone" phone label
    And User sees phone Text Box
    And user sees "Member Contact Address upon Discharge" address label
    And user sees Address text box
    And User sees "Does the member have a Legal Guardian" legal guardian label

  Examples: 
      | MemberId  | FirstName  | MemberAdmitted |AdmitDate| PrimaryDiag | Description                         | InvoluntaryAdmit | Loc       |
      | 553753952 | MARICARMEN | Yes            |07/18/2017| F40.        | F40.00-Agoraphobia                 | yes              | Inpatient |
	
	 
	 
 