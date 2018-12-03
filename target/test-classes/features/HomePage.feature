Feature: Home Page Tests

@test
Scenario: Skip the Ad before Login

Given I open browser: "Chrome"
When I open url: "https://www.straitstimes.com"
And I skip the Add
Then User is on Home Page





