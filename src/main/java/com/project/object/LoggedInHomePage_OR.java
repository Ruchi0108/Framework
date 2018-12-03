package com.project.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInHomePage_OR {

    @FindBy(xpath="//li[contains(@class,'user')]/a")
    protected WebElement loggedInUserName;

    @FindBy(xpath = "//li[contains(@class,'logout')]")
    protected WebElement logoutLink;
}
