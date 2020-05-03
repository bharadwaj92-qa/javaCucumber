@Login @Regression
Feature: Provider Express Login

  @tag1
  Scenario: login without username and password
    Given user is on Provider Experss homepage
    When user clicks on Sign in button
    Then user is displayed login screen with error messages
    
  @tag2
  Scenario Outline: Login with username and password
  	Given user is on Provider Experss homepage
		When I enter Username as "<OptumId>" and Password as "<Password>"
		When user clicks on Sign in button
		Then user is displayed with provider express home page
		
		Examples:
			
		|	OptumId   | Password     |
	  | bnandira  | Bharath@32   |
  