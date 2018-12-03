package com.project.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageStepFile extends BaseSteps{

    @When("^Login into Straits Times with username: \"([^\"]*)\" and password: \"([^\"]*)\"$")
    public void user_click_on_the_login_link(String userName, String password) {
        loginPage = homePage.clickLoginButton();
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
        loggedInHomePage = loginPage.clickSignInButton();
    }

}
