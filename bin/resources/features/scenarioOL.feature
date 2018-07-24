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
@test2
Feature: Test a scenario outlines
  I want to check the scenario outlines

 
  Scenario Outline: Testing a outlines in serenity
    Given A <a>
    When B <b>
    Then Addition of C

    Examples: 
      | a | b |
      | 1 | 4 |
      | 2 | 7 |
