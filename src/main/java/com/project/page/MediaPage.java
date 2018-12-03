package com.project.page;

import com.project.helpers.DriverManager;
import com.project.object.MediaPage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MediaPage  extends MediaPage_OR {

    private WebDriver driver;
    private DriverManager driverManager;

    MediaPage(WebDriver driver, String title){
        this.driver = driver;

        driverManager = DriverManager.getDriverManagerInstance();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        try {
            if (driverManager.getWindowTitle().toLowerCase().contains(title.trim().toLowerCase())) {
                System.out.println("Media page is loaded.");
            }
        } catch (WebDriverException e) {
            throw new IllegalStateException("This is not the Media Page for the main article." + e.getMessage());
        }
    }

    public boolean isImagePresent() {
        String imageLink = null;
        try {
            imageLink = imageLinkInMediaPage.getAttribute("src");
        } catch (WebDriverException e) {
            e.printStackTrace();

        }
        return imageLink != null;
    }
}
