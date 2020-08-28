Feature: Login feature
As a customer, I be able to reach sign in page
As a customer, I be able to use links on sign in page 
As a customer, I be able to log in with valid credentials
As a customer, I be able to see forgot password link if I forgot log in info



Scenario: Verify login title

Given I am at homepage
When I click on login register dropdown
Then I click on login
Then I should land on login page and the title should be sign in


Scenario: Verify login url

Given I am at homepage
When I click on login register dropdown
Then I click on login
Then I should land on login page and the url should be correct


Scenario: Verify login page elements

Given I am at homepage
When I click on login register dropdown
Then I click on login
Then The username, password, and sign in button elements should be enabled































