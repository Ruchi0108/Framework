package com.project.steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoggedInHomePageStepFile extends BaseSteps {

    @Then("^Assert user logged in successfully: \"([^\"]*)\"$")
    public void assert_user_logged_in_Successfully(String loggedInUser) throws Exception {
        String user = loggedInHomePage.getLoggedInUser();
        Assert.assertEquals(loggedInUser,user);
        System.out.println("User logged In Successfully");
    }

}
