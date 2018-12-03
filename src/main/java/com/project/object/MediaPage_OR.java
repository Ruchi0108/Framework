package com.project.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MediaPage_OR {

    @FindBy(xpath="//figure[@itemprop='image']//img")
    protected WebElement imageLinkInMediaPage;
}
