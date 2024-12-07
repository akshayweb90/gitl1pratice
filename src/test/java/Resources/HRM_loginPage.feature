Feature: HRM login Page
@HRM
Scenario: Validate login with valid credentials

Given user is on login page 
When user enters valid credentials 
Then user should able to login 

