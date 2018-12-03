package com.project.page;

import com.project.helpers.DriverManager;
import com.project.object.HomePage_OR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends HomePage_OR {

    private WebDriver driver;
    private DriverManager driverManager;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        driverManager = DriverManager.getDriverManagerInstance();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        try
        {
            if(getLoginLinkText().equalsIgnoreCase("LOGIN")){
                System.out.println("User is on Home Page");
            }
        }catch(WebDriverException e){
            throw new IllegalStateException("This is not the home Page. Exception occur is : "+e.getMessage() );
        }
    }

    public boolean closeAdContainer() throws Exception {
        try {
            driverManager.switchToIframeElement(iFrameElementForAd);
            closeAd.click();
            driverManager.switchToDefaultContent();
        } catch (Exception e) {
            throw e;
        }
        return true;
    }

    public boolean skipAdOnPage() {
        try {
           skipAd.click();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public LoginPage clickLoginButton(){
        try{
            driverManager.javascriptClick(loginButton);
        } catch (Exception e){
            e.printStackTrace();

        }
        return new LoginPage(driver);
    }

    public MediaPage clickOnMainArticle() {

        String mainArticleText = null;
        try {
            mainArticleText = mainArticleLink.getAttribute("title");
            driverManager.javascriptClick(mainArticleLink);

        } catch (WebDriverException e) {
            throw new IllegalStateException("Main article did not show up as expected.");
        }
        return new MediaPage(driver, mainArticleText);
    }

    public String getLoginLinkText(){
       return loginButton.getText();
    }

    public boolean isImagePresent() {
        String imageLink = null;
        try {
            imageLink = imageSrcLink.getAttribute("src");
        } catch (WebDriverException e) {
            e.printStackTrace();

        }
        return imageLink != null;
    }
}
