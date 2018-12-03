package com.project.steps;

import com.project.helpers.DriverManager;
import com.project.page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageStepFile extends BaseSteps {


    @Given("^I open browser: \"([^\"]*)\"$")
    public void i_open_browser(String browser) {
        driverManager = DriverManager.getDriverManagerInstance();
        driverManager.openWebDriver(browser);
        driverManager.maximizeWindow();
    }

    @When("^I open url: \"([^\"]*)\"$")
    public void i_open_url(String url) {
        driverManager.openUrl(url);
        homePage = new HomePage(driverManager.getDriver());
    }

    @When("^I skip the Add$")
    public void i_skip_the_Add() throws Exception {
        homePage.closeAdContainer();
        System.out.println("Add displaying is closed");
    }

    @Then("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Exception {
        String text = homePage.getLoginLinkText();
        Assert.assertTrue(text.equalsIgnoreCase("Login"));
        System.out.println("User is on HomePage");
    }

    @Then("^Verify main article has Image$")
    public void main_article_has_Image() {
        Assert.assertTrue(homePage.isImagePresent());
    }

    @Then("^Verify main article in the media page has Image$")
    public void main_article_has_Image_in_media_page() {
        Assert.assertTrue(mediaPage.isImagePresent());
    }

    @Then("^User clicks on the main article and validate the main article media page$")
    public void navigate_to_main_article() {
        mediaPage = homePage.clickOnMainArticle();
    }
}
