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

    public void clickLogout(){
        logoutLink.click();
    }

}
