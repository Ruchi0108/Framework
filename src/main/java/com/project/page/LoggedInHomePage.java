package com.project.page;

import com.project.helpers.DriverManager;
import com.project.object.LoggedInHomePage_OR;
import com.sun.tools.javac.util.Assert;
import jdk.nashorn.internal.runtime.ECMAException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class LoggedInHomePage extends LoggedInHomePage_OR {

    static String mainArticleText;

    WebDriver driver;
    DriverManager driverManager;

    LoggedInHomePage(WebDriver driver) {
        this.driver = driver;
        driverManager = DriverManager.getDriverManagerInstance();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        try {
            if (logoutLink.getText().equalsIgnoreCase("LOGOUT")) {
                System.out.println("User Logged in Successfully");
            }
        } catch (WebDriverException e) {
            throw new IllegalStateException("User not logged In." + e.getMessage());
        }
    }

    public String getLoggedInUser() {
        String user = loggedInUserName.getText();
        return user;
    }

    public MediaPage clickMainArticle() {
        try {
            mainArticleLink.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new MediaPage(driver);
    }

    public String getMainArticleHeading() {
        mainArticleText = mainArticleLink.getAttribute("title");
        return mainArticleText;
    }

    public boolean isImagePresent() {
        String imageLink = null;
        try {
            imageLink = imageSrcLink.getAttribute("src");

        } catch (Exception e) {
            e.printStackTrace();

        }
        if (imageLink != null) {
            return true;
        } else {
            return false;
        }
    }

    public void clickLogout(){
        logoutLink.click();
    }

}
