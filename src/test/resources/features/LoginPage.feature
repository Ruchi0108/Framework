Feature: Login Page Tests

@test
Scenario: User able to login with valid credentials

When user click on the login link
And enter username and password:"digitaltest2","Sphdigital1"
And Click on SignIn Button
Then Assert user logged in Successfully:"digitaltest2"