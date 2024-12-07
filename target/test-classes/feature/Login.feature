Feature: Login page 

  Scenario: Login to orangeHRM
    Given user is on login Page
    When User gives the credential
    Then user is on dashboard
    
#
  #Scenario: Logout from orangeHRM
    #Given user is on login Page
    #When User gives the credential
    #And user is on dashboard
    #And User click om logout button
    #Then user is logged out

  #Scenario Outline: Login to orangeHRM with invalid credentials
    #Given user is on login Page
    #Then user enters <username> and <passward>
    #Then user is on dashboard
   #Then invalid credential sms should displayed
#
    #Examples: 
      #| username | passward |
      #| akshay   | gadhave  |
