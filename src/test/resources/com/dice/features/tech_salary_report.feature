
Feature:  Tech Salary Report feature
As a customer, I be able to reach hiring page
As a customer, I be able to click request a c opy button in that page 
As a customer, I be able to fill the get the report form 
As a customer, I be able to click get your copy button



Scenario: Verify request a copy button is clickable

Given I am on hiring page
When I click on request a copy button
Then I should land on dice tech salary report page





Scenario: Verify get the report form elements

Given I am on hiring page
When I click on request a copy button
Then I should land on dice tech salary report page
Then Firstname, last name, company, and email should be able to entered



Scenario: Verify error message

Given I am on hiring page
When I click on request a copy button
Then I should land on dice tech salary report page
And I enter "tom" to firstName field
And I enter "tommy" to last name field
And I enter "javaco" to company field
And I enter "test@javaco.com" to email field
And I click on get your copy button


































