Feature: Login Page Tests

@testWithLogIn
Scenario: User able to login with valid credentials and validate main article page
Given I open browser: "Chrome"
And I open url: "https://www.straitstimes.com"
And I skip the Add
And Login into Straits Times with username: "digitaltest2" and password: "Sphdigital1"
Then Assert user logged in successfully: "digitaltest2"
And Verify main article has Image
When User clicks on the main article and validate the main article media page
And Verify main article in the media page has Image


@testWithoutLogIn
Scenario: Validate main article page
Given I open browser: "Chrome"
And I open url: "https://www.straitstimes.com"
And I skip the Add
And Verify main article has Image
When User clicks on the main article and validate the main article media page
And Verify main article in the media page has Image