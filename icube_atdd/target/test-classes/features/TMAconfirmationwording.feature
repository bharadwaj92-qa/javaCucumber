#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples And <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify that the wording on the confirmation page has changed to reflect selecting concurrent

  @tag1
  Scenario: Verify that the wording on the confirmation page has changed to reflect selecting concurrent
    Given that the user logs into the PE application
    And Select to Review Online tab
    And Select Request an Initial Authorization for Admission
    And Select to Member ID Search
    And Input Member ID "553359648" and First Name "Christine"
    And Select Step 3
    And input values on TMA Qualification Form - see diagram
    And Select Step 4
    And Select Attending MD
    And Input "Kathleen" for Utilization Review
    And Input "2131" for Phone
    And Select Benefit Type "SA"
    And Select Member Admitted "Yes"
    And Input today's date in Admit Date
    And Select the attestation
    When I Submit
    Then I see the "Quick Cert Confirmation" page
    And I see "To request additional days at the current level of care, select “Concurrent” under the Action column for this member."
