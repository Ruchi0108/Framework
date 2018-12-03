package com.project.page;

import com.project.helpers.DriverManager;
import com.project.object.LoginPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class LoginPage extends LoginPage_OR {

    private WebDriver driver;
    private DriverManager driverManager;

    static final String USERNAME="digitaltest2";

    LoginPage(WebDriver driver) {
        this.driver = driver;
        driverManager = DriverManager.getDriverManagerInstance();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        try {
            if (loginPageText.getText().equalsIgnoreCase("Login with mySPH")) {
                System.out.println("User is on Login Page");

            }
        } catch (WebDriverException e) {
            throw new IllegalStateException("This is not the Login Page." + e.getMessage());
        }

    }

    public void enterUsername(String userName) {
        userNameField.sendKeys(userName);

    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);

    }

    public LoggedInHomePage clickSignInButton() {
        try {
            submitButton.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new LoggedInHomePage(driver);
    }

}
