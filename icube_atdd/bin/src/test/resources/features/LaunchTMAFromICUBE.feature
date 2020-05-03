@TMA_SU
Feature: Verify that I am able to launch TMA and submit successfully

  @QUALIFICATION_WITHOUT_PE
  Scenario Outline: launching icube qualification page without loging through PE
    Given I am able to create url with security token 
    And I am able to lauch icube TMA qualification page 
    And I enters the primary diagnosis "<PrimaryDiag>"
    And I provide the "<Discription>" to select the autosuggested list
    And I select Involuntary admission "<InvoluntarySub>"
    And I select the level of care being requested "<Loc>"
    When I click Submit on qualification
    Then I see the TMA page
    
    Examples: 
      | MemberId  | FirstName | PrimaryDiag| Discription												| InvoluntarySub | Loc       |
      | 562631476 | Kiara     | F41.       | F41.8-Other specified anxiety d/o  | inv            | Inpatient |
    
  @TMA_WITHOUT_PE
  Scenario: launching icube TMA page without loging through PE
  	Given member is qualified for QuickCert and on icube TMA page
    And I select Attending MD
    And I Input "Kathleen" for Utilization Review
    And I Input "2131555555" for Phone
    And I Select Benefit Type "SA"
    And I Select Member Admitted "Yes"
    And I Input today's date in Admit Date
    And I Select the attestation
    When I click Submit on TMA
    Then I see the "Quick Cert Confirmation" page
    And I see "To request additional days at the current level of care, select “Concurrent” under the Action column for this member."
