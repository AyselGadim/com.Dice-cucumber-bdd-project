
@tag
Feature: I want to get on salary calculator page and test salary calculator function
 

  @tag1
  Scenario: Salary Calculator page
    Given I am on homepage
     When I click on Career Explorer
      And I choose Salary Predicor
     Then I should land on Salary Calculator page


  @tag2
  Scenario Outline: Tesing Salary Calculator
    Given I am on Salary Calculator page
     When I fill in information from examples table
     Then I verify if the Salary Calculator works properly

  Examples: 
      | Job Title  | Location     | Years of Experience |Result          |
      | SDET       | Falls Church | 2                   |74,000 - 95,000 |
      | SDET       | Falls Church | 7                   |89,000 - 115,000|
      | SDET       |       Austin | 2                   |70,500 - 83,500 |
      | SDET       |       Austin | 7                   |83,500 - 98,500 |
      | Developer  | Falls Church | 2                   |51,500 - 72,500 |
      | Developer  | Falls Church | 7                   |61,500 - 86,000 |
      | Developer  |       Austin | 2                   |46,500 - 63,500 |
      | Developer  |       Austin | 7                   |54,500 - 75,000 |