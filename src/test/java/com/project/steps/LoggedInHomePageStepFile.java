package com.project.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoggedInHomePageStepFile extends BaseSteps {

    @Given("^User is Logged In$")
    public void user_is_Logged_In() throws Exception {
        System.out.println("User is logged in as : "+loggedInHomePage.getLoggedInUser());
    }

    @Then("^Check main article is present on Logged In Home Page$")
    public void check_main_article_is_present_on_Logged_In_Home_Page() throws Exception {
        String mainArticleText = loggedInHomePage.getMainArticleHeading();
        Assert.assertTrue(mainArticleText!=null);
        System.out.println("The Main Article has heading :"+ mainArticleText );
    }

    @Then("^Main article has Image$")
    public void main_article_has_Image() throws Exception {
        Assert.assertTrue(loggedInHomePage.isImagePresent());
    }
}
