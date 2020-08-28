 @search
Feature: I want to get on salary calculator page and test salary calculator function
 

 
  Scenario: Salary Calculator page
    Given I am on homepage
     When I click on Career Explorer
      And I choose Salary Predictor
     Then I should land on Salary Calculator page



  Scenario Outline: Testing Salary Calculator
    Given I am on Salary Calculator page
     When I add Salary Calculator Info
     |Job Title | Location |Years of Experience|
     |<jobtitle>|<location>|<yearsofexperience>|
     Then I should get the '<Result>'
     
  Examples: 
      | jobtitle   | location     | yearsofexperience|Result         													 |
      | SDET       | Falls Church | 2                |QA Automation Engineer Salary Prediction|
      | SDET       | Falls Church | 7                |QA Automation Engineer Salary Prediction|
      | SDET       |       Austin | 2                |QA Automation Engineer Salary Prediction|
      | SDET       |       Austin | 7                |QA Automation Engineer Salary Prediction|
      | Developer  | Falls Church | 2                |Developer Salary Prediction             |
      | Developer  | Falls Church | 7                |Developer Salary Prediction             |
      | Developer  |       Austin | 2                |Developer Salary Prediction 						|
      | Developer  |       Austin | 7                |Developer Salary Prediction 						|