#Author: Bharadwaj Nandiraju
#Email : bharadwaj_nandiraju@optum.com
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
      | MemberId  | FirstName  | MemberAdmitted | AdmitDate  | PrimaryDiag | Description        | InvoluntaryAdmit | Loc       |
      | 387863338 | RYAN       | Yes            | 12/09/2017 | F40.        | F40.00-Agoraphobia | NO               | Inpatient |

  #| 252751360 | SHATAVIA   | Yes            |07/18/2017| F91.1       | F91.1 Conduct d/o, Childhood-onset | yes              | Other     |


  Scenario Outline: Verify FIR Member Tab Navigation
    Given User launched in FIR Member Tab
    And Enters the Member Contact "<MemberContact>" and Member Address "<MemberAddress>" and select Legal Guardian "<LegalGuardian>"
    And Enters the Guardian Name "<GuardianName>" and Guardian Phone "<GuardianPhone>" and Guardian Address"<GuardianAddress>"
    When click Next button
    Then user sees Provider Tab
    
    Examples: 
    |MemberContact|MemberAddress|LegalGuardian|GuardianName|GuardianPhone|GuardianAddress|
    |2222222222222|Hyd          |Yes           |Shiva       |7777777777777|HYd            |
    
  Scenario Outline: Verify FIR Provider Tab Navigation
    Given User launched in FIR Provider Tab
    And select the Attending MD details by clicking MD Search and Ennter "<URName>" and "<URPhone>" 
    When click Provider Tab Next button
    Then user sees Service Tab
    
    Examples: 
    |URName|URPhone     |
    |Raju  |222222222222|   