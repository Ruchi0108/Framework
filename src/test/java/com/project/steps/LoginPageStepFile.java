package com.project.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageStepFile extends BaseSteps{

    @When("^user click on the login link$")
    public void user_click_on_the_login_link() throws Exception {
        loginPage = homePage.clickLoginButton();
    }

    @When("^enter username and password:\"([^\"]*)\",\"([^\"]*)\"$")
    public void enter_username_and_password(String userName, String password) throws Exception {
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
    }

    @When("^Click on SignIn Button$")
    public void click_on_SignIn_Button() throws Exception {
        loggedInHomePage = loginPage.clickSignInButton();
    }

    @Then("^Assert user logged in Successfully:\"([^\"]*)\"$")
    public void assert_user_logged_in_Successfully(String loggedInUser) throws Exception {
        String user = loggedInHomePage.getLoggedInUser();
        Assert.assertEquals(loggedInUser,user);
        System.out.println("User logged In Successfully");
    }
}
