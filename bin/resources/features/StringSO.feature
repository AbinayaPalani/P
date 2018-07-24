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
@sample
Feature: Testing a Cucumber Expression
  I want to use this template to validate the cucumber expression

  Scenario Outline: Testing a cucumber expression
   # Given Read the first {str1}
   # When Read the second {str2}
     Given I have <b> red balls


    Examples:
    |b|
    |78778.88| 
    |343.38|
		|34.00|
		|9883.3|
      #| str1  | str2  |
      #| 343.8 | 3498.384 |
