package com.project.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_OR {

    @FindBy(xpath="//input[contains(@id,'username')]")
    protected WebElement userNameField;

    @FindBy(xpath="//input[contains(@id,'password')]")
    protected WebElement passwordField;

    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    protected WebElement submitButton;

    @FindBy(xpath="//h3[contains(text(),'Login')]")
    protected WebElement loginPageText;


}
