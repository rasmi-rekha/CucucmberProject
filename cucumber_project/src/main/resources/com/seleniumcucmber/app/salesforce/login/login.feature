#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
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
Feature: Logging into salesforce
  in order to work
  as a salesperson
  I need to login

  @login
  Scenario Outline: Loggin in salesforce
    Given I go to "loginUrl" on "<Browser>"
    And I enter "loginusername" as "<Username>"
    And I enter "loginpassword" as "<Password>"
    And I click on "loginButton"
    Then Login should be "<Expected_Result>"
    
    
     Examples:
    | Browser | Username              | Password  |Expected_Result |
    | Chrome  | kuchhbatein@gmail.com | ommomm123 | success        |
    | Mozilla | kuchhbatei            | ommomm123 | failure        |
    | Mozilla | kuchhbatein@gmail.com | ommomm123 | success        |
    | Chrome  | kuchhbatein@gmail.com | ommomm123 | success        |
    | Chrome  | kuchhbate             | ommomm123 | failure        |

