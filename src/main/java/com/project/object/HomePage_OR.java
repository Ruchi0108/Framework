package com.project.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_OR {

    @FindBy (xpath = "//div/a/span[contains(text(), 'Skip')]")
    protected WebElement skipAd;

    @FindBy (xpath = "//li[contains(@class,'login')]/a")
    protected WebElement loginButton;

    @FindBy (xpath = "//iframe[contains(@id,'google_osd') and contains(@name,'google_osd')]/following::div/iframe | //iframe[contains(@allow,'autoplay') and contains(@name,'expand')]")
    protected WebElement iFrameElementForAd;

    @FindBy (xpath = "//div[contains(@class,'celtra-screen')]//div[contains(@style,'close-btn')]/following::div | //button[contains(@id,'close-button')]")
    protected WebElement closeAd;

    @FindBy(xpath = "//div[contains(@class,'featured-story')]//div[contains(@class,'id-topstory')]//a[contains(@class,'block-link')]")
    protected WebElement mainArticleLink;

    @FindBy(xpath = "//div[contains(@class,'featured-story')]//div[contains(@class,'id-topstory')]//div[contains(@class,'file-image-jpeg')]//img")
    protected WebElement imageSrcLink;
}
