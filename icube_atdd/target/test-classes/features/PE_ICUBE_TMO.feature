#Author: Chandan Kumar Mohakul
#Email : chandankumar_mohakul@optum.com
@TMO_QUALIFICATION
Feature: PE - Navigation to the full initial review TMO
 
 
  Background: 
    Given User logged into PE Application with Valid Credentials
    And Selects ReviewOnline
    
@TMO_1
  Scenario Outline: Verify TMO qualification to the full initial review
    And selects view my Census 
    And click Continue button
    And click My Patient is not on the Census
    And click Concurrent link "<qcid>" 
     And enter Member Contact Phone "<MemberContactPhone>" 
    And click Legal Guardian radio "<yesOrno>"
    When click next 
    Then form will submit 
    
    Examples:
    
     |qcid | MemberContactPhone             | yesOrno |
     |452  | (111) 111-1111 EXT 11111       |   yes   |
     
 