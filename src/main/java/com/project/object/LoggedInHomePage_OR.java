package com.project.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInHomePage_OR {

    @FindBy(xpath="//li[contains(@class,'user')]/a")
    protected WebElement loggedInUserName;

    @FindBy(xpath = "//li[contains(@class,'logout')]")
    protected WebElement logoutLink;

    @FindBy(xpath = "//div[contains(@class,'featured-story')]//div[contains(@class,'id-topstory')]//a[contains(@class,'block-link')]")
    protected WebElement mainArticleLink;

    @FindBy(xpath = "//div[contains(@class,'featured-story')]//div[contains(@class,'id-topstory')]//div[contains(@class,'file-image-jpeg')]//img")
    protected WebElement imageSrcLink;

}
