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

Feature: sports kit
  

 @datadriven
 Scenario Outline:sales executive signin
  Given user provides "<user>" and "<password>"
  Then user should enter the homepage
    
  Examples: 
  |user   |password   |
  |Lalitha|password123|
   

  @smoke
  Scenario: create sports category 
    Given user should enter homepage
    And user should add category as sport
    And user should add subcategory 
    |Basketball|
    |Volleyball|
   
    Then user should see subcategories under sports category

  
      
