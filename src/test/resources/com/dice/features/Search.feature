 
 Feature: Verify Search Button
 
  
 Scenario: Verify Search Button
    Given I am on home page
    When I fill in Job Title and Location
    Then I should be able to click on Search Button and land on job listings page
    