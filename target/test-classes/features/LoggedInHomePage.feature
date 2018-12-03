Feature: LoggedIn HomePage Tests

@test
Scenario: Logged In Page has Main Article

Given User is Logged In
Then Check main article is present on Logged In Home Page
And Main article has Image


#@test
#Scenario : User able to click on Main Article
#
#When user click on main article
#Then user moved to main article Page
#And article has image

