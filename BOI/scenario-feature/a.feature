Feature: check for boi login

 Scenario: Verification of valid credentials
 	Given Open boi web site			
 	When user input name "mah@yahoo.com"			
 	And user input password "mysore15"			
 	Then Login should be successful