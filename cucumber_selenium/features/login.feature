Feature: Test login for demo webShop
Scenario: Test demowebshop with valid credentials
Given Open chrome and start application
When I provide valid username and password
Then user should be able to login